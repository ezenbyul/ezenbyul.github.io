//package com.ezen.student;
//import com.ezen.studentpg.Student;
//public class StudnetPackage {
//
//	public static void main (String agrs) {
//		// 1. 라이브러리 - jar를 생성
//		// 2-1. import com.ezen.studentpg.*; 를 호출
//		// 2-2. com.ezen.studentpg.Student st1 = new com.ezen.studentpg.Student() 형식으로 직접 호출
//
//		// jar 파일 생성
//		// [Package Explorer]에서 해당 프로젝트를 선택
//		// 우클릭 -> [Export] -> [JAVA - > JAR File] 선택 후
//		// 패키지 이름과 동일하게 jar 파일명을 입력 & 경로 선택후 JAR File 생성
//		
//		// jar 파일 생성 후 호출
//		// [Package Explorer] 에서 불러올 위치의 프로젝트 선택
//		// 우클릭 -> [Build Path - > Configure Build Path...] 선택
//		// 상단에 있는 [Libraries] 탭 선택
//		// 우측에 있는 [Add External jars..]을 누른후 원하는 JAR 파일 선택
//		// 파일을 선택 할 경우 불러올 위치의 프로젝트에 [Referenced Libraries]가 생성됨을 확인 가능
//		// 그 안을 확인할 경우 불러온 JAR 파일 안에 package와 class가 불러옴을 확인 할수 있다.
//		// 사용하고자 하는 클래스를 도큐먼트창[입력창]으로 드래그
//		// 화면이 나올 경우 [Attach Source] 버튼을 눌러 소스를 연결시킨다.
//		// [Workspace location]이 나오면 [Path [불러올 위치(Project)]]
//		
//		
//		// 이 방법은 외부에있는 로컬jar을 사용하는것인데(절대경로) 
//		// 이 방법의 문제점은 프로젝트에 jar파일이 포함되지않고
//		// 그로 인하여 다른 컴퓨터 환경에서는 못쓸 수 있다는 것이다. 
//		// 따라서 해당프로젝트를 복사해서 다른컴퓨터에서 작업할 경우
//		// jar파일이 없으므로 해당 소스는 컴파일이 되지 않는다. 
//		// 해결하려면 프로젝트안에 jar를 넣어서 상대경로로 jar를 접근하게 하는 것이다.
//		
//		// 그렇기에 jar 파일을 저장 할때 Project내에 [Folder]를 생성하여 그안에 jar을 저장
//		// 작은 프로그램(테스팅용)을 만들게 아니라면 jar파일은 항상 프로젝트내에 넣어두고 상대경로로 접근하는것이 옳다
//		
//		// C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext [JRE System Library 파일 경로]
//		// 시스템 경로에 jar을 추가 할 경우 Export 할 필요 없이 사용은 가능 하나 서로 충돌이 될수 있으니 주의
//		
//		Student st1 = new Student();
//		st1.name="최민석";
//		System.out.println(st1.name);
//		
//	}
//}
