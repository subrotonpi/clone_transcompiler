static private int dfs ( int v , int d , int c , int [ ] [ ] e ) {
  final Scanner in = new Scanner ( System . in ) ;
  int n ;
  int [ ] [ ] dp ;
  int [ ] [ ] [ ] e ;
  if ( ( dp = new int [ n ] [ d ] ) != null ) return dp ;
  if ( ( n = in . nextInt ( ) ) == null ) {
    dp = new int [ n ] [ d ] ;
    return dp [ n ] [ d ] ;
  }
  for ( int u = 0 ;
  u < e [ v ] . length ;
  u ++ ) dp [ u ] [ d - 1 ] = dfs ( u , d - 1 , c , e ) ;
  dp [ n ] [ d ] = dfs ( v , d - 1 , c , e ) ;
  return dp [ n ] [ d ] ;
}
