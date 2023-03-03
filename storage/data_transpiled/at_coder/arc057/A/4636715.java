public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int m = 2 * 10 * 12 ;
  int ans ;
  if ( k == 0 ) {
    ans = m - a ;
  }
  else {
    ans = 0 ;
    while ( a < m ) {
      a ++ + k * a ;
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
