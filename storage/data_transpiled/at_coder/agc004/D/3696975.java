public static final int [ ] [ ] getNegativeInstances ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = new int [ n ] [ ] ;
  int ans = 0 ;
  if ( a [ 0 ] != 1 ) {
    a [ 0 ] = 1 ;
    ans ++ ;
  }
  ArrayList < ArrayList < Integer >> b = new ArrayList < ArrayList < Integer >> ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b . add ( new ArrayList < Integer > ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b . get ( a [ i ] - 1 ) . add ( i ) ;
  }
  b . remove ( 0 ) ;
  int huka = 0 ;
  double [ ] kyo = new double [ n ] ;
  /* dfs */
  kyo [ 0 ] = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < b . size ( ) ;
  i ++ ) {
    dfs ( b . get ( i ) , i + 1 ) ;
  }
  dfs ( 0 , 0 ) ;
  /* dfs2 */
  if ( kyo [ 0 ] <= k - 1 ) return null ;
  if ( kyo [ 0 ] == k - 1 && kyo [ 0 ] != 0 ) {
    kyo [ 0 ] = 0 ;
    ans ++ ;
    return null ;
  }
  kyo [ 0 ] = 0 ;
  dfs2 ( a [ 0 ] - 1 , kyo [ 0 ] + 1 ) ;
  int [ ] [ ] hukai = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < huka ;
  i ++ ) {
    hukai [ i ] = kyo [ i ] ;
  }
  Arrays . sort ( hukai , new Comparator ( ) {
    public int compare ( int x , int y ) {
      return - x ;
    }
  }
  ) ;
  for ( int j = 0 ;
  j < hukai . length ;
  j ++ ) {
    if ( hukai [ j ] <= k ) continue ;
    dfs2 ( hukai [ j ] , 0 ) ;
  }
  System . out . println ( ans ) ;
  return huka ;
}
