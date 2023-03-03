public static void print ( String s ) {
  s = input . toUpperCase ( ) ;
  int I = s . indexOf ( 'I' ) ;
  int C = s . substring ( I ) . indexOf ( 'C' ) + I ;
  int T = s . substring ( C ) . indexOf ( 'T' ) + C ;
  if ( I < C && C < T && - 1 != I && C != T ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
