public class Sorter {
	public static void main (String[] args) {
		String[] names = {
				"Michael",
				"Terry",
				"Serina",
				"Olson",
				"Norwell"
		};
		
		names = sort_names(names);
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
	}
	
	public static String[] sort_names(String[] names) {
	
		
		for(int i = 0; i < names.length; i++) {
			for(int j = i + 1; j < names.length; j++) {
				if(names[i].toLowerCase().charAt(0) > names[j].toLowerCase().charAt(0)) {
					String t_name = names[i];
					names[i] = names[j];
					names[j] = t_name;
				}
			}
		}
		
		return names;
	}
}
