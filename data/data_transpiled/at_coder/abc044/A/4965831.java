public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  if ( n <= k ) {
    System . out . println ( n * x ) ;
  }
  else {
    System . out . println ( k * x + ( n - k ) * y ) ;
  }
}
