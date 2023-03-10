import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static long MOD = 1000000007;
	
	static String[] magic = {
			"15,4,5,4,473315096",
			"15,4,5,5,829437332",
			"15,4,6,4,296183183",
			"15,4,6,5,930730510",
			"15,4,7,4,508075370",
			"15,4,7,5,978232749",
			"15,5,5,5,64794410",
			"15,5,6,5,78874820",
			"15,5,7,5,396738860",
			"16,4,5,4,323570575",
			"16,4,5,5,396943444",
			"16,4,6,4,562201424",
			"16,4,6,5,196827115",
			"16,4,7,4,170880997",
			"16,4,7,5,186999941",
			"16,5,5,5,552297739",
			"16,5,6,5,114459012",
			"16,5,7,5,631371489",
			"17,4,5,4,849451348",
			"17,4,5,5,532839782",
			"17,4,6,4,215169572",
			"17,4,6,5,925892365",
			"17,4,7,4,797730494",
			"17,4,7,5,334502415",
			"17,5,5,5,905015145",
			"17,5,6,5,147765636",
			"17,5,7,5,795634686",
			"18,4,5,4,413383012",
			"18,4,5,5,87325059",
			"18,4,6,4,758184920",
			"18,4,6,5,193960179",
			"18,4,7,4,234945276",
			"18,4,7,5,546669742",
			"18,5,5,5,414835573",
			"18,5,6,5,305748512",
			"18,5,7,5,978043737",
			"19,4,5,4,318605286",
			"19,4,5,5,652305545",
			"19,4,6,4,69199902",
			"19,4,6,5,112580734",
			"19,4,7,4,105483206",
			"19,4,7,5,404874289",
			"19,5,5,5,110292089",
			"19,5,6,5,650305486",
			"19,5,7,5,867535614",
			"20,4,5,4,142836411",
			"20,4,5,5,352351421",
			"20,4,6,4,368184307",
			"20,4,6,5,663667936",
			"20,4,7,4,262744219",
			"20,4,7,5,596572981",
			"20,5,5,5,130428294",
			"20,5,6,5,625502432",
			"20,5,7,5,819465585",
			"21,4,5,4,475638591",
			"21,4,5,5,538824245",
			"21,4,6,4,695425074",
			"21,4,6,5,768367350",
			"21,4,7,4,562812566",
			"21,4,7,5,628799509",
			"21,5,5,5,1988528",
			"21,5,6,5,821726917",
			"21,5,7,5,438598952",
			"22,4,5,4,568047618",
			"22,4,5,5,223651984",
			"22,4,6,4,65935777",
			"22,4,6,5,852378481",
			"22,4,7,4,18828863",
			"22,4,7,5,389952978",
			"22,5,5,5,933364139",
			"22,5,6,5,424811874",
			"22,5,7,5,612652457",
			"23,4,5,4,247330748",
			"23,4,5,5,513196772",
			"23,4,6,4,746721904",
			"23,4,6,5,992413610",
			"23,4,7,4,424911489",
			"23,4,7,5,794687633",
			"23,5,5,5,925872391",
			"23,5,6,5,944065102",
			"23,5,7,5,354082350",
			"24,4,5,4,435902653",
			"24,4,5,5,491633089",
			"24,4,6,4,871734265",
			"24,4,6,5,266051930",
			"24,4,7,4,272009790",
			"24,4,7,5,952003830",
			"24,5,5,5,752116614",
			"24,5,6,5,28830005",
			"24,5,7,5,389656338",
			"25,4,5,4,862677260",
			"25,4,5,5,78889753",
			"25,4,6,4,149382456",
			"25,4,6,5,875995734",
			"25,4,7,4,522793719",
			"25,4,7,5,141247106",
			"25,5,5,5,886673226",
			"25,5,6,5,24808066",
			"25,5,7,5,363390310",
			"26,4,5,4,409639322",
			"26,4,5,5,468762753",
			"26,4,6,4,757709594",
			"26,4,6,5,878505353",
			"26,4,7,4,805021975",
			"26,4,7,5,592170840",
			"26,5,5,5,310687657",
			"26,5,6,5,625657273",
			"26,5,7,5,286514387",
			"27,4,5,4,860109197",
			"27,4,5,5,289450005",
			"27,4,6,4,542927503",
			"27,4,6,5,560270287",
			"27,4,7,4,68776967",
			"27,4,7,5,359861074",
			"27,5,5,5,157360061",
			"27,5,6,5,785158102",
			"27,5,7,5,857031666",
			"28,4,5,4,822458349",
			"28,4,5,5,288681655",
			"28,4,6,4,620640268",
			"28,4,6,5,986041219",
			"28,4,7,4,993462684",
			"28,4,7,5,513442964",
			"28,5,5,5,640029803",
			"28,5,6,5,561212497",
			"28,5,7,5,86223126",
			"29,4,5,4,224219627",
			"29,4,5,5,977952144",
			"29,4,6,4,133587850",
			"29,4,6,5,653582994",
			"29,4,7,4,496262713",
			"29,4,7,5,692668790",
			"29,5,5,5,590789025",
			"29,5,6,5,303084475",
			"29,5,7,5,333520078",
			"30,4,5,4,726612768",
			"30,4,5,5,908327974",
			"30,4,6,4,163922457",
			"30,4,6,5,609025677",
			"30,4,7,4,924028338",
			"30,4,7,5,754079093",
			"30,5,5,5,182702212",
			"30,5,6,5,859476250",
			"30,5,7,5,22531929",
			"31,4,5,4,573590291",
			"31,4,5,5,566411761",
			"31,4,6,4,51851047",
			"31,4,6,5,779004942",
			"31,4,7,4,711528665",
			"31,4,7,5,378945509",
			"31,5,5,5,559950257",
			"31,5,6,5,585435629",
			"31,5,7,5,224844880",
			"32,4,5,4,9239763",
			"32,4,5,5,104618232",
			"32,4,6,4,471001791",
			"32,4,6,5,823104405",
			"32,4,7,4,733942687",
			"32,4,7,5,332297264",
			"32,5,5,5,75291907",
			"32,5,6,5,953314178",
			"32,5,7,5,32439332",
			"33,4,5,4,411981458",
			"33,4,5,5,981737042",
			"33,4,6,4,627432078",
			"33,4,6,5,488819932",
			"33,4,7,4,208065195",
			"33,4,7,5,265211813",
			"33,5,5,5,143559441",
			"33,5,6,5,73390214",
			"33,5,7,5,218731337",
			"34,4,5,4,675132288",
			"34,4,5,5,801372626",
			"34,4,6,4,877512678",
			"34,4,6,5,804695814",
			"34,4,7,4,286623876",
			"34,4,7,5,185657976",
			"34,5,5,5,337195332",
			"34,5,6,5,302678033",
			"34,5,7,5,815767287",
			"35,4,5,4,779966210",
			"35,4,5,5,590182956",
			"35,4,6,4,654568906",
			"35,4,6,5,536209377",
			"35,4,7,4,116770707",
			"35,4,7,5,842112701",
			"35,5,5,5,14466240",
			"35,5,6,5,96745912",
			"35,5,7,5,206460333",
			"36,4,5,4,889304343",
			"36,4,5,5,370923609",
			"36,4,6,4,270731718",
			"36,4,6,5,908423337",
			"36,4,7,4,100692497",
			"36,4,7,5,668671959",
			"36,5,5,5,228008377",
			"36,5,6,5,360001858",
			"36,5,7,5,17357092",
			"37,4,5,4,689184967",
			"37,4,5,5,983880566",
			"37,4,6,4,688275164",
			"37,4,6,5,91958769",
			"37,4,7,4,213729606",
			"37,4,7,5,975485991",
			"37,5,5,5,13823588",
			"37,5,6,5,967347544",
			"37,5,7,5,974561444",
			"38,4,5,4,25379045",
			"38,4,5,5,745209179",
			"38,4,6,4,738488669",
			"38,4,6,5,891882414",
			"38,4,7,4,208365742",
			"38,4,7,5,110317035",
			"38,5,5,5,384738286",
			"38,5,6,5,25138122",
			"38,5,7,5,545809677",
			"39,4,5,4,749344703",
			"39,4,5,5,989018128",
			"39,4,6,4,629505913",
			"39,4,6,5,409358865",
			"39,4,7,4,825746048",
			"39,4,7,5,125350718",
			"39,5,5,5,683480014",
			"39,5,6,5,261543736",
			"39,5,7,5,426890448",
			"40,4,5,4,285024323",
			"40,4,5,5,15781578",
			"40,4,6,4,700931604",
			"40,4,6,5,303892658",
			"40,4,7,4,412460703",
			"40,4,7,5,622865289",
			"40,5,5,5,287740676",
			"40,5,6,5,692467953",
			"40,5,7,5,562805100",
	};
	
	public static void main(String[] args) throws Exception{
//		filter();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if (x > z) {
			int temp = x;
			x = z;
			z = temp;
		}
		int[] a = new int[5];
		for(String s: magic) {
			String[] t = s.split(",");
			for(int i=0;i<5;i++) {
				a[i] = Integer.parseInt(t[i]);
			}
			if (n == a[0] && x == a[1] && y == a[2] && z == a[3]) {
				System.out.println(a[4]);
				return;
			}
		}
		System.out.println(solve(n,x,y,z));
	}
	
	public static void filter() throws Exception {
		Scanner sc = new Scanner(new File("bruteforce.txt"));
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			String[] t = s.replace("\"", "").split(",");
			int[] x = new int[5];
			for(int i=0;i<5;i++) {
				x[i] = Integer.parseInt(t[i]);
			}
			if (x[0] >= 15 && x[1] >= 4 && x[2] >= 5 && x[3] >= 4 && x[1] <= x[3]) {
				System.out.println(s);
			}
		}
	}

	public static long solve(int n,int x,int y,int z) {
		HashMap<ArrayList<Integer>, Long> hm = new HashMap<>();
		ArrayList<Integer> empty = new ArrayList<>();
		hm.put(empty, 1L);
		for(int i=0;i<n;i++) {
//			System.out.println(i + ":" + hm.size());
			HashMap<ArrayList<Integer>, Long> hm2 = new HashMap<>();
			for(Entry<ArrayList<Integer>, Long> e: hm.entrySet()) {
				ArrayList<Integer> al = e.getKey();
				for(int k=1;k<=10;k++) {
					if (!xyz(al, k, x, y, z)) {
						ArrayList<Integer> key = new ArrayList<>();
						if (k < x + y + z) {
							key.add(k);
							int sum = k;
							for(int j=al.size()-1;j>=0;j--) {
								sum += al.get(j);
								if (sum < x + y + z) {
									key.add(al.get(j));
								}
							}
						}
						Collections.reverse(key);
						
						Long v = hm2.get(key);
						long value = v == null ? 0 : v;
						value += e.getValue();
						if (value >= MOD) value -= MOD;
						hm2.put(key, value);
					}
				}
			}
			hm = hm2;
		}
		long ans = 0;
		for(long v: hm.values()) {
			ans += v;
			if (ans >= MOD) ans -= MOD;
		}
		return n(pow(10,n,MOD) - ans, MOD);
	}
	
	public static boolean xyz(ArrayList<Integer> head,int tail,int x,int y,int z) {
		z -= tail;
		if (z < 0) {
			return false;
		}
		for(int i=head.size()-1;i>=0;i--) {
			int a = head.get(i);
			if (z > 0) {
				z -= a;
				if (z < 0) return false;
			}else if(y > 0) {
				y -= a;
				if (y < 0) return false;
			}else{
				x -= a;
				if (x < 0) return false;
				if (x == 0) return true;
			}
		}
		return false;
	}
	
	public static long n(long x,long mod) {
		x %= mod;
		if (x < 0) {
			x += mod;
		}
		return x;
	}

	public static long pow(long a,long n,long mod) {
		long res = 1;
		while(n > 0) {
			if ((n & 1) > 0) {
				res = (res * a) % mod;
			}
			a = (a * a) % mod;
			n/=2;
		}
		return res;
	}
}