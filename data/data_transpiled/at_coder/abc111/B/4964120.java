public static int n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int num = 111 ;
  while ( num <= 999 ) {
    if ( n <= num ) {
      System . out . println ( num ) ;
      break ;
    }
    else {
      num += 111 ;
    }
  }
  return num ;
}
