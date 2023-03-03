@ VisibleForTesting static int factorial ( ) {
  int n = factorial ( Integer . parseInt ( input ) ) ;
  int cnt = 2 ;
  int k = 1 ;
  int ans = 1 ;
  while ( n != 1 ) {
    if ( n % cnt == 0 ) {
      n /= cnt ;
      k = k + 1 ;
    }
    else {
      ans = ans * k ;
      k = 1 ;
      cnt ++ ;
    }
  }
  int anw = ( ans * k ) % ( 10 * 9 + 7 ) ;
  return anw ;
}
