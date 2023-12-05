static final int [ ] solve ( ) {
  final int [ ] openNodes = new int [ 2 ] ;
  final boolean verbose = false ;
  int n = Integer . parseInt ( System . in ) ;
  int [ ] pre = new int [ n ] ;
  int [ ] [ ] first = new int [ n ] [ ] ;
  int [ ] [ ] processes = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    pre [ i ] = Integer . parseInt ( System . in ) ;
  }
  Arrays . sort ( pre ) ;
  Arrays . sort ( first ) ;
  Arrays . sort ( pre ) ;
  Arrays . sort ( first ) ;
  int [ ] [ ] first = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    processes [ i ] = 0 ;
  }
  int [ ] [ ] rate = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    rate [ i ] = Integer . parseInt ( System . in ) ;
  }
  int [ ] [ ] t = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Arrays . sort ( t ) ;
  }
  int [ ] [ ] testCases = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    testCases [ i ] = read ( ) ;
  }
  if ( verbose ) {
    System . err . println ( "." ) ;
    System . err . flush ( ) ;
  }
  {
    int [ ] [ ] res = new int [ n ] [ ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      res [ i ] = res [ i ] [ 0 ] ;
    }
  }
  {
    int [ ] [ ] testCases = new int [ n ] [ ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      testCases [ i ] = testCases [ i ] [ 0 ] ;
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      testCases [ i ] = testCases [ i ] [ 1 ] ;
    }
  }
  {
    int [ ] [ ] a = new int [ n ] [ ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i ] = solve ( ) ;
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i