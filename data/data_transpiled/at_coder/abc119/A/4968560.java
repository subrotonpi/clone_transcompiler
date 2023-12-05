public static int y ( ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( y > 2019 || y == 2019 && m > 4 ) {
    System . out . println ( "TBD" ) ;
  }
  else {
    System . out . println ( "Heisei" ) ;
  }
  return d ;
}
