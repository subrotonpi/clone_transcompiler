public static void main ( String input ) {
  int n = Integer . parseInt ( input ) , m = Integer . parseInt ( input ) ;
  if ( n > m ) {
    n = m ;
    m = n ;
  }
  int ans = ( n - 2 ) * ( m - 2 ) ;
  if ( n == 1 ) {
    if ( m == 1 ) {
      ans = 1 ;
    }
    else {
      ans = m - 2 ;
    }
  }
  System . out . println ( ans ) ;
}
