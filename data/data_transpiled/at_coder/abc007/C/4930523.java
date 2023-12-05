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
  List < Integer > [ ] m = new List [ r ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) m [ i ] = new List < Integer > ( input ) ;
  root [ sx ] [ sy ] = 0 ;
  Queue < Integer > celx = new LinkedList < Integer > ( ) ;
  Queue < Integer > cely = new LinkedList < Integer > ( ) ;
  int x = sx ;
  int y = sy ;
  while ( root [ gx ] [ gy ] == null ) {
    if ( x != 0 && m [ x - 1 ] [ y ] != '#' && root [ x - 1 ] [ y ] == null ) {
      root [ x - 1 ] [ y ] = root [ x ] [ y ] + 1 ;
      celx . add ( x - 1 ) ;
      cely . add ( y ) ;
    }
    if ( x != r - 1 && m [ x + 1 ] [ y ] != '#' && root [ x + 1 ] [ y ] == null ) {
      root [ x + 1 ] [ y ] = root [ x ] [ y ] + 1 ;
      celx . add ( x + 1 ) ;
      cely . add ( y ) ;
    }
    if ( y != 0 && m [ x ] [ y - 1 ] != '#' && root [ x ] [ y - 1 ] == null ) {
      root [ x ] [ y - 1 ] = root [ x ] [ y ] + 1 ;
      celx . add ( x ) ;
      cely . add ( y - 1 ) ;
    }
    if ( y != c - 1 && m [ x ] [ y + 1 ] != '#' && root [ x ] [ y + 1 ] == null ) {
      root [ x ] [ y + 1 ] = root [ x ] [ y ] + 1 ;
      celx . add ( x ) ;
      cely .