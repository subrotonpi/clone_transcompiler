public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String [ ] S = new String [ n ] ;
  int [ ] P = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = input . substring ( 0 , i ) ;
    String p = input . substring ( i + 1 ) ;
    S [ i ] = s ;
    P [ i ] = Integer . parseInt ( p ) ;
  }
  if ( max ( P ) > Integer . MAX_VALUE / 2 ) System . out . println ( S [ P . indexOf ( max ( P ) ) ] ) ;
  else System . out . println ( "atcoder" ) ;
}
