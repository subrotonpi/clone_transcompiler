@ Sys public static void main ( String [ ] args ) {
  Scanner input = new Scanner ( System . in ) ;
  int n = input . nextInt ( ) , m = input . nextInt ( ) , a = input . nextInt ( ) , b = input . nextInt ( ) ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) {
    int c = input . nextInt ( ) ;
    if ( n <= a ) {
      n += b ;
    }
    n -= c ;
    if ( n < 0 ) {
      System . out . println ( i ) ;
      break ;
    }
  }
  else {
    System . out . println ( "complete" ) ;
  }
}
