static boolean isPrime ( int x ) {
  final int n ;
  if ( x == 1 ) {
    return false ;
  }
  for ( int i = 2 ;
  i <= ( int ) m . sqrt ( x ) ;
  i ++ ) {
    if ( x % i == 0 ) {
      return false ;
    }
  }
  return true ;
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( isPrime ( n ) ) {
    System . out . println ( "Prime" ) ;
    exit ( 0 ) ;
  }
  if ( n > 1 && n % 2 != 0 && n % 5 != 0 && ( n % 9 ) % 3 != 0 ) {
    System . out . println ( "Prime" ) ;
  }
  else {
    System . out . println ( "Not Prime" ) ;
  }
  return false ;
}
