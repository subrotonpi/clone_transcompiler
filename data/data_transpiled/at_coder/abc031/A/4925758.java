public static int A = Integer . parseInt ( input ) {
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( A + 1 ) * D >= A * ( D + 1 ) ) {
    System . out . println ( ( A + 1 ) * D ) ;
  }
  else if ( ( A + 1 ) * D < A * ( D + 1 ) ) {
    System . out . println ( A * ( D + 1 ) ) ;
  }
  return A ;
}
