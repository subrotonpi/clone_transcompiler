static final int [ ] [ ] binarySearch ( int n , int k ) {
  int [ ] [ ] array = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    array [ i ] = new int [ ] {
      n , i }
      ;
    }
    ArrayList < Integer > a = new ArrayList < > ( Arrays . asList ( array ) ) ;
    a . add ( 0 ) ;
    a . add ( 0 ) ;
    System . out . println ( a . get ( a . size ( ) - 1 ) . intValue ( ) + 1 ) ;
    for ( int i = k ;
    i < n ;
    i ++ ) {
      Arrays . sort ( a ) ;
      a . remove ( a . size ( ) - 1 ) ;
      System . out . println ( a . get ( a . size ( ) - 1 ) . intValue ( ) + 1 ) ;
    }
    return array ;
  }
  