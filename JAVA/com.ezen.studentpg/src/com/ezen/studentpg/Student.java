package com.ezen.studentpg;

public class Student {
	String name;
	int	kor;
	int eng;
	int mat;
	int ger;
	
	public void	  setName(String name) 	{this.name = name;}
	public String getName() 		   	{return name;}
	public void   setEng(int eng) 	   	{this.eng = eng;}
	public int    getEng() 				{return eng;}
	public void   setMat(int mat) 		{this.mat = mat;}
	public int    getMat() 				{return mat;}
	public void   setGer(int ger) 		{this.ger = ger;}
	public int    getGer() 				{return ger;}
	
	
	public void	  setTwo(String name, int eng) {
		this.name = name;
		this.eng = eng;
	}
	public void	  getTwo(String name, int eng) {
		name = this.name;
		eng = this.eng;
	}
	
	public void	  setThr(String name, int eng, int mat) {
		this.name = name;
		this.eng = eng;
		this.mat = mat;
	}
	public void	  getThr(String name, int eng, int mat) {
		name = this.name;
		eng = this.eng;
		mat = this.mat; 
	}
	public void	  setAll(String name, int eng, int mat, int ger) {
		this.name = name;
		this.eng = eng;
		this.mat = mat;
		this.ger = ger;
	}
	public void	  getAll(String name, int eng, int mat, int ger) {
		name = this.name;
		eng = this.eng;
		mat = this.mat;
		ger = this.ger;
	}
}
