private static String solve ( int [ ] L ) {
  int xors = Stream . of ( L ) . filter ( a -> a ^ b ) . findFirst ( ) . orElse ( 0 ) ;
  if ( xors != 0 ) {
    return "NO" ;
  }
  return Arrays . stream ( L ) . filter ( a -> a != 0 ) . findFirst ( ) . orElse ( 0 ) ;
}
