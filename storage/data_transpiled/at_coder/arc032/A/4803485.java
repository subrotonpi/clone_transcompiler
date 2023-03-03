public static boolean isPrime ( int n ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int n ;
  if ( n == 1 ) {
    return false ;
  }
  for ( int i = 2 ;
  i <= ( int ) ( n * 0.5 ) ;
  i ++ ) {
    if ( n % i == 0 ) {
      return false ;
    }
  }
  return true ;
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( isPrime ( n * ( n + 1 ) / 2 ) ) {
    System . out . println ( "WANWAN" ) ;
  }
  else {
    System . out . println ( "BOWWOW" ) ;
  }
  return false ;
}
