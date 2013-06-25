package student.sessionbeans.ejb;

import java.util.Date;

import javax.ejb.Local;

@Local
public interface DiaryLocal {
	public abstract void init(String name, String location);

	public abstract void addEntry(Date date, String entry);

	public abstract String getEntry(Date date);

	public abstract void removeEntry(Date date);
}
