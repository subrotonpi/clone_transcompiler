public static int max ( ) {
  int max = Integer . parseInt ( input . nextLine ( ) ) ;
  int sam = Integer . parseInt ( input . nextLine ( ) ) ;
  int samNum = Integer . parseInt ( input . nextLine ( ) ) ;
  int samlater = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( max < sam ) && ( samlater < max ) ) {
    System . out . println ( samNum * max ) ;
  }
  else {
    System . out . println ( samNum * sam + samlater * ( max - sam ) ) ;
  }
  return samNum ;
}
