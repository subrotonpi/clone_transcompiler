public static int [ ] a ( ) {
  int [ ] a = new int [ 4 ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( a [ 0 ] * a [ 1 ] == a [ 2 ] * a [ 3 ] ) {
    System . out . println ( a [ 0 ] * a [ 1 ] ) ;
  }
  else if ( a [ 0 ] * a [ 1 ] > a [ 2 ] * a [ 3 ] ) {
    System . out . println ( a [ 0 ] * a [ 1 ] ) ;
  }
  else {
    System . out . println ( a [ 2 ] * a [ 3 ] ) ;
  }
  return a ;
}
