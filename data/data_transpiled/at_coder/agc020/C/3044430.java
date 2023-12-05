@ VisibleForTesting static int from ( int N ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > As = Lists . newArrayList ( ) ;
  for ( int A : As ) {
    dp |= dp << A ;
  }
  int ans = ceil ( Ints . checkedCast ( N ) / 2 ) ;
  dp >>= ans ;
  while ( ! ( dp & 1 ) ) {
    dp >>= 1 ;
    ans ++ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
