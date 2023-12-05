public static int [ ] A ( ) {
  A = list ( map ( Integer . parseInt ( input ( ) ) ) ) ;
  return ( min ( A [ 0 ] + A [ 1 ] + 1 , A [ 2 ] ) + A [ 1 ] ) ;
}
