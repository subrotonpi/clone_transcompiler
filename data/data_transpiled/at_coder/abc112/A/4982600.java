public static void print ( int N ) {
  if ( N == 1 ) {
    System . out . println ( "Hello World" ) ;
  }
  else {
    int [ ] M = new int [ 2 ] ;
    for ( int i = 0 ;
    i < M . length ;
    i ++ ) {
      M [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    System . out . println ( Arrays . toString ( M ) ) ;
  }
}
