public static int w ( int a , int b ) {
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a < b ) {
    System . out . println ( Math . max ( 0 , b - ( a + w ) ) ) ;
  }
  else if ( a > b ) {
    System . out . println ( Math . max ( 0 , a - ( b + w ) ) ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
  return a ;
}
