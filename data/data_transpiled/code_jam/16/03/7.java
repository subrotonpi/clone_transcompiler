@ Test public static final String TEST = "large" ;
final String IN = "C-" + TEST + ".in" ;
final String OUT = "C-" + TEST + ".out" ;
final int MAX_PRIME = 10000 ;
{
  final boolean [ ] p = new boolean [ MAX_PRIME ] ;
  Arrays . fill ( p , true ) ;
  p [ 0 ] = p [ 1 ] = false ;
  for ( int i = 0 ;
  i < lim ;
  i ++ ) {
    if ( p [ i ] ) {
      for ( int j = i * 2 ;
      j < lim ;
      j += i ) {
        p [ j ] = false ;
      }
    }
  }
  final List < Integer > primes = sieve ( MAX_PRIME ) ;
  return primes . stream ( ) . map ( s -> {
    final List < Integer > r = new ArrayList < > ( ) ;
    for ( int b = 2 ;
    b < 11 ;
    b ++ ) {
      final int x = Integer . parseInt ( s , b ) ;
      for ( int p : primes ) {
        if ( x % p == 0 ) {
          r . add ( p ) ;
          break ;
        }
      }
    }
    return null ;
  }
  ) . collect ( Collectors . toList ( ) ) ;
}
