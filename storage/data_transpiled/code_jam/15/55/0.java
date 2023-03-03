static void reader ( Input inFile ) {
  final int n = inFile . getInts ( ) ;
  final int d = inFile . getInts ( ) ;
  final int [ ] seq = inFile . getInts ( ) ;
  reader ( n , d , seq ) ;
}
{
  final Set < Integer > myseq = Arrays . asList ( seq ) ;
  final Set < Integer > w = Arrays . asList ( seq [ i ] - seq [ i - 1 ] ) ;
  for ( int k : xrange ( 1 , 6 ) ) {
    Set < Integer > x = new HashSet < Integer > ( ) ;
    for ( int j : xrange ( 8 ) ) {
      if ( ( w . get ( j ) + w . get ( j + D ) ) % 2 == 1 ) {
        return false ;
      }
    }
    Set < Integer > y = new HashSet < Integer > ( ) ;
    for ( int j : xrange ( 8 ) ) {
      if ( ( w . get ( j ) + w . get ( j + D ) ) % 2 == 1 ) {
        return false ;
      }
      else {
        int scr = ( w . get ( j ) - w . get ( j + D ) ) / 2 ;
        if ( w . get ( j ) >= w . get ( j + D ) ) {
          tot += scr ;
          myseq = Arrays . asList ( a . subList ( 0 , j ) . subList ( j , j + D ) ) ;
          x2 = new HashSet < Integer > ( ) ;
          for ( int z : myseq ) {
            if ( z + w . get ( j ) <= k ) {
              y . add ( z ) ;
            }
          }
          if ( ! x . contains ( myseq ) && ( j + D < 4 ) ) {
            return false ;
          }
          w . set ( j , ( w . get ( j ) + w . get ( j + D ) ) / 2 ) ;
        }
      }
    }
    if ( D == 1 ) {
      break ;
    }
    D = D >> 1 ;
  }
}
