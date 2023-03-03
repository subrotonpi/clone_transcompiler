public static void main ( String input ) {
  int n = Integer . parseInt ( input ) , m = Integer . parseInt ( input ) ;
  if ( n > m / 2 ) {
    System . out . println ( m / 2 ) ;
  }
  else {
    int x = m - 2 * n ;
    System . out . println ( n + x / 4 ) ;
  }
}
