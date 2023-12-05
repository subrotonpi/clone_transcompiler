static final int [ ] getDigits ( ) {
  int n , as ;
  n = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  as = Integer . parseInt ( input . nextLine ( ) ) ;
  As = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    As [ i ] = Integer . parseInt ( a ) ;
  }
  if ( As [ 0 ] != 0 ) {
    System . out . println ( - 1 ) ;
    System . exit ( 0 ) ;
  }
  int result = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int k = n - 1 - i ;
    As [ k ] = i ;
    if ( As [ k ] > k ) {
      System . out . println ( - 1 ) ;
      System . exit ( 0 ) ;
    }
    if ( k == as [ k - 1 ] ) {
      result += As [ k ] ;
    }
    else {
      if ( As [ k ] > As [ k + 1 ] ) {
        result += As [ k ] ;
      }
      if ( As [ k ] == As [ k + 1 ] ) {
        result += As [ k ] ;
      }
      if ( As [ k ] + 1 < As [ k + 1 ] ) {
        System . out . println ( - 1 ) ;
        System . exit ( 0 ) ;
      }
    }
  }
  System . out . println ( result ) ;
  return As ;
}
