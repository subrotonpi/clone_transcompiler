static int N = Integer . parseInt ( input ) {
  int NG = Integer . parseInt ( input . nextLine ( ) ) , N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( NG . contains ( N ) ) System . out . println ( "NO" ) ;
  exit ( ) ;
  final int INF = 10 * 7 ;
  final int [ ] dp = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) dp [ i ] = INF ;
  dp [ N ] = INF ;
  for ( int i = N ;
  i < N ;
  i ++ ) {
  }
  return dp [ N ] ;
}
