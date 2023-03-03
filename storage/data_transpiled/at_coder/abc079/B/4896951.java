{
  l = new int [ ] {
    2 , 1 }
    ;
    n = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int i = 2 ;
    i <= n ;
    i ++ ) {
      l [ i ] = l [ i - 1 ] + l [ i - 2 ] ;
    }
    System . out . println ( l [ n ] ) ;
  }
  