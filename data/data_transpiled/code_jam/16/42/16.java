private static int [ ] solve ( String [ ] args ) {
  final int n = Integer . parseInt ( args [ 0 ] ) ;
  final int k = Integer . parseInt ( args [ 1 ] ) ;
  final int processes = 2 ;
  int [ ] testCases = new int [ n ] ;
  for ( int i = 0 ;
  i < processes ;
  i ++ ) {
    testCases [ i ] = Integer . parseInt ( args [ 2 + i ] ) ;
  }
  if ( verbose ) {
    System . err . println ( ">>>> Solving " + t + " test cases" ) ;
  }
  final int [ ] p = new int [ n ] ;
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    p [ i ] = Double . parseDouble ( args [ 3 + i ] ) ;
  }
  assert p . length == n ;
  {
    System . err . println ( ">>>> " + p [ 0 ] ) ;
  }
  final int [ ] testResults ;
  if ( verbose ) {
    System . err . println ( ">>>> " + p [ 0 ] ) ;
  }
  else {
    testResults = new int [ n ] ;
    for ( int i = 0 ;
    i < p . length ;
    i ++ ) {
      testResults [ i ] = p [ i ] ;
    }
  }
  if ( verbose ) {
    System . err . println ( ">>>> " + p [ 0 ] ) ;
  }
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    System . err . println ( ">>> " + p [ i ] ) ;
  }
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    System . err . println ( ">>> " + p [ i ] ) ;
  }
  final Map < Integer , Double > res = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    res . put ( i , 1.0 ) ;
  }
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    res . put ( i , p [ i ] ) ;
  }
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    System . err . println ( ">>> " + p [ i ] ) ;
  }
  return res . values ( ) ;
}
