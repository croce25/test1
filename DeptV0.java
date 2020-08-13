package book.ch5;

//틀을 짜두고 그 틀에 업무에 대한 코딩만 하게 한다.
public class DeptV0 { //VO Value Object의 약자
	private int		deptno 	= 0; //private 선언하면 선언된 클래스안에서만 사용가능.
	private String 	dname 	= null;//클래스는 선언시 초기값은 null이다.
	private String  loc 	= null;

	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
		
	}


