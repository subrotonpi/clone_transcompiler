public static final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int t = 0 ;
t < T ;
t ++ ) {
  int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  StringTokenizer toks = new StringTokenizer ( System . console ( ) . readLine ( ) ) ;
  double [ ] L = new double [ N ] ;
  for ( int i = 0 ;
  i < L . length ;
  i ++ ) L [ i ] = Double . parseDouble ( toks . nextToken ( ) ) ;
  toks = new StringTokenizer ( System . console ( ) . readLine ( ) ) ;
  double [ ] P = new double [ N ] ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) P [ i ] = Double . parseDouble ( toks . nextToken ( ) ) / 100 ;
  double [ ] E = new double [ N ] ;
  for ( int i = 0 ;
  i < E . length ;
  i ++ ) {
    double e = 1.0 / ( 1 - P [ i ] ) ;
    E [ i ] = e ;
  }
  double [ ] [ ] X = new double [ N ] [ 2 ] ;
  for ( int i = 0 ;
  i < X . length ;
  i ++ ) {
    double x = L [ i ] * E [ i ] ;
    if ( E [ i ] == 1 ) x = 0 ;
    X [ i ] [ 0 ] = x ;
    X [ i ] [ 1 ] = - i ;
  }
  Arrays . sort ( X , Collections . reverseOrder ( ) ) ;
  System . out . println ( "Case #" + ( t + 1 ) + ":" ) ;
  for ( int i = 0 ;
  i < X . length ;
  i ++ ) System . out . println ( - X [ 1 ] [ 0 ] ) ;
  System . out . println ( ) ;
}
