public static int backAndForth ( @ IntRange ( from = 0 , to = 1 ) int sx , @ IntRange ( from = 0 , to = 1 ) int sy , int tx , int ty ) {
  int dx = tx - sx , dy = ty - sy ;
  String forth = ( "U" . equals ( "R" ) ) ? "R" : "R" ;
  String back = ( "D" . equals ( "L" ) ) ? "D" : "L" ;
  String first = forth + back ;
  String second = "LU" + forth + "RD" + "RD" + back + "LU" ;
  return first + second ;
}
