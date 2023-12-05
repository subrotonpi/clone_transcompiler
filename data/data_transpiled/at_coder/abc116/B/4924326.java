public static int COL ( int n ) {
  if ( n % 2 == 0 ) {
    return ( int ) ( n / 2 ) ;
  }
  else {
    return 3 * n + 1 ;
  }
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  List = new ArrayList ( ) ;
  s = COL ( s ) ;
  while ( ! s >= 0 ) {
    List . add ( s ) ;
    s = COL ( s ) ;
  }
  System . out . println ( List . size ( ) + 1 ) ;
}
