package class__;

import java.util.ArrayList;

class Fruit {
	private String pum = "";
	private int jan = 0;
	private int feb = 0;
	private int mar = 0;
	private int tot = 0;
	private static int sumJan = 0;
	private static int sumFeb = 0;
	private static int sumMar = 0;

	public Fruit(String p, int j, int f, int m) {
		this.pum = p;
		this.jan = j;
		this.feb = f;
		this.mar = m;
	}

	public void calcTot() {
		tot = (jan + feb + mar);
	}

	public void display() {
		System.out.print(getPum() + "\t");
		System.out.print(getJan() + "\t");
		System.out.print(getFeb() + "\t");
		System.out.print(getMar() + "\t");
		System.out.print(getTot() + "\t");
		sumJan += getJan();
		sumFeb += getFeb();
		sumMar += getMar();
		System.out.println();
	}

	public static void output() {
		System.out.println("-----------------------------------");
		System.out.print("\t" + sumJan + "\t" + sumFeb + "\t" + sumMar + "\t");
	}

	public String getPum() {
		return pum;
	}

	public int getJan() {
		return jan;
	}

	public int getFeb() {
		return feb;
	}

	public int getMar() {
		return mar;
	}

	public int getTot() {
		return tot;
	}

	public int getSumJan() {
		return sumJan;
	}

	public int getSumFeb() {
		return sumFeb;
	}

	public int getSumMar() {
		return sumMar;
	}

}

public class FruitMain {

	public static void main(String[] args) {
		Fruit[] fruit = new Fruit[3];
		fruit[0] = new Fruit("사과", 100, 80, 75);
		fruit[0].calcTot();
		fruit[1] = new Fruit("포도", 30, 25, 10);
		fruit[1].calcTot();
		fruit[2] = new Fruit("딸기", 25, 30, 90);
		fruit[2].calcTot();
		System.out.println("-----------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("-----------------------------------");
		for (int i = 0; i < fruit.length; i++) {
			fruit[i].display();
		}
		Fruit.output();
	}
}

/*
 * 과일 판매량 구하기 월별 매출합계도 구하시오 스캐너 x 데이터 그대로 넣기 객체 배열 사용
 * 
 * 클래스 : Fruit 필드 : pum, jan, feb, mar, tot 합계 : sumJan, sumFeb, sumMar
 * 
 * 메소드 : 생성자(품명, 1월, 2월, 3월) calcTot() display() public static void output()
 * 
 * 클래스 : FruitMain
 * 
 * [실행결과] 
 * ---------------------------------
 *  PUM JAN FEB MAR TOT
 * --------------------------------- 
 *  사과 100 80 75 255
 *  포도 30 25 10 65 
 *  딸기 25 30 90 145 
 *  --------------------------------- 
 *  155 135 175 
 *  output()로 처리
 * 
 */