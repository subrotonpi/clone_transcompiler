@ Nullable private static String format ( @ NotNull String text , @ NotNull String ... args ) {
  final StringBuilder out = new StringBuilder ( ) ;
  final int h = args . length ;
  int cur = args [ 0 ] . length ( ) ;
  int n = 0 ;
  int s = 0 ;
  int e = 0 ;
  int w = cur ;
  if ( h - 1 >= 0 ) {
    n = args [ 0 ] . length ( ) ;
  }
  int sink = 0 ;
  for ( int y = 0 ;
  y < w ;
  y ++ ) {
    int coords = draincoords ( args , y , x ) ;
    if ( ! ( coords > 0 ) ) {
      char basin = ( char ) ( 'A' + ++ sink ) ;
    }
    else {
      int yy = coords ;
      dmap [ y ] [ x ] = dmap [ yy ] ;
    }
  }
  out . append ( "Case #" + ( h + 1 ) + ":\n" ) ;
  Map < Integer , String > bmap = new HashMap < > ( ) ;
  bmap . clear ( ) ;
  for ( int y = 0 ;
  y < w ;
  y ++ ) {
    int sink = follow2 ( args , y , x ) ;
    String basin = bmap . get ( sink ) ;
    if ( ! ( basin == null ) ) {
      basin = ( char ) ( 'a' + ++ sink ) ;
    }
    if ( ! ( seq [ y ] . equals ( "" ) ) ) {
      w = seq [ y ] . length ( ) ;
    }
    int lowest = min ( cur , n , s , e , w ) ;
    if ( lowest == cur ) return null ;
    if ( lowest == n ) return ( y - 1 ) ;
    if ( lowest == w ) return ( y , x - 1 ) ;
    if ( lowest == e ) return ( y , x + 1 ) ;
    if ( lowest == s ) return ( y + 1 ) ;
    assert false ;
  }
  /* follow */
  Object next = args [ 0 ] ;
  if ( next instanceof String ) return null ;
  List < String > chain = new ArrayList < > ( ) ;
  chain . add ( args [ 1 ] ) ;
  next = args [ 0 ] ;
  while ( ! ( next instanceof String ) ) {
    if ( chain . contains ( "B-small-attempt0.txt" ) ) {
      System . out . println ( " " + chain ) ;
      debugger ( ) ;
    }
    assert ! chain . contains ( next ) ;
    chain .