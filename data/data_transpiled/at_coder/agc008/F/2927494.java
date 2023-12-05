static final int [ ] [ ] solve ( ) throws IOException {
  final int INFINITY = 100000000 ;
  {
    final int INF = INFINITY ;
    final int firstNL = inputString . indexOf ( '\n' ) ;
    final int n = Integer . parseInt ( inputString . substring ( 0 , firstNL ) ) ;
    final int [ ] favPattern = new int [ n ] ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      favPattern [ i ] = Integer . parseInt ( inputString . substring ( firstNL + 1 , i ) . replace ( " " , "," ) . replace ( "\n" , "," ) + "]" ) ;
    }
    final int [ ] edges = JsonUtils . parseArray ( "[" + inputString . substring ( firstNL + 1 , n - 2 ) . replace ( " " , "," ) . replace ( "\n" , "," ) + "]" ) ;
    final int [ ] graph = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      graph [ i ] = new int [ n ] ;
    }
    graph [ 0 ] [ 0 ] = null ;
    for ( int i = 0 ;
    i < ( n - 1 ) * 2 ;
    i += 2 ) {
      final int a = edges [ i ] - 1 ;
      final int b = edges [ i + 1 ] - 1 ;
      graph [ a ] [ b ] = a ;
      graph [ b ] [ a ] = a ;
    }
    return new int [ ] [ ] {
      n , favPattern , graph }
      ;
    }
    {
      final int INF = INFINITY ;
      final int n = Integer . parseInt ( System . in . read ( ) ) ;
      final int [ ] favCount = {
        0 }
        ;
        final int [ ] graph = JsonUtils . parseArray ( "[" + inputString . substring ( firstNL + 1 , n - 2 ) . replace ( " " , "," ) . replace ( "\n" , "," ) + "]" ) ;
        final int [ ] height1 = new int [ n ] ;
        final int [ ] height2 = new int [ n ] ;
        final int [ ] dfsOrder = new int [ n ] ;
        final int [ ] stack = {
          null , 0 , 0 }
          ;
          do {
            final int node = stack [ -- - 1 ] ;
            final int index = stack [ -- - 2 ] ;
            if ( index < 0