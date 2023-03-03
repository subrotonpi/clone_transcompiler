static final int C = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int testCase = 0 ;
testCase < C ;
testCase ++ ) {
  N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  K = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  B = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  X = X . get ( 0 ) ;
  V = V . get ( 0 ) ;
  int swaps = 0 ;
  int barriers = 0 ;
  int made = 0 ;
  for ( int i = X . size ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    int stops = X . get ( i ) + V . get ( i ) * T ;
    if ( stops >= B ) {
      swaps += barriers ;
      made ++ ;
    }
    else barriers ++ ;
    if ( made == K ) break ;
  }
  String r = made == K ? swaps : "IMPOSSIBLE" ;
  System . out . println ( "Case #" + ( testCase + 1 ) + ": " + r ) ;
}
