@ functools . lru_cache ( maxsize = 2 ) public static int fib ( int n ) {
  if ( n < 2 ) return 1 ;
  return fib ( n - 1 ) + fib ( n - 2 ) ;
}
