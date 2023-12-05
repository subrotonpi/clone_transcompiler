static boolean isPrime ( int x ) {
  final int n ;
  if ( x < 2 ) {
    return false ;
  }
  else {
    final int t = ( int ) Math . sqrt ( x ) + 1 ;
    for ( n = 2 ;
    n < t ;
    n ++ ) {
      if ( x % n == 0 ) {
        return false ;
      }
    }
    return true ;
  }
  n = Integer . parseInt ( input ( ) ) ;
  int cnt = 0 ;
  final List < Integer > ans = new ArrayList < Integer > ( ) ;
  for ( int num = 2 ;
  num < 55555 ;
  num ++ ) {
    if ( isPrime ( num ) && num % 5 == 1 ) {
      cnt ++ ;
      ans . add ( num ) ;
    }
    if ( cnt == n ) {
      break ;
    }
  }
  return ans . isEmpty ( ) ;
}
