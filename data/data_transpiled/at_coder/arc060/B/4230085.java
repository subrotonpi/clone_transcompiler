@ VisibleForTesting static int [ ] divideDoubles ( int n ) {
  final int [ ] divs = new int [ n ] ;
  System . arraycopy ( divs , 0 , divs , 0 , n ) ;
  {
    int i ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( n < s ) {
      System . out . println ( - 1 ) ;
    }
    else if ( n == s ) {
      System . out . println ( n + 1 ) ;
    }
    else {
      divs [ 0 ] = i ;
      if ( ( n - s ) % i == 0 ) {
        divs [ 1 ] = i ;
        if ( i != ( n - s ) / i ) {
          divs [ 2 ] = ( n - s ) / i ;
        }
      }
    }
  }
  Arrays . sort ( divs ) ;
  for ( int d : divs ) {
    if ( divs [ d + 1 ] == s ) {
      System . out . println ( d + 1 ) ;
      break ;
    }
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return divs ;
}
