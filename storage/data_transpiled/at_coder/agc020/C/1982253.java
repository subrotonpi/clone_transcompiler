public static void input ( ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int dp = 1 ;
  for ( int x : a ) {
    dp |= dp << x ;
  }
  int s = Integer . parseInt ( a ) ;
  dp >>= ( s + 1 ) / 2 ;
  dp = Integer . parseInt ( dp ) ;
}
