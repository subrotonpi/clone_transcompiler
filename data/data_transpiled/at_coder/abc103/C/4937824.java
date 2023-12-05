@ VisibleForTesting static int gcd ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  int key = 1 ;
  /* lcm */
  for ( int a : A ) {
    key = lcm ( key , a ) ;
  }
  key -- ;
  int ans = 0 ;
  for ( int a : A ) {
    ans += key % a ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
