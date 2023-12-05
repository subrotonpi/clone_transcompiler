public static int N = Integer . parseInt ( input ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = i ;
  }
  a [ N ] = 0 ;
  /* Sum alithmeticProgression of a = d + (d - 1) */
  int seqLength = 1 ;
  int sumV = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( a [ i ] < a [ i + 1 ] ) {
      seqLength ++ ;
    }
    else {
      sumV += sumAlithmeticProgression ( 1 , 1 , seqLength ) ;
      seqLength = 1 ;
    }
  }
  System . out . println ( sumV ) ;
  return seqLength ;
}
