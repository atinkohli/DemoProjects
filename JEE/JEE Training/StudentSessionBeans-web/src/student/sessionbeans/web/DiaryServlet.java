package student.sessionbeans.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.sessionbeans.ejb.DiaryLocal;

@WebServlet("/DiaryServlet")
public class DiaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DiaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		try {
			InitialContext context = new InitialContext();
			DiaryLocal bean = (DiaryLocal)context.lookup("java:app/StudentSessionBeans-ejb/AKALocalDiary!student.sessionbeans.ejb.DiaryLocal");
			
			bean.init("Atin", "Athlone");
			Calendar date1 = Calendar.getInstance();
			date1.set(2013, 4,15,9,00);
			bean.addEntry(date1.getTime(),"Do Training");
			
			out.print("Entry in Diary = " + bean.getEntry(date1.getTime()));
			
		}catch(Exception exp) {
			out.print("Exception : " + exp.getLocalizedMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
