public static int [ ] [ ] A = Integer . parseInt ( input ) {
  int [ ] [ ] B = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = A [ 0 ] [ 0 ] + B [ 0 ] [ 0 ] ;
  if ( x >= 24 ) {
    System . out . println ( x - 24 ) ;
  }
  else {
    System . out . println ( x ) ;
  }
  return B ;
}
