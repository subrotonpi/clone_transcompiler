public static int W = Integer . parseInt ( input ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( H / W == 0.75 ) {
    System . out . println ( "4:3" ) ;
  }
  else {
    System . out . println ( "16:9" ) ;
  }
  return W ;
}
