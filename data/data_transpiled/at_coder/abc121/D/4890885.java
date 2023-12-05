public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  /* Count the number of bits in the range [A,B) */
  int [ ] bitCounts = new int [ B ] ;
  int n = B ;
  int d = 0 ;
  while ( n > 0 ) {
    bitCounts [ d ] = count1 ( B , d ++ ) ;
    n >>= 1 ;
  }
  n = A - 1 ;
  d = 0 ;
  while ( n > 0 ) {
    bitCounts [ d ] -= count1 ( A - 1 , d ++ ) ;
    n >>= 1 ;
  }
  int r = 0 ;
  int ans = 0 ;
  for ( int bc : bitCounts ) {
    if ( bc % 2 == 1 ) ans += 2 * r ;
    r ++ ;
  }
  System . out . println ( ans ) ;
  if ( getClass ( ) . equals ( Main . class ) ) {
    Main . main ( ) ;
  }
  return ans ;
}
