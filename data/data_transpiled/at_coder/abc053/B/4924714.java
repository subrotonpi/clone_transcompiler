public static void input ( ) {
  String s = input ( ) ;
  String ans = s . substring ( s . indexOf ( "A" ) , s . length ( ) ) ;
  s = ans . substring ( 0 , s . length ( ) - 1 ) ;
  ans = s . substring ( s . indexOf ( "Z" ) , s . length ( ) ) ;
  System . out . println ( ans . length ( ) ) ;
}
