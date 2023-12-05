private static void solve ( ) {
  Set < Integer > fromStart = new HashSet < > ( ) ;
  Set < Integer > toEnd = new HashSet < > ( ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  for ( ;
  ;
  ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    if ( a == 1 ) {
      fromStart . add ( b ) ;
    }
    else if ( b == n ) {
      toEnd . add ( a ) ;
    }
  }
  if ( fromStart . stream ( ) . noneMatch ( n -> n == 1 ) ) {
    System . out . println ( "POSSIBLE" ) ;
  }
  else {
    System . out . println ( "IMPOSSIBLE" ) ;
  }
}
