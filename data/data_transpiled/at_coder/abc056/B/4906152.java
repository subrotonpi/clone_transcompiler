public static int w ( int a , int b ) {
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a + w < b ) {
    System . out . println ( b - ( a + w ) ) ;
  }
  else if ( b + w < a ) {
    System . out . println ( a - ( b + w ) ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
  return a ;
}
