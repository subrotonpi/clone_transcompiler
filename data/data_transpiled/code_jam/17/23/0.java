@ System . out . sys . stdin . public static int [ ] getInts ( ) {
  return new int [ ] {
    Integer . parseInt ( stdin . readLine ( ) ) }
    ;
    /* solve the N and D */
    for ( int j : xrange ( N ) ) {
      for ( int i : xrange ( N ) ) {
        for ( int k : xrange ( N ) ) {
          D [ i ] [ k ] = Math . min ( D [ i ] [ k ] , D [ i ] [ j ] + D [ j ] [ k ] ) ;
        }
      }
    }
    final int infinity = 10 * 20 ;
    final int T = Integer . parseInt ( stdin . readLine ( ) ) ;
    for ( int cn = 1 ;
    cn <= 1 ;
    cn ++ ) {
      final int N = Integer . parseInt ( stdin . readLine ( ) ) ;
      final int Q = Integer . parseInt ( stdin . readLine ( ) ) ;
      final int [ ] E = new int [ N ] ;
      final int [ ] S = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        final int Ei = Integer . parseInt ( stdin . readLine ( ) ) ;
        final int Si = Integer . parseInt ( stdin . readLine ( ) ) ;
        E [ i ] = Ei ;
        S [ i ] = Si ;
      }
      final int [ ] [ ] D = new int [ N ] [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        D [ i ] [ i ] = i ;
      }
      Arrays . sort ( D ) ;
      for ( int k = 0 ;
      k < D . length ;
      k ++ ) {
        D [ i ] [ k ] = ( k == - 1 ? infinity : k ) ;
      }
      solve ( N , D ) ;
      D = new int [ N ] [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        D [ i ] [ k ] = i > E [ i ] ? infinity : ( double ) k / S [ i ] ;
      }
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        D [ i ] [ N ] = D [ i ] [ N ] ;
      }
      solve ( N , D ) ;
    }
    final List < Integer > questions = new ArrayList < Integer > ( ) ;
    for ( int z : xrange ( Q ) ) {
      questions . add ( z ) ;
    }
    final int [ ] answers = new int [ questions .