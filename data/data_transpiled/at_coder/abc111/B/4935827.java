static final int solve ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a , b ;
  a = n / 100 ;
  b = n % 100 ;
  if ( ( n % 111 ) == 0 ) {
    System . out . println ( n ) ;
    System . exit ( 0 ) ;
  }
  if ( ( 11 * a ) > b ) {
    System . out . println ( 111 * a ) ;
  }
  else {
    System . out . println ( 111 * ( a + 1 ) ) ;
  }
  return a ;
}
