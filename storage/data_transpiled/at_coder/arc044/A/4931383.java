public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( judge ( n ) ) {
    System . out . println ( "Prime" ) ;
  }
  else {
    System . out . println ( "Not Prime" ) ;
  }
  /*judge(n);*/
  if ( isPrime ( n ) ) {
    return ;
  }
  if ( n == 1 ) {
    return ;
  }
  if ( n != 2 && n % 2 == 0 ) {
    return ;
  }
  int i = 3 ;
  while ( i * i <= n ) {
    if ( n % i == 0 ) {
      return ;
    }
    i += 2 ;
  }
}
