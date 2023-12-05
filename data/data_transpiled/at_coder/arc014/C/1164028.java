public static int n ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  String s = input ( ) ;
  return ( s . indexOf ( 'R' ) % 2 + s . indexOf ( 'G' ) % 2 + s . indexOf ( 'B' ) % 2 ) ;
}
