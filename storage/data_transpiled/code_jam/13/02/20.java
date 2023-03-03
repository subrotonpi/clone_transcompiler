static boolean ok ( int [ ] [ ] arr ) {
  final int [ ] [ ] gg = new int [ arr [ 0 ] . length ] [ arr . length ] ;
  for ( int i = 0 ;
  i < arr . length ;
  i ++ ) if ( Arrays . equals ( arr [ i ] , arr [ i ] ) ) gg [ i ] = new int [ arr [ i ] . length ] ;
  for ( int i : xrange ( arr [ 0 ] . length ) ) if ( Arrays . equals ( arr [ k ] [ i ] , arr [ i ] ) ) for ( int k = 0 ;
  k < arr . length ;
  k ++ ) gg [ k ] [ i ] = 1 ;
  for ( int i = 0 ;
  i < arr . length ;
  i ++ ) for ( int j = 0 ;
  j < arr [ i ] . length ;
  j ++ ) if ( arr [ i ] [ j ] != null && ! gg [ i ] [ j ] ) return false ;
  return true ;
}
