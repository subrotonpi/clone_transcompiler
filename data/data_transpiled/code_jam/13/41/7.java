static final String solve ( String input ) throws IOException {
  final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int num = Integer . parseInt ( br . readLine ( ) ) ;
  final double cost = cost * N - ( N - 1 ) * N / 2 ;
  for ( int i = 0 ;
  i < xrange ( num ) ;
  i ++ ) {
    String l = br . readLine ( ) ;
    final int N = Integer . parseInt ( l ) ;
    final int M = Integer . parseInt ( l ) ;
    final int [ ] [ ] pa = new int [ M ] [ ] ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      l = br . readLine ( ) ;
      pa [ j ] = new int [ N ] ;
      for ( int k = 0 ;
      k < N ;
      k ++ ) pa [ j ] [ k ] = Integer . parseInt ( l ) ;
    }
    final int oc = sum ( x [ 2 ] * cost , x [ 1 ] - x [ 0 ] , N ) ;
    final Map < Integer , Integer > pa2 = new HashMap < > ( ) ;
    for ( int j = 0 ;
    j < pa . length ;
    j ++ ) {
      if ( pa2 . containsKey ( pa [ j ] [ 0 ] ) ) pa2 . get ( pa [ j ] [ 0 ] ) . intValue ( ) + = pa [ j ] [ 2 ] ;
      else pa2 . put ( pa [ j ] [ 0 ] , new int [ ] {
        pa [ j ] [ 2 ] , 0 }
        ) ;
        if ( pa2 . containsKey ( pa [ j ] [ 1 ] ) ) pa2 . get ( pa [ j ] [ 1 ] ) . intValue ( ) + = pa [ j ] [ 2 ] ;
        else pa2 . put ( pa [ j ] [ 1 ] , new int [ ] {
          0 , pa [ j ] [ 2 ] }
          ) ;
        }
        final Map < Integer , Integer > entry = new HashMap < > ( ) ;
        int cc = 0 ;
        for ( int j = 0 ;
        j < pa2 . size ( ) ;
        j ++ ) {
          entry . put ( j , pa2 . get ( j ) [ 0 ] ) ;
          int ex = pa2 . get ( j ) [ 1 ] ;
          while ( ex > 0 ) {
            final int m = max ( entry ) ;
            if ( ex >= entry . get ( m ) ) {
              ex -= entry . get ( m ) ;
              cc += entry .