@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  int r = input . nextInt ( ) ;
  int c = input . nextInt ( ) ;
  int [ ] [ ] root = new int [ c ] [ r ] ;
  for ( int __ = 0 ;
  __ < r ;
  __ ++ ) root [ __ ] [ 0 ] = null ;
  int sx = input . nextInt ( ) ;
  int sy = input . nextInt ( ) ;
  int gx = input . nextInt ( ) ;
  int gy = input . nextInt ( ) ;
  sy -- ;
  sx -- ;
  gy -- ;
  gx -- ;
  List < Integer > m = new ArrayList < > ( ) ;
  for ( int __ = 0 ;
  __ < r ;
  __ ++ ) m . add ( Integer . valueOf ( input . nextInt ( ) ) ) ;
  root [ sx ] [ sy ] = 0 ;
  Queue < Integer > celx = new LinkedList < > ( ) ;
  Queue < Integer > cely = new LinkedList < > ( ) ;
  int x = sx ;
  int y = sy ;
  while ( root [ gx ] [ gy ] == null ) {
    if ( x != 0 && m . get ( x - 1 ) [ y ] != '#' && root [ x - 1 ] [ y ] == null ) {
      root [ x - 1 ] [ y ] = root [ x ] [ y ] + 1 ;
      celx . add ( x - 1 ) ;
      cely . add ( y ) ;
    }
    if ( x != r - 1 && m . get ( x + 1 ) [ y ] != '#' && root [ x + 1 ] [ y ] == null ) {
      root [ x + 1 ] [ y ] = root [ x ] [ y ] + 1 ;
      celx . add ( x + 1 ) ;
      cely . add ( y ) ;
    }
    if ( y != 0 && m . get ( x ) [ y - 1 ] != '#' && root [ x ] [ y - 1 ] == null ) {
      root [ x ] [ y - 1 ] = root [ x ] [ y ] + 1 ;
      celx . add ( x ) ;
      cely . add ( y - 1 ) ;
    }
    x = celx . poll ( ) ;
    y = cely . poll ( ) ;
  }
  System . out . println ( root [ gx ] [ gy ] ) ;
}
