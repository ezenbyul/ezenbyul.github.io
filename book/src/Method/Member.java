package Method;

public class Member {
//	String Filed_name(String name) {
//		return name;		
//	}
//	String Filed_id(String id) {
//		return id;
//	}
//	String Filed_pwd(String pwd) {
//		return pwd;
//	}
//	int Filed_age(int age) {
//		return age;
//	}
	
	String name;
	String id;
	String pwd;
	int age;
	Member(){
		this.name = "none";
		this.id = "none";
		this.pwd = "none";
		this.age = 0;
		}
	Member(String name,String id){
		this.name=name;
		this.id=id;
//		this.pwd = "none";
//		this.age = 0;
	}
}
