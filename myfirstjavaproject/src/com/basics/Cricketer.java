package com.basics;

public class Cricketer {
	
	static String name ="MI";
	
	String pname;
	int runs;
	String battertype;
	static String teamname="RCB";
	

	void main() {
		Cricketer cric = new Cricketer();
		System.out.println("team name:"+name);
		
		cric.pname="Mahendra";
		cric.runs=132;
		cric.battertype ="left";
		System.out.println("player name:"+cric.pname);
		System.out.println("player scored runs:"+cric.runs);
		System.out.println("player batting type:"+cric.battertype);
		Cricketer cric1 = new Cricketer();
		System.out.println("team name:"+name);
		
		cric1.pname="Ram Charan";
		cric1.runs=100;
		cric1.battertype ="Right";
		System.out.println("player name:"+cric1.pname);
		System.out.println("player scored runs:"+cric1.runs);
		System.out.println("player batting type:"+cric1.battertype);
		Cricketer cric2 = new Cricketer();
		System.out.println("team name:"+name);
		
		cric2.pname="Varshik";
		cric2.runs=0;
		cric2.battertype ="Right";
		System.out.println("player name:"+cric2.pname);
		System.out.println("player scored runs:"+cric2.runs);
		System.out.println("player batting type:"+cric2.battertype);
		
		Cricketer cri = new Cricketer();
		System.out.println("team name:"+teamname);
		
		cri.pname="Vasanth";
		cri.runs=330;
		cri.battertype ="left";
		System.out.println("player name:"+cri.pname);
		System.out.println("player scored runs:"+cri.runs);
		System.out.println("player batting type:"+cri.battertype);
		
	}
	static {
        System.out.println("These all the given information is about the cricket player");
}
	{
		System.out.println("****************Player Details*************");
	}
}
