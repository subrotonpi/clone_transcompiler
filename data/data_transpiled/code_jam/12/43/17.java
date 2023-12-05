static final Fraction [ ] range ( int i , int j , int N ) {
  final Fraction f = new Fraction ( ) {
    @ Override public int compareTo ( final int a , final int b ) {
      if ( v [ a ] == v [ b ] ) {
        return 0 ;
      }
      return f . compareTo ( v [ b ] - v [ a ] , b - a ) ;
    }
  }
  ;
  final int cases = Integer . parseInt ( input ( ) ) ;
  for ( int testCase = 0 ;
  testCase < cases ;
  testCase ++ ) {
    final int N = Integer . parseInt ( input ( ) ) ;
    final List < Integer > x = new LinkedList < > ( ) ;
    for ( String s : input ( ) . split ( " " ) ) {
      x . add ( Integer . parseInt ( s ) - 1 ) ;
    }
    boolean possible = true ;
    for ( int i = 0 ;
    i < x . size ( ) ;
    i ++ ) {
      final int xi = x . get ( i ) ;
      if ( xi > i + 1 ) {
        if ( max ( x . subList ( i + 1 , xi ) , xi ) > i ) {
          possible = false ;
          break ;
        }
      }
    }
    if ( ! possible ) {
      System . out . println ( "Case #" + ( testCase + 1 ) + ": " + "Impossible" ) ;
      continue ;
    }
    final int [ ] v = new int [ N ] ;
    v [ 0 ] = 1 ;
    boolean cg = true ;
    while ( cg ) {
      cg = false ;
      for ( int i = 0 ;
      i < x . size ( ) ;
      i ++ ) {
        final int xi = x . get ( i ) ;
        boolean cl = true ;
        while ( cl ) {
          cl = false ;
          if ( xi - i > 1 ) {
            while ( rat ( i , xi ) <= max ( rat ( i , j ) , v [ xi ] ) ) {
              v [ xi ] ++ ;
              cg = cl = true ;
            }
          }
          if ( N - xi > 1 ) {
            while ( rat ( i , xi ) < max ( rat ( i , j ) , v [ xi ] ) ) {
              v [ xi ] ++ ;
              cg = cl = true ;
            }
          }
        }
      }
    }
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + Arrays . toString ( v ) ) ;
  }
  return v ;
}
