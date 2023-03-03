public static void print ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  a = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  S = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    while ( a . get ( i ) % 2 == 0 ) {
      a . get ( i ) / = 2 ;
    }
    S . add ( a . get ( i ) ) ;
  }
  System . out . println ( S . size ( ) ) ;
}
