public static int [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n == 3 ) {
    System . out . println ( 2 + 5 + 63 ) ;
  }
  else if ( n == 4 ) {
    System . out . println ( 2 + 5 + 20 + 63 ) ;
  }
  else if ( n == 5 ) {
    System . out . println ( 2 + 5 + 20 + 30 + 63 ) ;
  }
  else {
    int [ ] a = new int [ n ] ;
    int count = 0 ;
    for ( int i = 2 ;
    i < 30001 ;
    i ++ ) {
      if ( i % 2 == 0 || i % 3 == 0 ) {
        a [ count ] = i ;
        count ++ ;
      }
      if ( count == n ) {
        break ;
      }
    }
    int sumA = Arrays . stream ( a ) . sum ( ) ;
    if ( sumA % 6 == 0 ) {
      System . out . println ( ( int [ ] ) a [ 0 ] ) ;
    }
    else if ( sumA % 6 == 2 ) {
      a [ 4 ] = 30000 ;
      System . out . println ( ( int [ ] ) a [ 0 ] ) ;
    }
    else if ( sumA % 6 == 3 ) {
      a [ 5 ] = 30000 ;
      System . out . println ( ( int [ ] ) a [ 0 ] ) ;
    }
    else {
      a [ 5 ] = 29998 ;
      System . out . println ( ( int [ ] ) a [ 0 ] ) ;
    }
  }
  return a ;
}
