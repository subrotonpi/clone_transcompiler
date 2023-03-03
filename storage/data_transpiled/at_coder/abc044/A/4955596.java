public static int [ ] n ( ) {
  int [ ] n = new int [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    n [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( n [ 0 ] > n [ 1 ] ) {
    System . out . println ( n [ 1 ] * n [ 2 ] + ( n [ 0 ] - n [ 1 ] ) * n [ 3 ] ) ;
  }
  else {
    System . out . println ( n [ 0 ] * n [ 2 ] ) ;
  }
  return n ;
}
