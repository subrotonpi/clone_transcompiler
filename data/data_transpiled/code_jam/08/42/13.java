private static Coordinate process ( int n , int m , int a ) {
  if ( n * m < a ) return null ;
  for ( int x1 : xrange ( n + 1 ) ) {
    for ( int y1 : xrange ( m + 1 ) ) {
      for ( int x2 : xrange ( Math . max ( x1 - n , - n ) , Math . min ( x1 + n , n ) + 1 ) ) {
        for ( int y2 : xrange ( Math . max ( y1 - m , - m ) , Math . min ( y1 + m , m ) + 1 ) ) {
          if ( Math . abs ( x2 * y1 - y2 * x1 ) == a ) {
            int xmin = - Math . min ( 0 , x1 , x2 ) ;
            int ymin = - Math . min ( 0 , y1 , y2 ) ;
            return new Coordinate ( new Coordinate ( xmin , ymin ) , new Coordinate ( x1 + xmin , y1 + ymin ) , new Coordinate ( x2 + xmin , y2 + ymin ) ) ;
          }
        }
      }
    }
  }
  return null ;
}
final String next = new Scanner ( System . in ) . next ( ) ;
final int ncases = Integer . parseInt ( next ) ;
for ( int i = xrange ( ncases ) ;
i < ncases ;
i ++ ) {
  n = Integer . parseInt ( next ) ;
  m = Integer . parseInt ( next ) ;
  a = Integer . parseInt ( next ) ;
  Coordinate [ ] coords = process ( n , m , a ) ;
  if ( coords == null ) {
    System . out . println ( String . format ( "Case #%d: IMPOSSIBLE" , i + 1 ) ) ;
  }
  else {
    assert Math . abs ( ( coords [ 2 ] . x - coords [ 0 ] . x ) * ( coords [ 1 ] . y - coords [ 0 ] . y ) - ( coords [ 1 ] . x - coords [ 0 ] . x ) * ( coords [ 2 ] . y - coords [ 0 ] . y ) ) == a ;
    System . out . println ( String . format ( "Case #%d: %d %d %d %d %d %d" , i + 1 , coords [ 0 ] . x , coords [ 0 ] . y , coords [ 1 ] . x , coords [ 2 ] . y , coords [ 2 ] . x , coords [ 2 ] . y ) ) ;
  }
  System . out . flush ( ) ;
}
