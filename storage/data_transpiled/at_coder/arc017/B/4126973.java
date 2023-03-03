public static int bLowResolution ( int N , int K , int [ ] A ) {
  int increasingLength = 1 ;
  int [ ] increasingInterval = new int [ N ] ;
  for ( int j = 1 ;
  j < N ;
  j ++ ) {
    if ( A [ j ] > A [ j - 1 ] ) {
      increasingLength ++ ;
    }
    else {
      increasingInterval [ j ] = increasingLength ;
      increasingLength = 1 ;
    }
  }
  if ( increasingLength != 1 ) {
    increasingInterval [ N ] = increasingLength ;
  }
  int ans = Integer . MAX_VALUE ;
  for ( int i : increasingInterval ) {
    ans = Integer . MAX_VALUE ;
  }
  return ans ;
}
