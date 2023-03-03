static void N ( int N , String S , String T ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i == 0 || S [ i - 1 ] != S . charAt ( i ) ) {
    }
  }
  int a = 6 - 3 * A [ 0 ] , d = A . length - 1 ;
  if ( d > 0 ) {
    for ( int i = 0 ;
    i < d ;
    i ++ ) {
      int b = A [ i + 1 ] , c = A [ i ] ;
      a *= 3 + 2 * c * b - 2 * b - c ;
    }
  }
  System . out . println ( a % ( 10 * 9 + 7 ) ) ;
}
