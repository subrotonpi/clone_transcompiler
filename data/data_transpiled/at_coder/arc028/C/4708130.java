public static void solve ( int n , int [ ] p , int [ ] [ ] c ) {
  int [ ] d = new int [ n ] ;
  Arrays . fill ( d , 1 ) ;
  int [ ] b = new int [ n ] ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    if ( 0 <= p [ i ] ) {
      d [ p [ i ] ] += d [ i ] ;
    }
    if ( c [ i ] . length > 0 ) {
      int m = i != 0 ? n - d [ i ] : 0 ;
      for ( int j : c [ i ] ) {
        m = Math . max ( m , d [ j ] ) ;
      }
      b [ i ] = m ;
    }
    else {
      b [ i ] = n - 1 ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( b [ i ] ) ;
  }
  {
    n = input . nextInt ( ) ;
    n = Integer . parseInt ( input . nextLine ( ) ) ;
    p = new int [ n ] ;
    c = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int pi = input . nextInt ( ) ;
      pi = Integer . parseInt ( input . nextLine ( ) ) ;
      p [ i ] = pi ;
      c [ pi ] . add ( i ) ;
    }
    solve ( n , p , c ) ;
  }
  if ( getClass ( ) . isClassPresent ( Main . class ) ) {
    main ( ) ;
  }
}
