public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int ans = ( n / 2 ) ;
  if ( n % 2 == 0 ) {
    System . out . println ( ans ) ;
  }
  else {
    System . out . println ( ans + 1 ) ;
  }
}
