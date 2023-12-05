public static int N = Integer . parseInt ( input ) {
  if ( N == 1 ) {
    System . out . println ( "Hello World" ) ;
    exit ( ) ;
  }
  else {
    List l = new ArrayList ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      l . add ( Integer . parseInt ( input ) ) ;
    }
  }
  System . out . println ( sum ( l ) ) ;
  return 0 ;
}
