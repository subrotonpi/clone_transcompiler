public static int [ ] a ( ) {
  int [ ] a = new int [ 2 ] ;
  for ( int n : input . split ( " " ) ) {
    a [ n ] = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  }
  if ( a [ 0 ] == 1 ) {
    System . out . println ( a [ 1 ] ) ;
  }
  else {
    System . out . println ( a [ 1 ] * ( a [ 1 ] - 1 ) * ( a [ 0 ] - 1 ) ) ;
  }
  return a ;
}
