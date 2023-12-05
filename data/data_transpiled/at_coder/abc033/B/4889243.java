public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String [ ] S = new String [ N ] ;
  int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String s = input . substring ( 0 , i ) ;
    String p = input . substring ( i + 1 ) ;
    S [ i ] = s ;
    P [ i ] = Integer . parseInt ( p ) ;
  }
  if ( max ( P ) > sum ( P ) / 2 ) System . out . println ( S [ P . indexOf ( max ( P ) ) ] ) ;
  else System . out . println ( "atcoder" ) ;
}
