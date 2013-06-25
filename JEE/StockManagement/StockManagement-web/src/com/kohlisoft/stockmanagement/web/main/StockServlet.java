package com.kohlisoft.stockmanagement.web.main;

import java.io.IOException;

import javax.naming.InitialContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kohlisoft.stockmanagement.ejb.main.StockManagementServiceLocal;
import com.kohlisoft.stockmanagement.jpa.domain.LocalStock;
import com.kohlisoft.stockmanagement.jpa.domain.MainStock;


@WebServlet("/StockServlet")
public class StockServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//PrintWriter out = response.getWriter();
		
		try {
			InitialContext context = new InitialContext();
			StockManagementServiceLocal sml = (StockManagementServiceLocal)context.lookup("java:app/StockManagement-ejb/StockManagementService!com.kohlisoft.stockmanagement.ejb.main.StockManagementServiceLocal");
			
			if(request.getParameter("addStock") != null ) {
				String itemName = request.getParameter("itemName");
				int stock = Integer.parseInt(request.getParameter("stockCount"));
				sml.addStock(itemName, stock);
				request.setAttribute("statusMessage","Stock Added to DB");
			} else if(request.getParameter("viewStock") != null) {
				StringBuffer resp= new StringBuffer();
				
				for(MainStock item : sml.getCompleteStockList()){
					resp.append("</br>SNo = " + item.getItemCode() + " -- " + item.getItemName() + " -- " + item.getStockCount());
					for(LocalStock ls : item.getLocalStock()){
						resp.append("</br> &nbsp;&nbsp; LSNo = " + ls.getLocalId() + " -- " + ls.getLocationName() + " -- " + ls.getLocalStockCount());
					}
					resp.append("</br>");
				}
				request.setAttribute("statusMessage",resp.toString());
			} else if(request.getParameter("moveStock") != null ) {
				String itemToMove = request.getParameter("itemToMove");
				String moveTo = request.getParameter("location");
				int quantity = Integer.parseInt(request.getParameter("quantity"));
				
				sml.moveStock(itemToMove, quantity, moveTo);
				request.setAttribute("statusMessage","Stock Moved to Local Stock");
			}
			
			String homeURL = response.encodeURL("home.jsp");
	        RequestDispatcher rd = request.getRequestDispatcher(homeURL);
	        rd.forward(request, response);
			
		}catch(Exception exp) {
			throw new ServletException("Exception : " + exp.getLocalizedMessage());
		}
	}

}
