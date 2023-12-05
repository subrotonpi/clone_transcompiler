static final int input ( ) {
  int a , b , x ;
  a = Integer . parseInt ( input . readLine ( ) ) ;
  b = Integer . parseInt ( input . readLine ( ) ) ;
  x = Integer . parseInt ( input . readLine ( ) ) ;
  if ( a % x > 0 && b / x - a / x == 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( ( b / x ) - Math . ceil ( a / x ) + 1 ) ;
  }
  return a ;
}
