private static int process ( int [ ] nodes , boolean [ ] changable , int goal ) {
  int inf = 99999999 ;
  int nnodes = nodes . length ;
  int [ ] [ ] table = new int [ nnodes ] [ ] ;
  for ( int i = xrange ( nnodes - 1 , - 1 , - 1 ) ;
  i < ( nnodes - 1 ) ;
  i ++ ) {
    int g , c ;
    int left = i * 2 + 1 ;
    int right = i * 2 + 2 ;
    int minchanges ;
    if ( changable [ i ] ) {
      if ( nodes [ i ] ) {
        value = new Integer ( Math . min ( table [ left ] [ 0 ] + table [ right ] [ 0 ] , table [ left ] [ 0 ] + table [ right ] [ 1 ] , table [ left ] [ 1 ] + table [ right ] [ 0 ] ) ) ;
      }
      else {
        nodes [ i ] = Integer . parseInt ( next ( ) ) ;
      }
    }
    minchanges = process ( nodes , changable , goal ) ;
    if ( minchanges > 9999999 ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": IMPOSSIBLE" ) ;
    }
    else {
      System . out . println ( "Case #" + ( i + 1 ) + ": " + minchanges ) ;
    }
    System . out . flush ( ) ;
  }
  else {
    if ( nodes [ i ] ) {
      value = new Integer ( Math . min ( table [ left ] [ 0 ] + table [ right ] [ 0 ] , table [ left ] [ 0 ] + table [ right ] [ 1 ] + 1 , table [ left ] [ 1 ] + table [ right ] [ 0 ] + 1 ) ) ;
    }
    else {
      value = new Integer ( 0 ) ;
    }
  }
  table [ i ] = value ;
  return table [ 0 ] [ goal ] ;
}
final int next = Integer . parseInt ( next ) ;
int ncases = Integer . parseInt ( next ) ;
for ( int i = xrange ( nnodes ) ;
i < ncases ;
i ++ ) {
  int nnodes = next ;
  int c = next ;
  table [ i ] [ goal ] = c ;
}
