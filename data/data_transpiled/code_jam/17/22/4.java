private static String solve ( int n , int r , int o , int y , int g , int b , int v ) {
  assert n == r + o + y + g + b + v ;
  if ( g > r || v > y || o > b ) return "IMPOSSIBLE" ;
  if ( g == r && g > 0 ) {
    if ( v == y == o == b == 0 ) return "GR" . substring ( g ) ;
    return "IMPOSSIBLE" ;
  }
  if ( v == y && v > 0 ) {
    if ( g == r == o == b == 0 ) return "VY" . substring ( v ) ;
    return "IMPOSSIBLE" ;
  }
  if ( o == b && o > 0 ) {
    if ( g == r == v == y == 0 ) return "OB" . substring ( o ) ;
    return "IMPOSSIBLE" ;
  }
  /* mix the wrap ch */
  int wrapCh = mix ( "R" , r , "G" , g ) ;
  int insideCh = mix ( "B" , b , "O" , o ) ;
  int insideCount = mix ( "Y" , y , "V" , v ) ;
  int [ ] p = mix ( "P" , R , "G" , g ) ;
  int [ ] q = mix ( "Q" , B , "O" , o ) ;
  int [ ] r = mix ( "R" , r , "G" , Y ) ;
  if ( p . length + q . length < r . length ) return "IMPOSSIBLE" ;
  int [ ] [ ] slots = new int [ r . length ] [ ] ;
  for ( int i = 0 ;
  i < r . length ;
  ++ i ) slots [ i ] = new int [ p . length ] ;
  for ( int i = 0 ;
  i < p . length ;
  ++ i ) slots [ i ] [ 0 ] = p [ i ] ;
  for ( int i = 0 ;
  i < q . length ;
  ++ i ) slots [ -- i ] [ 0 ] = q [ i ] ;
  StringBuilder [ ] fragments = new StringBuilder [ r . length ] ;
  for ( int i = 0 ;
  i < r . length ;
  ++ i ) {
    fragments [ i ] = r [ i ] ;
    assert slots [ i ] != null ;
    fragments [ i ] = new StringBuilder ( slots [ i ] ) ;
  }
  