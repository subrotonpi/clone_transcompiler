static final double [ ] [ ] args ( double [ ] center , double [ ] point ) {
  final double [ ] [ ] args = new double [ 2 ] [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    args [ i ] = MathUtils . phase ( complex ( point [ 0 ] - center [ 0 ] , point [ 1 ] - center [ 1 ] ) ) ;
  }
  final int n = Integer . parseInt ( input ( ) ) ;
  final List < List < Integer >> dots = Arrays . asList ( Lists . newArrayList ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dots . add ( Lists . newArrayList ( ) ) ;
  }
  if ( n == 2 ) {
    System . out . println ( 0.5 ) ;
    System . out . println ( 0.5 ) ;
  }
  else {
    final List < Double > ans = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      final double d = dots . get ( i ) . get ( ) ;
      final List < Double > argList = new ArrayList < > ( ) ;
      for ( int e : dots ) {
        if ( d == e ) {
          continue ;
        }
        else {
          argList . add ( arg ( d , e ) ) ;
        }
      }
      Collections . sort ( argList ) ;
      boolean convex = false ;
      if ( argList . get ( argList . size ( ) - 1 ) - argList . get ( 0 ) <= Math . PI ) {
        convex = true ;
        final double theta = argList . get ( argList . size ( ) - 1 ) - argList . get ( 0 ) ;
        ans . add ( 0.5 - theta / ( 2 * Math . PI ) ) ;
      }
      else {
        for ( int i = 0 ;
        i < argList . size ( ) - 1 ;
        i ++ ) {
          if ( argList . get ( i + 1 ) - argList . get ( i ) >= Math . PI ) {
            convex = true ;
            final double theta = argList . get ( i + 1 ) - argList . get ( i ) ;
            ans . add ( theta / ( 2 * Math . PI ) - 0.5 ) ;
          }
        }
        if ( convex == false ) {
          ans . add ( 0 ) ;
        }
      }
    }
    for ( final Double a : ans ) {
      System . out . println ( a ) ;
    }
  }
  return ans . toArray ( new Double [ 0 ] [ ] ) ;
}
