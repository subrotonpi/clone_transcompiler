public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a == 0 ) {
    System . out . println ( ( int ) ( b / x ) + 1 ) ;
  }
  else {
    System . out . println ( ( int ) ( b / x ) + 1 - ( int ) ( ( a - 1 ) / x ) - 1 ) ;
  }
  return a ;
}
