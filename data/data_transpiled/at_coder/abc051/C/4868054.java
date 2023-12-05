public static void print ( int sx , int sy , int tx , int ty ) {
  int dx = tx - sx ;
  int dy = ty - sy ;
  String ans = "U" + dy + "R" + dx ;
  ans += "D" + dy + "L" + dx ;
  ans += "L" + "U" ;
}
