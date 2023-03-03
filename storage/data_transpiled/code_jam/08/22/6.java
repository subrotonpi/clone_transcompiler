@ VisibleForTesting static void main ( Scanner in ) {
  final int MAX = 1000000 ;
  final Set < Integer > primes = Sets . newHashSet ( xrange ( 2 , MAX ) , range ( 2 , MAX ) ) ;
  for ( int p : xrange ( 2 , MAX ) ) {
    if ( primes . contains ( p ) ) {
      for ( int i : xrange ( 2 * p , MAX , p ) ) {
        if ( primes . contains ( i ) ) {
          primes . remove ( i ) ;
        }
      }
    }
  }
  final int tno = in . nextInt ( ) ;
  for ( int j = 0 ;
  j < xrange ( tno ) ;
  j ++ ) {
    final long A = in . nextLong ( ) ;
    final long B = in . nextLong ( ) ;
    final long P = in . nextLong ( ) ;
    final int [ ] tab = new int [ B - A + 1 ] ;
    final int [ ] pr = Arrays . copyOf ( primes , primes . length ) ;
    for ( int i = 0 ;
    i < pr . length ;
    i ++ ) {
      pr [ i ] = pr [ i ] ;
    }
    int hm = 0 ;
    final List < Integer > [ ] ed = new ArrayList [ B - A + 1 ] ;
    for ( int i = 0 ;
    i < ed . length ;
    i ++ ) {
      ed [ i ] = new ArrayList < Integer > ( ) ;
    }
    for ( int i = 0 ;
    i < pr . length ;
    i ++ ) {
      for ( int p : pr [ i ] ) {
        final long f = ( ( A + p - 1 ) / p ) * p - A ;
        for ( int x : xrange ( f , B - A + 1 , p ) ) {
          if ( x != f ) {
            ed [ x - p ] . add ( x ) ;
            ed [ x ] . add ( x - p ) ;
          }
        }
      }
    }
    for ( int i : xrange ( B - A + 1 ) ) {
      if ( tab [ i ] != - 1 ) continue ;
      final Queue < Integer > q = new LinkedList < Integer > ( ) ;
      q . add ( new Integer ( i ) ) ;
      tab [ i ] = - 1 ;
      while ( q . size ( ) > 0 ) {
        final int x = q . poll ( ) ;
        for ( int e : ed [ x ] ) {
          if ( tab [ e ] == - 1 ) {
            tab [ e ] = i ;
            q . add ( e ) ;
          }
        }
      }
      hm ++ ;
      q . remove ( )