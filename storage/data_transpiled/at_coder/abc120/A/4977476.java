public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int res = 0 ;
  if ( a > b ) {
    res = 0 ;
  }
  else {
    res = b / a ;
  }
  if ( res <= c ) {
    System . out . println ( res ) ;
  }
  else {
    System . out . println ( c ) ;
  }
  return res ;
}
