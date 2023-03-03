public static double getW ( ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Double . compare ( W / H , 4 / 3 ) == 0 ) {
    System . out . println ( "4:3" ) ;
  }
  else if ( Double . compare ( W / H , 16 / 9 ) == 0 ) {
    System . out . println ( "16:9" ) ;
  }
  return W ;
}
