public static int getInt ( ) {
  String s = input ( ) ;
  return ( Math . min ( s . indexOf ( "0" ) , s . indexOf ( "1" ) ) * 2 ) ;
}
