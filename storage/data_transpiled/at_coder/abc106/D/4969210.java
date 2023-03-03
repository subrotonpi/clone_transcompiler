static final void solve ( int N , int M , int Q , int L [ ] [ ] R , int [ ] p , int [ ] [ ] q ) {
  if ( getClass ( ) . getName ( ) . equals ( "main" ) ) {
    main ( ) ;
  }
  else {
    int [ ] [ ] mem = new int [ N ] [ M ] ;
    int [ ] [ ] mem2 = new int [ N ] [ M ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      mem [ L [ i ] - 1 ] [ R [ i ] - 1 ] ++ ;
    }
    for ( int h = 0 ;
    h < N ;
    h ++ ) {
      for ( int w = 0 ;
      w < N ;
      w ++ ) {
        int sum = mem [ h ] [ w ] ;
        if ( h == 0 && w > 0 ) sum += mem2 [ h ] [ w - 1 ] ;
        else if ( w == 0 && h > 0 ) sum += mem2 [ h - 1 ] [ w ] ;
        else if ( h > 0 && w > 0 ) sum += mem2 [ h ] [ w - 1 ] + mem2 [ h - 1 ] [ w ] - mem2 [ h - 1 ] [ w - 1 ] ;
        mem2 [ h ] [ w ] = sum ;
      }
    }
    for ( int i = 0 ;
    i < Q ;
    i ++ ) {
      int pc = p [ i ] - 1 ;
      int qc = q [ i ] - 1 ;
      int low = pc > 0 ? mem2 [ pc - 1 ] [ qc ] + mem2 [ qc ] [ pc - 1 ] - mem2 [ pc - 1 ] [ pc - 1 ] : 0 ;
      int sum = mem2 [ qc ] [ qc ] - low ;
      System . out . println ( sum ) ;
    }
    return ;
  }
  {
    String [ ] tokens = new String [ N ] ;
    int N = Integer . parseInt ( tokens [ 0 ] ) ;
    int M = Integer . parseInt ( tokens [ 1 ] ) ;
    int Q = Integer . parseInt ( tokens [ 2 ] ) ;
    int [ ] [ ] L = new int [ M ] [ M ] ;
    int [ ] [ ] R = new int [ M ] [ M ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      L [ i ] = Integer . parseInt ( tokens [ 2 ] [ i ] ) ;
      R [ i ] = Integer . parseInt ( tokens [