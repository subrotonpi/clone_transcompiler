static final int [ ] [ ] solve ( ) {
  final int [ ] [ ] testCases = new int [ 8 ] [ ] ;
  int processes = 0 ;
  int t = Integer . parseInt ( System . in ) ;
  if ( verbose > 0 ) {
    System . err . println ( "Solving " + t + " test cases" ) ;
    for ( int i = 0 ;
    i < xrange ;
    i ++ ) {
      System . err . print ( i % 10 == 9 ? "|" : "." ) ;
    }
    System . err . println ( "." ) ;
    testCases = new int [ t ] [ ] ;
    for ( int i = 0 ;
    i < t ;
    i ++ ) {
      testCases [ i ] = read ( testCases [ i ] ) ;
    }
    if ( parallelize ) {
      processPool = new Pool ( processes ) ;
      if ( checkPermission ) {
        testResults = processPool . mapAsync ( check , testCases ) . get ( 9999999 ) ;
      }
      else {
        testResults = processPool . mapAsync ( solve , testCases ) . get ( 9999999 ) ;
      }
    }
  }
  else {
    if ( checkPermission ) {
      testResults = new int [ 10 ] [ ] ;
      for ( int i = 0 ;
      i < t ;
      i ++ ) {
        testCases [ i ] = solve ( testCases [ i ] ) ;
      }
    }
  }
  int n = Integer . parseInt ( System . in ) ;
  int c = Integer . parseInt ( System . in ) ;
  int m = Integer . parseInt ( System . in ) ;
  int [ ] [ ] requests = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    requests [ i ] = Integer . parseInt ( System . in ) ;
  }
  int [ ] res = null ;
  int [ ] ridesPerCustomer = new int [ c ] ;
  for ( int i = 0 ;
  i < c ;
  i ++ ) {
    ridesPerCustomer [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    requests [ i ] = requests [ i ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int k = Integer . parseInt ( System . in ) ;
    int upgrades = 0 ;
    int toPlace = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( i > j ) {
        upgrades += i - j ;
        toPlace += i - j ;
        