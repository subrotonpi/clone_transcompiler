public static int W = Integer . parseInt ( input ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( W % 16 == 0 && H % 9 == 0 ) {
    System . out . println ( "16:9" ) ;
  }
  else {
    System . out . println ( "4:3" ) ;
  }
  return W ;
}
