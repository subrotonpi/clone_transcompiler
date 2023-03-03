public static int [ ] A ( ) {
  int [ ] s = new int [ 3 ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( A ) ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    System . out . println ( s [ A . length - i - 1 ] + 1 ) ;
  }
  return s ;
}
