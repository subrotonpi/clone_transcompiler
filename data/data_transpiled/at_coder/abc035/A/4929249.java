public static int [ ] getW ( ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( H / W == 9 / 16 ) ) {
    System . out . println ( "16:9" ) ;
  }
  else {
    System . out . println ( "4:3" ) ;
  }
  return new int [ ] {
    W , H }
    ;
  }
  