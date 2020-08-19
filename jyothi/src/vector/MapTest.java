package vector;
    import java.util.HashMap;
	import java.util.Iterator;
	import java.util.LinkedHashMap;
	import java.util.Map;
	import java.util.Set;
	import java.util.TreeMap;

	class CricketPlayer  {
		private int jerseyNo;
		private String name;

		public CricketPlayer(int jerseyNo, String name) {
			this.jerseyNo = jerseyNo;
			this.name = name;
		}

		public int getJerseyNo() {
			return jerseyNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + jerseyNo;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CricketPlayer other = (CricketPlayer) obj;
			if (jerseyNo != other.jerseyNo)
				return false;
			return true;
		}
	}

	public class MapTest {
		public static void main(String args[]) {
			HashMap<Integer, CricketPlayer> cricketers1 = new HashMap<Integer, CricketPlayer>();
			cricketers1.put(7, new CricketPlayer(7, "Dhoni"));
			cricketers1.put(10, new CricketPlayer(10, "Sachin"));
			cricketers1.put(18, new CricketPlayer(18, "Kohli"));
			cricketers1.put(3, new CricketPlayer(3, "Raina"));
			cricketers1.put(12, new CricketPlayer(12, "Yuvraj"));
			cricketers1.put(17, new CricketPlayer(17, "Rahane"));
			cricketers1.put(45, new CricketPlayer(45, "Rohit"));

			LinkedHashMap<Integer, CricketPlayer> cricketers2 = new LinkedHashMap<Integer, CricketPlayer>();
			cricketers2.put(7, new CricketPlayer(7, "Dhoni"));
			cricketers2.put(10, new CricketPlayer(10, "Sachin"));
			cricketers2.put(18, new CricketPlayer(18, "Kohli"));
			cricketers2.put(3, new CricketPlayer(3, "Raina"));
			cricketers2.put(12, new CricketPlayer(12, "Yuvraj"));
			cricketers2.put(17, new CricketPlayer(17, "Rahane"));
			cricketers2.put(45, new CricketPlayer(45, "Rohit"));

			TreeMap<Integer, CricketPlayer> cricketers3 = new TreeMap<Integer, CricketPlayer>(cricketers1);

			System.out.println("All Players In HashMap");
			displayCricketer(cricketers1);
			System.out.println("All Players In LinkedHashMap");
			displayCricketer(cricketers2);
			System.out.println("All Players In TreeMap");
			displayCricketer(cricketers3);
		}

		private static void displayCricketer(Map<Integer, CricketPlayer> cricketers) {
			Set<Integer> jerseys = cricketers.keySet();

			Iterator<Integer> jerseyNos = jerseys.iterator();

			while (jerseyNos.hasNext()) {
				CricketPlayer cp = cricketers.get(jerseyNos.next());
				System.out.println("Jersey No:  " + cp.getJerseyNo() + "   Name: "+ cp.getName());
	
			}
			System.out.println();
		
		
	}


	}



