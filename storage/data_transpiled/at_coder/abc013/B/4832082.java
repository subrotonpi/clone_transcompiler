public static int a ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a < b ) {
    System . out . println ( Math . min ( b - a , a + 10 - b ) ) ;
  }
  else {
    System . out . println ( Math . min ( 10 - a + b , a - b ) ) ;
  }
  return a ;
}
