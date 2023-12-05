@ Nullable public static CopyPasteManager getInstance ( ) {
  boolean [ ] [ ] coord1 = new boolean [ 10 ] [ 10 ] ;
  boolean [ ] [ ] coord2 = new boolean [ 10 ] [ 10 ] ;
  /* Visit the first 10 to the second 10 to the second 10 */
  if ( y < 0 || 10 <= y || x < 0 || 10 <= x ) return null ;
  if ( ! coord2 [ y ] [ x ] ) return null ;
  coord2 [ y ] [ x ] = false ;
  /* Visit the second 10 to the second 10 to the second 10 to the second 10 */
  for ( int y = 0 ;
  y < 10 ;
  y ++ ) for ( int x = 0 ;
  x < 10 ;
  x ++ ) {
    if ( coord2 [ y ] [ x ] ) return null ;
  }
  /* Check the first 10 to the second 10 to the second 10 to the second 10 */
  for ( int y = 0 ;
  y < 10 ;
  y ++ ) {
    for ( int x = 0 ;
    x < 10 ;
    x ++ ) {
      if ( coord2 [ y ] [ x ] ) return null ;
    }
  }
  /* Main program */
  for ( int y = 0 ;
  y < 10 ;
  y ++ ) {
    coord1 [ y ] [ x ] = true ;
  }
  boolean checked = false ;
  for ( int y = 0 ;
  y < 10 ;
  y ++ ) {
    for ( int x = 0 ;
    x < 10 ;
    x ++ ) {
      if ( ! coord1 [ y ] [ x ] ) continue ;
      coord2 = new boolean [ 10 ] [ 10 ] ;
      coord1 [ y ] [ x ] = true ;
      coord2 = new boolean [ 10 ] [ 10 ] ;
      coord2 [ y ] [ x ] = false ;
    }
  }
  /* Check the second 10 to the second 10 to the second 10 to the second 10 */
  for ( int y = 0 ;
  y < 10 ;
  y ++ ) {
    for ( int x = 0 ;
    x < 10 ;
    x ++ ) {
      if ( coord1 [ y ] [ x ] ) continue ;
      coord1 [ y ] [ x ] = true ;
      coord2 = new boolean [ 10 ] [ 10 ]