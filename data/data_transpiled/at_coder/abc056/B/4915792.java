public static int w ( int a , int b ) {
  int x , y ;
  w = Integer . parseInt ( input . nextLine ( ) ) ;
  a = Integer . parseInt ( input . nextLine ( ) ) ;
  b = Integer . parseInt ( input . nextLine ( ) ) ;
  x = Math . min ( a , b ) ;
  y = Math . max ( a , b ) ;
  if ( x + w >= y ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( y - x - w ) ;
  }
  return x ;
}
