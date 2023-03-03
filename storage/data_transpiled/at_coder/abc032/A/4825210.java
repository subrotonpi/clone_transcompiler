public static void print ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  do {
    if ( n % a == 0 && n % b == 0 ) {
      break ;
    }
    n = n + 1 ;
  }
  while ( true ) ;
  System . out . println ( n ) ;
}
