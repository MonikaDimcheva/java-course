
import java.util.ArrayList;

public class CompanyMain {

	public static void main(String[] args) {
		
		
		ArrayList<Company> comp=new ArrayList<Company>(3);
	
		Company companyOne=new Company("Hogwarts","Bulgaria",55,"www.companyone.com");
		Company companyTwo=new Company("ABM","Asia",100,"www.companytwo.com");
		Company companyThree=new Company("WhatElseWhy","Germany",200,"www.companythree.com");
		
		comp.add(companyOne);
		comp.add(companyTwo);
		comp.add(companyThree);
		
		
		System.out.println("\nCompany one is: "+companyOne);
		System.out.println("Company two is: "+companyTwo);
		System.out.println("Company three is: "+companyThree);
		System.out.println();
		
		for(int i=0; i<comp.size(); i++){
			System.out.println(comp.get(i).getName()+","+comp.get(i).getAdress()+
					","+comp.get(i).getNumberOfWorkers()+","+comp.get(i).getWebpage());
		}
		
		
		System.out.println();
		System.out.println("Now we gonna remove the company with max number of workers!\n");
		
		if(comp.get(0).getNumberOfWorkers()>comp.get(1).getNumberOfWorkers() && comp.get(0).getNumberOfWorkers()>comp.get(2).getNumberOfWorkers()){
			comp.remove(comp.get(0));
		} else if(comp.get(1).getNumberOfWorkers()>comp.get(0).getNumberOfWorkers() && comp.get(1).getNumberOfWorkers()>comp.get(2).getNumberOfWorkers()){
	        comp.remove(comp.get(1));
		}else{
		    comp.remove(comp.get(2));
	    }
		
	   System.out.println(comp);
	   Company companyFour=new Company("IT","France",5000,"www.companyfour.com");
	   Company companyFive=new Company("WhereAllThePartyPeopleAt","Italy",40,"www.companyfive.com");
	   Company companySix=new Company("WhySo","America",10000,"www.companysix.com");
	   
	   System.out.println("Adding two companies!\n");
	  
	   comp.add(companyFour);
	   comp.add(companyFive);
	   
	   for(int i=0; i<comp.size(); i++){
			System.out.println(comp.get(i).getName()+","+comp.get(i).getAdress()+
					","+comp.get(i).getNumberOfWorkers()+","+comp.get(i).getWebpage());
		}
	   
	   System.out.println("\n"+comp);
	   System.out.print("Replacing the company with the longest name with another company!\n");
	   System.out.println("The new company is: "+companySix);
	   
		for(int m=0;m<comp.size();m++){
			for(int j=0;j<m;j++){
				if(comp.get(m).getName().length()>comp.get(j).getName().length()){
					comp.set(m, companySix);
				}
			}
		}
		 
		
	  System.out.println(comp);
	}
	
		
	}
	


