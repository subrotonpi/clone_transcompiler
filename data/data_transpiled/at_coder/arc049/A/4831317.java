public static void print ( ) {
  S = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    S . add ( A . get ( i ) + i , '"' ) ;
  }
  System . out . println ( S ) ;
}
