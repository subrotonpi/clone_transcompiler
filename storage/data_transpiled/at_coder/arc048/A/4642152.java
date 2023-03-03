public static void main ( String input ) {
  int n , m ;
  int ans ;
  n = Integer . parseInt ( input ) ;
  m = Integer . parseInt ( input ) ;
  if ( n < 0 && m < 0 ) {
    ans = m - n ;
  }
  else if ( m > 0 ) {
    ans = m - n - 1 ;
  }
  else {
    ans = m - n ;
  }
  System . out . println ( ans ) ;
}
