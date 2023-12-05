private static final Score score = new Score ( ) {
  @ Override public int [ ] row ( int r ) {
    return new int [ n ] ;
  }
  @ Override public int [ ] col ( int c ) {
    return new int [ n ] ;
  }
  @ Override public int [ ] drange ( int n ) {
    return new int [ n ] ;
  }
  @ Override public int [ ] [ ] drange ( int n ) {
    return new int [ n ] ;
  }
  @ Override public int [ ] [ ] drange ( int n ) {
    return new int [ n ] ;
  }
  @ Override public int [ ] [ ] [ ] delta ( int [ ] [ ] b1 , int [ ] [ ] b2 ) {
    int n = Integer . parseInt ( input ( ) ) ;
    int [ ] [ ] lines = new int [ n ] [ n ] ;
    for ( int t = 0 ;
    t < n ;
    t ++ ) {
      lines [ t ] = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        lines [ t ] [ i ] = input ( ) ;
      }
    }
    return new int [ n ] [ n ] ;
  }
  @ Override public int [ ] [ ] delta ( int [ ] [ ] b1 , int [ ] [ ] b2 ) {
    int n = Integer . parseInt ( input ( ) ) ;
    int [ ] [ ] out = new int [ n ] [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        out [ i ] [ j ] = b1 [ i ] [ j ] ;
      }
    }
    return out ;
  }
  @ Override public boolean free ( int [ ] [ ] b , int [ ] coords , int val ) {
    return ! ArrayUtils . contains ( b [ r ] , val , 'o' ) ;
  }
  @ Override public void dump ( int [ ] [ ] b ) {
    for ( int i = 0 ;
    i < b . length ;
    i ++ ) {
      System . out . println ( Arrays . toString ( b [ i ] ) ) ;
    }
  }
  @ Override public void update ( int [ ] [ ] b , int r , int c , int v ) {
    if ( b [ r ] [ c ] == '.' ) b [ r ] [ c ] = v ;
    else if ( b [ r ] [ c ] == 'o' ) throw new IllegalStateException ( "Can't update ("