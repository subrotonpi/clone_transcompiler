public static String isPrime ( int N ) {
  for ( int i = 2 ;
  i < N ;
  i ++ ) {
    if ( ! ( N % i ) ) {
      return "NO" ;
    }
  }
  else {
    return "YES" ;
  }
}
