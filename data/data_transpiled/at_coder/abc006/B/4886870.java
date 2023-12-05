{
  a = new int [ ] {
    0 , 0 , 1 }
    ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int i = 3 ;
    i < n ;
    i ++ ) {
      int b = ( a [ i - 1 ] + a [ i - 2 ] + a [ i - 3 ] ) % 10007 ;
      a [ i ] = b ;
    }
    System . out . println ( a [ n - 1 ] ) ;
  }
  