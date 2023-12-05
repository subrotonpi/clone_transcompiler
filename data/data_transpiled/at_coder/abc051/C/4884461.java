public static void print ( int sx , int sy , int tx , int ty ) {
  int dx = tx - sx ;
  int dy = ty - sy ;
  String ans = "" ;
  ans = ans + "U" + dy ;
  ans = ans + "R" + dx ;
  ans = ans + "D" + dy ;
  ans = ans + "L" + "U" ;
  System . out . println ( ans ) ;
}
