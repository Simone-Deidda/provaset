package it.prova.provaset.test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		Set<String> insiemeColoriHS = new HashSet<String>();
		System.out.println("HashSet:");
		inizializzaEStampaColori(insiemeColoriHS);

		System.out.println("Aggiungo un colore già esistente: HashSet non ammette dupplicati");
		aggiungiColore("Rosso", insiemeColoriHS);
		stampaColori(insiemeColoriHS);
		
		// ------------------------------------------------
		
		System.out.println("TreeSet:");
		Set<String> insiemeColoriTS = new TreeSet<String>();
		System.out.println("TreeSet:");
		inizializzaEStampaColori(insiemeColoriTS);
		
		System.out.println("Aggiungo un colore già esistente: TreeSet non ammette dupplicati");
		aggiungiColore("Blu", insiemeColoriTS);
		stampaColori(insiemeColoriTS);
	}

	public static void inizializzaEStampaColori(Set<String> set) {
		set.add("Rosso");
		set.add("Verde");
		set.add("Blu");

		stampaColori(set);
	}

	public static void aggiungiColore(String colore, Set<String> set) {
		set.add(colore);
	}
	
	public static void stampaColori(Set<String> set) {
		for (String colore : set) {
			System.out.println(colore);
		}
	}
}
