static int n ( int n , int a ) {
  a -- ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ i ] -- ;
  final BitSet visit = new BitSet ( ) ;
  final boolean [ ] used = new boolean [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    used [ i ] = false ;
  }
  return dfs ( b [ now ] ) ;
}
