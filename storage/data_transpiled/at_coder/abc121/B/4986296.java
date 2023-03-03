static int N ( int M , int C ) {
  int [ ] A = new int [ N ] ;
  int [ ] B = new int [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = i ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sumValue = A [ i ] * B [ i ] ;
    if ( ( sum ( sumValue ) + C ) > 0 ) {
      cnt ++ ;
    }
  }
  return cnt ;
}
