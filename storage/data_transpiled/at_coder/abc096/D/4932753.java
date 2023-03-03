public static int [ ] getPrime ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] primes = {
    2 , 3 , 5 , 7 }
    ;
    List < Integer > ans = new ArrayList < > ( ) ;
    for ( int n = 11 ;
    n <= 55555 ;
    n ++ ) {
      for ( int p : primes ) {
        if ( n % p == 0 ) {
          break ;
        }
      }
    }
    return ans . toArray ( ) ;
  }
  