public static int w ( int a , int b ) {
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Math . min ( a , b ) + w >= Math . max ( a , b ) ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( Math . max ( a , b ) - Math . min ( a , b ) - w ) ;
  }
  return w ;
}
