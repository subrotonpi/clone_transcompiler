public static long ss ( long n ) {
  return n / s ( n ) ;
  /* s(n) = Long.valueOf(Long.toString(n));*/
  long K = Long . parseLong ( input . nextLine ( ) ) ;
  long n = 0 ;
  long d = 1 ;
  while ( K > 0 ) {
    long t1 = ss ( n + d ) ;
    long t2 = ss ( n + 10 * d ) ;
    if ( t1 > t2 ) d *= 10 ;
    n += d ;
    System . out . println ( n ) ;
    K -- ;
  }
  return n ;
}
