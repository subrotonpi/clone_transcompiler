public static void print ( String s ) {
  String a = s . substring ( 0 , 2 ) ;
  String b = s . substring ( 1 , 2 ) ;
  System . out . println ( b . indexOf ( 'g' ) - a . indexOf ( 'p' ) ) ;
}
