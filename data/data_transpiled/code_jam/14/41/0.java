static final java . io . File file = new java . io . File ( args . get ( 0 ) ) ;
java . io . File fout = new java . io . File ( "p1.out" ) ;
int T = Integer . parseInt ( fin . readLine ( ) ) ;
for ( int i = 0 ;
i < xrange . length ;
i ++ ) {
  int N = Integer . parseInt ( fin . readLine ( ) ) ;
  int X = Integer . parseInt ( fin . readLine ( ) ) ;
  int [ ] S = new int [ N ] ;
  for ( int j = 0 ;
  j < S . length ;
  j ++ ) {
    S [ j ] = Integer . parseInt ( fin . readLine ( ) ) ;
  }
  int cur = 0 ;
  for ( int j = 0 ;
  j < xrange . length ;
  j ++ ) {
    if ( j <= cur ) break ;
    else if ( S [ cur ] + S [ j ] <= X ) cur ++ ;
  }
  fout . write ( "Case #" + ( i + 1 ) + ": " + ( N - cur ) + "\n" ) ;
}
