public static void numTerms ( int numTerms , int maxValue ) {
  int [ ] coef = new int [ input . length ] ;
  for ( int a : input ) {
    coef [ a ] = Integer . parseInt ( input [ a ] ) ;
  }
  int res = 0 ;
  for ( int i = 40 ;
  i >= 0 ;
  i -- ) {
    int numBits = 0 ;
    for ( int a : coef ) {
      numBits += ( ( a >> i ) & 1 ) ;
    }
    int cand = 2 * i ;
    if ( ( numTerms - numBits ) > numBits && cand <= maxValue ) {
      res += ( numTerms - numBits ) * cand ;
      maxValue -= cand ;
    }
    else {
      res += numBits * cand ;
    }
  }
  System . out . println ( res ) ;
}
