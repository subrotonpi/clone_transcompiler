public static void print ( int n , int t ) {
  int l = Integer . parseInt ( input ( ) ) ;
  long ans = t ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( l - l [ i - 1 ] < t ) ans -= t - ( l - l [ i - 1 ] ) ;
    ans += t ;
  }
  System . out . println ( ans ) ;
}
