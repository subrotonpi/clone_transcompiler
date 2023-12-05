public static void startProcess ( ) {
  X . println ( "Starting process" ) ;
  Y . println ( "Starting process" ) ;
  Z . println ( "Starting process" ) ;
  K . println ( "Starting process" ) ;
  A . println ( "Starting process" ) ;
  return ;
  /* main program */
  int count = 0 ;
  for ( int i = 0 ;
  i < 12 ;
  i ++ ) {
    String a = String . valueOf ( input . nextInt ( ) ) ;
    if ( "r" . equals ( a ) ) {
      count ++ ;
    }
  }
  System . out . println ( count ) ;
}
