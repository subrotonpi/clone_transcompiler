@ GwtIncompatible ( "java.util.Scanner" ) public static int [ ] [ ] solve ( final String input ) {
  final int N = input . length ( ) ;
  final int [ ] [ ] ls = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) ls [ i ] = input . toCharArray ( ) ;
  final Set < Integer > multiples = new HashSet < Integer > ( ) {
    {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          ls [ i ] [ j ] = i ;
        }
      }
    }
    ;
  }
  final Set < Integer > value = new HashSet < Integer > ( ) {
    {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          a [ i ] [ j ] = i ;
        }
      }
    }
  }
  ;
  final Set < List < Integer >> tuples = new HashSet < List < Integer >> ( ) {
    {
      {
        if ( m == 0 ) return new ArrayList < Integer > ( ) ;
      }
    }
  }
  ;
  final List < List < Integer >> ts = tuples . subList ( m - 1 , N ) ;
  if ( ts . isEmpty ( ) ) return ts . toArray ( new List < Integer > [ 0 ] ) ;
  final List < Integer > ls = new ArrayList < Integer > ( ) ;
  for ( List < Integer > t : ts . get ( ts . size ( ) - 1 ) ) {
    final int lc = t . size ( ) > 0 ? lcm ( t . get ( 0 ) ) : 1 ;
    final int mi = t . size ( ) > 0 ? Math . min ( t . get ( 0 ) , N + 1 ) : N + 1 ;
    for ( int i = mi - 1 ;
    i >= 0 ;
    i -- ) {
      if ( lcm ( lc , i ) > N ) continue ;
      if ( ContainerUtil . find ( ls , i % i == 0 ? j : i ) < 0 ) continue ;
      ls . add ( new Integer ( i ) + t ) ;
    }
  }
  ts . add ( ls ) ;
  return ts . toArray ( new List < Integer > ( ) ) ;
}
