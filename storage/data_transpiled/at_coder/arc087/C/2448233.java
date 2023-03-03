static void N ( int N , int L ) {
  IntFunction make = new IntFunction ( ) {
    @ Override public int [ ] apply ( String input ) {
      return new int [ ] {
        null , null , 0 }
        ;
      }
    }
    ;
    IntFunction root = make ( ) ;
    {
      IntFunction n = root ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        if ( n . get ( i ) == null ) {
          n . set ( i , n = make . nextInt ( ) ) ;
        }
        else {
          n = n . get ( i ) ;
        }
      }
      n . 2 = 1 ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      IntFunction s = IntFunction . valueOf ( input ) ;
      construct ( s ) ;
    }
    HashMap < Integer , Integer > caps = new HashMap < > ( ) ;
    Stack < IntFunction > st = new Stack < > ( ) ;
    st . push ( new IntFunction ( root , 0 , 0 ) ) ;
    while ( st . size ( ) > 0 ) {
      IntFunction n = st . pop ( ) ;
      int i = n . i ;
      int l = n . l ;
      if ( i > 0 ) {
        if ( n . get ( 1 ) == null ) {
          caps . put ( L - l , caps . getOrDefault ( L - l , 0 ) + 1 ) ;
        }
        else {
          if ( ! n . get ( 1 ) . 2 ) st . push ( new IntFunction ( n . get ( 1 ) , 0 , l + 1 ) ) ;
        }
      }
      else {
        st . push ( new IntFunction ( n , 1 , l ) ) ;
        if ( n . get ( 0 ) == null ) {
          caps . put ( L - l , caps . getOrDefault ( L - l , 0 ) + 1 ) ;
        }
        else {
          if ( ! n . get ( 0 ) . 2 ) st . push ( new IntFunction ( n . get ( 0 ) , 0 , l + 1 ) ) ;
        }
      }
    }
    int ans = 0 ;
    for ( int v = 0 ;
    v < caps . size ( ) ;
    v ++ ) {
      int k = caps . get ( v ) ;
      if ( k % 2 == 0 ) continue ;
      v -- ;
      int r = 1 ;
      while ( v % 4 == 3 ) {
        v /= 4 ;
        r *= 4 ;
      }
      if ( v % 4 == 1 ) ans ^= r * 2 ;
      else ans ^= r ;
    }
    System . out .