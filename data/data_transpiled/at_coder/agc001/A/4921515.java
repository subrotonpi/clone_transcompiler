public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i += 2 ) {
    L . add ( i ) ;
  }
  Collections . sort ( L ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < L . size ( ) ;
  i += 2 ) {
    ans += L . get ( i ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
