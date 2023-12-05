static final String print ( String s ) throws IOException {
  final BufferedReader fin = new BufferedReader ( new FileReader ( s ) ) ;
  final BufferedWriter fout = new BufferedWriter ( new FileWriter ( "p2.out" ) ) ;
  final int T = Integer . parseInt ( fin . readLine ( ) ) ;
  {
    final Queue < Integer > Q = new ArrayDeque < > ( ) ;
    final int [ ] ch = new int [ N ] ;
    final int [ ] V = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      Q . add ( i ) ;
    }
    int cur = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int n = 0 ;
      for ( int j = 0 ;
      j < adj [ cur ] ;
      j ++ ) {
        int n = adj [ cur ] ;
        if ( V [ n ] == 0 ) {
          Q . add ( i ) ;
          ch [ cur ] ++ ;
        }
      }
    }
    return ch ;
  }
  {
    final int [ ] cw = new int [ N ] ;
    final int [ ] w = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      w [ i ] = cw [ i ] ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int c = 0 ;
      for ( int j = 0 ;
      j < adj [ cur ] ;
      j ++ ) {
        w [ i ] = cw [ j ] ;
        w [ i ] += w [ j ] ;
      }
    }
    return w ;
  }
  private int [ ] cw ( int r , int [ ] chs , int [ ] w ) {
    int [ ] mins = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      mins [ i ] = cw [ r ] ;
    }
    switch ( chs [ r ] ) {
      case 0 : return 0 ;
      case 1 : return w [ chs [ r ] ] [ 0 ] ;
      case 2 : return Arrays . toString ( mins ) ;
    }
    int [ ] ws = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      ws [ i ] = w [ i ] ;
    }
    int [ ] extra = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int a = ws [ i ] ;
      int b = mins [ i ] ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if