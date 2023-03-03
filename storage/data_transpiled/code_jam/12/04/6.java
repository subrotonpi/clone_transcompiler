@ VisibleForTesting static boolean isReflection ( String className , String sx , String sy , Set < Pair < Integer , Integer >> steps ) {
  final Map < String , String > cache = new HashMap < String , String > ( ) ;
  {
    int x = sx ;
    int y = sy ;
    boolean rx = false ;
    boolean ry = false ;
    for ( int i = 0 ;
    i < steps . size ( ) ;
    i ++ ) {
      if ( cache . containsKey ( x + i ) ) {
        return cache . get ( x + i ) . equals ( "#" ) ;
      }
      cache . put ( x + i , "#" + i ) ;
      return cache . get ( x + i ) . equals ( "#" ) ;
    }
    {
      int [ ] values = ArrayUtil . split ( args , " " ) ;
      int H = values [ 0 ] ;
      int [ ] D = values [ 1 ] ;
      int [ ] m = new int [ H ] ;
      for ( int i = 0 ;
      i < H ;
      i ++ ) {
        m [ i ] = values [ 1 ] ;
      }
      int [ ] result = countReflections ( m , D ) ;
      System . out . println ( "Case #" + ( i + 1 ) + ": " + result ) ;
      return true ;
    }
  }
  {
    int [ ] m = new int [ steps . size ( ) ] ;
    for ( int i = 0 ;
    i < steps . size ( ) ;
    i ++ ) {
      int [ ] m = new int [ steps . size ( ) ] ;
      for ( int j = 0 ;
      j < steps . size ( ) ;
      j ++ ) {
        m [ i ] = values [ j ] ;
        if ( m [ i ] < 0 && m [ j ] == 0 ) {
          continue ;
        }
        if ( m [ i ] > 0 && m [ j ] < 0 ) {
          continue ;
        }
        int [ ] directions = new int [ steps . size ( ) ] ;
        for ( int j = 0 ;
        j < steps . size ( ) ;
        j ++ ) {
          directions [ j ] = i ;
          if ( directions [ j ] < 0 && directions [ j ] > 0 ) {
            continue ;
          }
        }
        int i = 0 ;
        int j = 0 ;
        int [ ] DXY = new int [ steps . size ( ) ] ;
        for ( int j = 0 ;
        j < steps . size ( ) ;
        j ++ ) {
          if ( squares . contains ( new Pair < Integer , Integer > ( i , j