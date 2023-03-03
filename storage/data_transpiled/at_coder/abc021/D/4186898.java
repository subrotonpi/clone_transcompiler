@ MoreRequires ( "x" ) @ SqlType ( StandardTypes . BIGINT ) public static long expMod ( @ SqlType ( StandardTypes . BIGINT ) long a , @ SqlType ( StandardTypes . BIGINT ) long n , @ SqlType ( StandardTypes . BIGINT ) long m ) {
  long r = 1 ;
  while ( n > 0 ) {
    if ( ( n & 1 ) != 0 ) {
      r = r * a % m ;
      a = a * a % m ;
      n >>>= 1 ;
    }
  }
  return r ;
}
