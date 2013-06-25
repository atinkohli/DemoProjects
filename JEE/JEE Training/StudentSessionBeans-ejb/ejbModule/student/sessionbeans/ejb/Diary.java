package student.sessionbeans.ejb;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class Diary
 */
@Stateful(name="AKALocalDiary")
@LocalBean
public class Diary implements DiaryLocal {

	Map<Date,String> entries;
	private String name;
	private String location;
	
    /**
     * Default constructor. 
     */
    public Diary() {
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
	 * @see student.sessionbeans.ejb.DiaryLocal2#init(java.lang.String, java.lang.String)
	 */
    @Override
	public void init(String name, String location) {
    	this.name = name;
    	this.location = location;
    	
    	entries = new HashMap<Date, String>();
    }
    
    /* (non-Javadoc)
	 * @see student.sessionbeans.ejb.DiaryLocal2#addEntry(java.util.Date, java.lang.String)
	 */
    @Override
	public void addEntry(Date date, String entry) {
    	entries.put(date, entry);
    }
    
    /* (non-Javadoc)
	 * @see student.sessionbeans.ejb.DiaryLocal2#getEntry(java.util.Date)
	 */
    @Override
	public String getEntry(Date date) {
    	return entries.get(date);
    }
    
    /* (non-Javadoc)
	 * @see student.sessionbeans.ejb.DiaryLocal2#removeEntry(java.util.Date)
	 */
    @Override
	public void removeEntry(Date date){
    	entries.remove(date);
    }
}
