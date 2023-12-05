public static void SegmentTree ( ) {
  __slots__ . put ( "eleSize" , "tree" ) ;
  __slots__ . put ( "default" , "op" ) ;
  {
    @ SuppressWarnings ( "resource" ) final int realSize = a . size ( ) ;
    int eleSize = 1 << ceil ( log ( realSize , 2 ) ) ;
    tree = tree = new int [ eleSize * 2 ] ;
    vertices = euler_tour ( edges ) ;
    SegmentTree segmentTree = new SegmentTree ( treeDepth , 10 * 9 , min ) ;
    for ( int i = 0 ;
    i < edges . length ;
    i ++ ) {
      int a = Integer . parseInt ( Integer . toString ( edges [ i ] ) ) ;
      int b = Integer . parseInt ( Integer . toString ( edges [ i ] ) ) ;
      int left = vertices [ a - 1 ] ;
      int right = vertices [ b - 1 ] ;
      if ( left > right ) left = right = left ;
      int d = segmentTree . getValue ( left , right + 1 ) ;
      System . out . println ( treeDepth [ left ] + treeDepth [ right ] - 2 * d + 1 ) ;
    }
  }
  {
    int l , r ;
    int [ ] tree , result , op ;
    int i ;
    int k ;
    int l = x + eleSize , r = y + eleSize ;
    tree = tree [ k ] ;
    result = tree [ k ] ;
    op = tree [ k ] ;
    while ( l < r ) {
      if ( ( l & 1 ) != 0 ) result = op . apply ( tree [ l ] , result ) ;
      ++ l ;
      if ( ( r & 1 ) != 0 ) {
        -- r ;
        result = op . apply ( tree [ r ] , result ) ;
      }
      l = l >> 1 ;
      r = r >> 1 ;
    }
    return result ;
  }
  void setValue ( int i , int value ) {
    int k = eleSize + i ;
    tree [ k ] = value ;
    update ( k ) ;
  }
  void update ( int i ) {
    op = tree [ i ] ;
    tree [ i ] = tree [ i ] ;
    while ( i > 1 ) {
      int v = index + 1 ;
      int depth = pop ( ) ;
      treeDepth [ v ] = depth ;
      if ( vertices [ v ] > - 1 ) continue ;
      vertices [ v ] = index ;
      append ( ( tree [ v ] << 1 ) , tree [ ( i << 1 ) + 1 ] ) ;
    }
  }
}
