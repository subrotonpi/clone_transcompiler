public static int simpleIncremental ( @ Nonnegative int N , @ Nonnegative int [ ] A ) {
  int l = 0 , r = 0 ;
  int count = 0 ;
  while ( r < N ) {
    while ( r + 1 < N && A [ r ] < A [ r + 1 ] ) {
      r = r + 1 ;
    }
    count += ( r - l + 1 ) * ( r - l + 2 ) / 2 ;
    l = r = r + 1 ;
  }
  if ( getClass ( ) . isStringPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtrPtr @ @