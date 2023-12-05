public static long s ( long n ) {
  if ( n < 10 ) {
    return n ;
  }
  else {
    return n % 10 + s ( n / 10 ) ;
  }
  long n = 0 ;
  for ( ;
  ;
  ) {
    n ++ ;
    long minn = n ;
    long d = 1 ;
    while ( n >= d ) {
      d *= 10 ;
      long m = ( n / d + 1 ) * d - 1 ;
      if ( minn * s ( m ) > m * s ( minn ) ) {
        minn = m ;
      }
    }
    n = minn ;
    System . out . println ( n ) ;
  }
}
