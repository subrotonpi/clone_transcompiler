public static int getA ( ) {
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A <= D ) {
    System . out . println ( ( A + 1 ) * D ) ;
  }
  else {
    System . out . println ( A * ( D + 1 ) ) ;
  }
  return A ;
}
