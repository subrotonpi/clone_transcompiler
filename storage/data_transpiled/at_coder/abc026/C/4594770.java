public static int [ ] [ ] getPayli ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] d = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    d [ i ] = input . nextInt ( ) ;
  }
  Arrays . sort ( d ) ;
  int [ ] [ ] b = new int [ n + 1 ] [ n + 1 ] ;
  Arrays . fill ( b , 1 , 1 ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    b [ i + 2 ] = new int [ ] {
      i + 2 , d [ i ] }
      ;
    }
    int [ ] [ ] payli = new int [ n + 1 ] [ ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      payli [ i ] [ 0 ] = i ;
    }
    return payli ;
  }
  