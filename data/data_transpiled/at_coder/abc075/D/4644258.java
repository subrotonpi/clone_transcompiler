public static int [ ] [ ] getCoordinates ( String input , int n , int k ) {
  int [ ] p = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  List < Integer > xlist = new ArrayList < > ( ) ;
  List < Integer > ylist = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    xlist . add ( i ) ;
    ylist . add ( i ) ;
  }
  Collections . sort ( xlist ) ;
  Collections . sort ( ylist ) ;
  int [ ] [ ] cum = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      cum [ i + 1 ] [ j + 1 ] = cum [ i + 1 ] [ j ] + cum [ i ] [ j + 1 ] - cum [ i ] [ j ] + ( ( xlist . get ( i ) == ylist . get ( j ) ) ? 1 : 0 ) ;
    }
  }
  int minarea = 10 * 20 ;
  for ( int l = 0 ;
  l < n - 1 ;
  l ++ ) {
    for ( int r = l + 2 ;
    r < n + 1 ;
    r ++ ) {
      for ( int u = 0 ;
      u < n - 1 ;
      u ++ ) {
        for ( int d = u + 2 ;
        d < n + 1 ;
        d ++ ) {
          int point = cum [ r ] [ d ] - cum [ l ] [ d ] - cum [ r ] [ u ] + cum [ l ] [ u ] ;
          if ( point == k ) {
            minarea = Math . min ( minarea , ( xlist . get ( r - 1 ) - xlist . get ( l ) ) * ( ylist . get ( d - 1 ) - ylist . get ( u ) ) ) ;
          }
        }
      }
    }
  }
  System . out . println ( minarea ) ;
  return cum ;
}
