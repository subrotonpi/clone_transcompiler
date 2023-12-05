public static List < Integer > primeSieveMod ( int N ) {
  int mod = 5 ;
  List < Integer > primeList = new ArrayList < Integer > ( ) ;
  for ( int n = 2 ;
  n <= N ;
  n ++ ) {
    sieve = new LinkedList < Integer > ( ) ;
    for ( int i = 2 ;
    i <= n ;
    i ++ ) {
      sieve . add ( i ) ;
    }
    Collections . reverse ( sieve ) ;
    _prime . clear ( ) ;
    while ( sieve . size ( ) > 0 && _prime . size ( ) < N ) {
      int _num = sieve . remove ( ) ;
      if ( _num % mod == 1 ) {
        _prime . add ( _num ) ;
      }
      List < Integer > _del = new ArrayList < Integer > ( ) ;
      for ( int _i = 0 ;
      _i < _del . size ( ) ;
      _i ++ ) {
        _del . add ( _i ) ;
      }
    }
  }
  return primeList ;
}
