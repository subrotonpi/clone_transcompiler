static void shortestPath ( int [ ] [ ] g , int s , int [ ] dist , int [ ] prev ) {
  int n = g . length - 1 ;
  PriorityQueue < Integer > Q = new PriorityQueue < > ( ) ;
  heapSort ( Q , 0 , - 2 , s ) ;
  while ( Q . size ( ) > 0 ) {
    int [ ] e = new int [ n ] ;
    Q . add ( e ) ;
    if ( prev [ e [ 2 ] ] != - 1 ) continue ;
    prev [ e [ 2 ] ] = e [ 1 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int [ ] f = g [ e [ 2 ] ] ;
      if ( dist [ f [ 2 ] ] > e [ 0 ] + f [ 0 ] ) {
        dist [ f [ 2 ] ] = e [ 0 ] + f [ 0 ] ;
        heapSort ( Q , e [ 0 ] + f [ 0 ] , f [ 1 ] , f [ 2 ] ) ;
      }
    }
  }
  final String nextLine ;
  if ( System . getProperty ( "line.separator" ) . equals ( "" ) ) nextLine = input ;
  n = Integer . parseInt ( nextLine ) ;
  g = new int [ n + 1 ] [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( nextLine ) ;
    int b = Integer . parseInt ( nextLine ) ;
    g [ a - 1 ] [ i ] = new int [ a ] ;
    g [ b - 1 ] [ i ] = new int [ b ] ;
  }
  int [ ] z = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a = Integer . parseInt ( nextLine ) ;
    int b = Integer . parseInt ( nextLine ) ;
    g [ n ] [ i ] = new int [ b ] ;
    g [ n ] [ i ] = new int [ a ] ;
    z [ a ] = new int [ b ] ;
  }
  int [ ] a = new int [ n + 1 ] ;
  shortestPath ( g , n , a , new int [ n + 1 ] ) ;
  if ( ArrayUtils . isNotEmpty ( z ) ) {
    System . out . println ( "No" ) ;
    System . exit ( 0 ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ArrayUtils . isNotEmpty ( a ) ) {
      System . out . println