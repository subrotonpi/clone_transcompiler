@ VisibleForTesting static int [ ] solve ( int d , int [ ] data ) {
  Range range = xrange ;
  final int [ ] result = new int [ data . length ] ;
  final int [ ] result = new int [ data . length ] ;
  final Class < ? > gcj = in . getClass ( ) ;
  final InputStream IN = System . in ;
  final byte [ ] buf = null ;
  final Function < Integer , Integer > identity = x -> {
    int res ;
    if ( buf != null ) {
      res = buf ;
      buf = null ;
    }
    else {
      res = IN . read ( ) ;
    }
    if ( res == null ) {
      throw new EOFException ( ) ;
    }
    return res ;
  }
  ;
  @ SuppressWarnings ( "resource" ) final int [ ] row = readLineRaw ( ) ;
  if ( row . length == 0 ) {
    result [ 0 ] = row [ 0 ] ;
  }
  else {
    result [ 0 ] = row [ 0 ] ;
  }
  int w = 2 * ( w - 1 ) ;
  int h = 2 * ( x - 1 ) + 1 ;
  int x = 2 * ( y - 1 ) + 1 ;
  d *= 2 ;
  final Set < Integer > ok = new HashSet < Integer > ( ) ;
  for ( int dx = - d ;
  dx <= d ;
  ++ dx ) {
    for ( int dy = - d ;
    dy <= d ;
    ++ dy ) {
      if ( dx == dy ) {
        continue ;
      }
      if ( dx * dx + dy * dy > d * d ) {
        continue ;
      }
      int tx = ( x + dx ) % ( 2 * h ) ;
      int ty = ( y + dy ) % ( 2 * w ) ;
      if ( tx == x || ty == y && ty == 2 * w - y ) {
        int g = ( x + dy ) % ( 2 * h ) ;
        if ( g == y ) {
          g = y ;
        }
      }
    }
  }
  @ SuppressWarnings ( "resource" ) final String line = readLineRaw ( ) ;
  return conv . apply ( line . replaceAll ( BIO . NEWLINE ) ) ;
}
