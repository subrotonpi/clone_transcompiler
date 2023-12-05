static final String INPUT = "tiny" ;
final String INPUT = "C-large.in" ;
class Prime {
  private final List < Integer > primes = new ArrayList < Integer > ( ) ;
  private final int N = Integer . parseInt ( INPUT ) ;
  private final int T = Integer . parseInt ( INPUT ) ;
  private final int N = 2 ;
  public void primeLoop ( final int S ) {
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      final int n = Integer . parseInt ( INPUT ) ;
      if ( n >= S ) {
        primes . add ( n ) ;
      }
    }
    int toCheck = primes . get ( primes . size ( ) - 1 ) ;
    while ( true ) {
      toCheck ++ ;
      if ( isPrime ( toCheck ) ) {
        primes . add ( toCheck ) ;
        if ( n >= S ) {
          primes . add ( toCheck ) ;
        }
      }
    }
  }
  public boolean isPrime ( final int n ) {
    if ( primes . contains ( n ) ) return true ;
    if ( n < primes . size ( ) - 1 ) return false ;
    for ( final int p : primes ) {
      if ( p * p > n ) return true ;
      if ( n % p == 0 ) return false ;
    }
    return false ;
  }
  private final Set < Integer > PRIMES = new HashSet < Integer > ( ) ;
  for ( final Integer i : Prime . primeLoop ( ) ) {
    if ( i > 10000 ) break ;
    PRIMES . add ( i ) ;
  }
  public static void debug ( final int ... args ) {
    return ;
    System . err . println ( Arrays . toString ( args ) ) ;
  }
  private static void findNextCoin ( int fv ) {
    while ( true ) {
      final String fv_bin = Integer . toBinaryString ( fv ) ;
      final List < Integer > divs = new ArrayList < Integer > ( ) ;
      for ( int k = 2 ;
      k < 11 ;
      k ++ ) {
        final int v = Integer . parseInt ( fv_bin , k ) ;
        for ( final int p : PRIMES ) {
          if ( v % p == 0 ) {
            divs . add ( p ) ;
            if ( divs . size ( ) == 9 ) {
              return ;
            }
            break ;
          }
        }
        else break ;
      }
      fv += 2 ;
    }
  }
  public static void doTrial ( final int N , final int J ) {
    int fv = ( 1 << ( N - 1 ) ) + 1 ;
    final List < Integer > out = new