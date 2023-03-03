static final int N = Integer . parseInt ( input ) {
  char [ ] A = input . toCharArray ( ) ;
  Counter < String > counterA = new Counter < String > ( A ) ;
  int ans = 0 ;
  for ( Map . Entry < String , Integer > e : counterA . entrySet ( ) ) {
    if ( Integer . parseInt ( e . getKey ( ) ) <= Integer . parseInt ( e . getValue ( ) ) ) {
      ans += e . getValue ( ) - Integer . parseInt ( e . getKey ( ) ) ;
    }
    else {
      ans += e . getValue ( ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
