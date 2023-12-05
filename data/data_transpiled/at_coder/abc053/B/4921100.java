public static void input ( ) {
  String s = input ( ) ;
  String ans = s . substring ( s . indexOf ( 'A' ) ) ;
  s = ans . substring ( 0 , ans . length ( ) - 1 ) ;
  ans = s . substring ( s . indexOf ( 'Z' ) ) ;
  System . out . println ( ans . length ( ) ) ;
}
