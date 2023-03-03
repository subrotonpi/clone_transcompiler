public static int salary ( int N , @ Nonnull int [ ] B ) {
  int [ ] [ ] tree = new int [ N ] [ B . length ] ;
  for ( int i = 0 ;
  i < tree . length ;
  i ++ ) {
    tree [ i ] = new int [ B . length ] ;
  }
  for ( int i = 0 ;
  i < tree . length ;
  i ++ ) {
    tree [ i ] [ B . length - 1 ] = i + 1 ;
  }
  /* dfs(v) */
  if ( tree [ 0 ] == null ) return 1 ;
  int maxS = 0 , minS = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < tree [ 0 ] . length ;
  i ++ ) {
    int child = tree [ i ] [ i ] ;
    int d = dfs ( child ) ;
    maxS = Math . max ( maxS , d ) ;
    minS = Math . min ( minS , d ) ;
  }
  /* dfs(v) */
  if ( getClass ( ) . equals ( "java.util.Scanner" ) ) {
    N = Integer . parseInt ( input ( ) ) ;
    B = new int [ N - 1 ] ;
    for ( int i = 0 ;
    i < B . length ;
    i ++ ) {
      B [ i ] = Integer . parseInt ( input ( ) ) ;
    }
    int ans = salary ( N , B ) ;
    System . out . println ( ans ) ;
  }
  return 0 ;
}
