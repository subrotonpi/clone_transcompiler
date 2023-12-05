public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = 1 ;
  while ( true ) {
    if ( n > N ) {
      System . out . println ( n / 2 ) ;
      break ;
    }
    n = n * 2 ;
  }
}
