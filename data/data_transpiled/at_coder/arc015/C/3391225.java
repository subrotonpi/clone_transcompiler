static final double [ ] [ ] G ( int input ) {
  System . setIn ( input ) ;
  int n = Integer . parseInt ( input ) ;
  Set < Integer > x = new HashSet < Integer > ( ) , y = new HashSet < Integer > ( ) , z = new HashSet < Integer > ( ) , num = 1 , n1 = 0 , n2 = Double . MAX_VALUE ;
  {
    int l = input ;
    int m = input ;
    int s = input ;
    int m = input ;
    if ( l % b != 0 ) return gcd ( b , a % b ) ;
    else return b ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int l = input . nextInt ( ) ;
    int m = input . nextInt ( ) ;
    int s = input . nextInt ( ) ;
    if ( l >= 0 && s >= 0 ) {
      if ( z [ s ] - z [ l ] > 0 ) {
        int g = gcd ( y [ l ] * m , y [ s ] ) ;
        int gl = y [ s ] / g , gs = y [ l ] * m / g , zs = z [ s ] ;
        for ( int j = 0 ;
        j < z . length ;
        j ++ ) if ( z [ j ] == zs ) y [ s ] = y [ l ] * gs ;
        else if ( z [ l ] == zs ) y [ s ] *= gl ;
      }
    }
    else if ( l >= 0 ) y [ s ] = y [ l ] * m ;
    else if ( s >= 0 ) {
      int g = m / gcd ( y [ s ] , m ) ;
      if ( g - 1 != 0 ) for ( int j = 0 ;
      j < z . length ;
      j ++ ) if ( z [ j ] == zs ) y [ s ] *= g ;
    }
    y [ l ] = y [ s ] / m ;
    else y [ l ] = y [ l ] / m ;
    z [ s ] = z [ l ] ;
    num = 1 ;
    if ( m < 0 ) a1 = n1 ;
    else n1 = m ;
    if ( n2 > 0 ) a2 = n2 ;
    else n2 = m ;
  }
  System . out . println ( "1" + a2 + "=" + ( n1 / n2 ) + a1 ) ;
  return x ;
}
