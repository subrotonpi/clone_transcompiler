public static int n = 2025 - Integer . parseInt ( input ) {
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    if ( n % i < 1 && n / i < 10 ) System . out . println ( i + "x" + n / i ) ;
  }
  return n ;
}
