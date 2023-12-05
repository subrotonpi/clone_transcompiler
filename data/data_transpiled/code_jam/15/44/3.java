@ Function public static Function < Integer , List < Integer >> get = new Function < Integer , List < Integer >> ( ) {
  @ Override public Map < Integer , Integer > apply ( @ Nullable Integer input ) {
    return Maps . newHashMap ( ) ;
  }
  @ Override public List < Integer > apply ( @ Nullable Integer input ) {
    Map < Integer , Integer > cache = Maps . newHashMap ( ) ;
    return cache . get ( input ) ;
  }
  @ Override public List < Integer > solve ( ) {
    int R = get ( ) ;
    int C = get ( ) ;
    List < Integer > rows = new ArrayList < > ( ) ;
    for ( int c = 0 ;
    c <= R ;
    c ++ ) {
      if ( ! cache . containsKey ( input ) ) cache . put ( input , input ) ;
    }
    else {
      for ( int row : getRows ( c - 1 ) ) {
        rows . add ( row + 1 ) ;
        rows . add ( row + 2 ) ;
        rows . add ( row + 3 ) ;
      }
    }
    @ SuppressWarnings ( "unchecked" ) List < Integer > res = new ArrayList < > ( ) ;
    for ( int row : getRows ( C ) ) {
      List < Integer > rem = Lists . newArrayList ( ) ;
      for ( int i = 0 ;
      i < C - 1 ;
      i ++ ) {
        if ( row == row + 1 ) {
          rem . set ( i , row - 1 ) ;
          rem . set ( i , row - 1 ) ;
        }
      }
      if ( row == row - 1 ) {
        rem . set ( 0 , row - 1 ) ;
        rem . set ( i , row - 1 ) ;
      }
      if ( Arrays . binarySearch ( rem , input ) >= 0 ) {
        res . add ( new Integer ( row ) ) ;
      }
    }
    return res ;
  }
  @ Override public int [ ] rot ( int current , int i ) {
    return copyOf ( current , i ) ;
  }
  @ Override public int minRot ( int current ) {
    return min ( rot ( current , i ) ) ;
  }
  private int [ ] DP ( int [ ] prevRow , int [ ] prevRem , int r , List < Integer > current ) {
    if ( r == 0 ) {
      if ( Arrays . binarySearch ( prevRem , current ) >= 0 ) {
        return minRot ( current ) ;
      }
    }
    else {
      for ( int row : genRows ( r ) ) {
        List < Integer > rem = Lists . newArrayList ( ) ;
        if ( Arrays . binarySearch ( prevRow , row )