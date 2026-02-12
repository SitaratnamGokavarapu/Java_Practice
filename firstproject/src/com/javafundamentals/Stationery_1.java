package com.javafundamentals;

public class Stationery_1 {
	static int raw_material_cost=18000;
	static int labour_cost=12000;
	static int factory_Overhead=6000;
	static int Package_cost=3000;
	static int m_d=4000;
	double wastage() {
		double wastage = (raw_material_cost*0.05);
		double scrap=(raw_material_cost*0.02);
		double total_raw_material=raw_material_cost+wastage-scrap;
		System.out.println(wastage);
		System.out.println(scrap);
		return total_raw_material;
	}
	double Net_Cost(){
		double NetCost=wastage()+labour_cost+ factory_Overhead+Package_cost+m_d;
		double cost_of_1pen=NetCost/2000;
		System.out.println("Cost of Single pen: "+ cost_of_1pen);
		return NetCost;
	}
	
	public static void main(String[] args) {
		Stationery_1 s=new Stationery_1();
		s.Net_Cost();
	}

}
