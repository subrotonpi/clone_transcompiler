public static String input ( int sx , int sy , int tx , int ty ) {
  int x = tx - sx ;
  int y = ty - sy ;
  String r1 = "R" + "U" + "L" + "D" + "R" ;
  String r2 = "L" + "D" + "R" + "U" + "L" ;
  String r4 = "U" + "L" + "D" + "R" ;
  String ans = r1 + r2 + r3 + r4 ;
  System . out . println ( ans ) ;
  return ans ;
}
