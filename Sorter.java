import java.util.Scanner;

public class Sorter {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Names or 5 Numbers");
		
		String[] list = new String[5];
		for(int i = 0; i < 5; i++) {
			list[i] = sc.nextLine();
		}
		
		list = sort(list);
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
	}
	
	public static String[] sort(String[] list) {
	
		
		for(int i = 0; i < list.length; i++) {
			for(int j = i + 1; j < list.length; j++) {
				if(list[i].toLowerCase().charAt(0) > list[j].toLowerCase().charAt(0)) {
					String temp_item = list[i];
					list[i] = list[j];
					list[j] = temp_item;
				}
			}
		}
		
		return list;
	}
}
