@ SafeVarargs public static void from ( List < Integer > input ) {
  int n = Integer . parseInt ( input . get ( 0 ) ) ;
  int k = Integer . parseInt ( input . get ( 1 ) ) ;
  List < Integer > nums = Lists . newArrayList ( ) ;
  nums . add ( n ) ;
  List < Integer > acl = Lists . newArrayList ( ) ;
  accumulate ( nums ) ;
  int ans = acl . get ( k - 1 ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    try {
      ans += acl . get ( i + k ) - acl . get ( i ) ;
    }
    catch ( Exception e ) {
    }
  }
  System . out . println ( ans ) ;
}
