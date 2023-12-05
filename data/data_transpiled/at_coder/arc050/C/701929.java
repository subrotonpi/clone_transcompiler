public static long modpowSum ( long a , long n , long m ) {
  if ( n == 0 ) return 0 ;
  else if ( n % 2 == 1 ) return ( 1 + a * modpowSum ( a , n - 1 , m ) ) % m ;
  else {
    long t = modpowSum ( a , n / 2 , m ) ;
    return ( t + ( t * pow ( a , n / 2 , m ) ) % m ) % m ;
  }
}
