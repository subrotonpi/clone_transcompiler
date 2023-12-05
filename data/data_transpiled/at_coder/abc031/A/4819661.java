public static int A = Integer . parseInt ( input ) {
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = ( A + 1 ) * D ;
  int y = A * ( D + 1 ) ;
  if ( x >= y ) {
    System . out . println ( x ) ;
  }
  else {
    System . out . println ( y ) ;
  }
  return x ;
}
