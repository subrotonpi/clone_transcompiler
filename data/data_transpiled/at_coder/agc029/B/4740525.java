@ VisibleForTesting static void from ( Collection < Integer > input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int [ ] C = A . toArray ( ) ;
  int ans = 0 ;
  for ( int m : sorted ( C , reverse = true ) ) {
    int p = ( 1 << m ) - m ;
    if ( m == p ) {
      ans += C [ m ] / 2 ;
    }
    else if ( C [ p ] >= 0 ) {
      int k = Math . min ( C [ m ] , C [ p ] ) ;
      ans += k ;
      C [ p ] -= k ;
    }
  }
  System . out . println ( ans ) ;
}
