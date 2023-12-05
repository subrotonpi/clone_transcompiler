public static int binarySearch ( int N ) {
  int [ ] a = {
    0 }
    ;
    Arrays . sort ( a ) ;
    /* Check the number of elements */
    boolean [ ] b = new boolean [ N ] ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      if ( a [ i ] >= n ) {
        b [ i ] = true ;
      }
      else {
        b [ i ] = false ;
      }
    }
    int r = ( int ) 1e9 ;
    int l = ( int ) 1e9 ;
    boolean rb = b [ N ] ;
    boolean lb = b [ N ] ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      if ( lb == b [ N - i ] ) {
        l = i ;
        break ;
      }
      else {
        lb = b [ N - i ] ;
      }
    }
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      if ( rb == b [ N + i ] ) {
        r = i ;
        break ;
      }
      else {
        rb = b [ N + i ] ;
      }
    }
    if ( r == ( int ) 1e9 && l == ( int ) 1e9 ) {
      if ( N % 2 == 1 ) {
        return b [ N ] ;
      }
      else {
        return ! b [ N ] ;
      }
    }
    else {
      if ( r < l ) {
        return rb ;
      }
      else {
        return lb ;
      }
    }
    /* BinarySearch */
    int mid = ( big + small ) / 2 ;
    if ( big - small <= 1 ) {
      if ( check ( small ) ) return small ;
      else return big ;
    }
    else {
      if ( ! check ( mid ) ) {
        return binarySearch ( small , mid ) ;
      }
      else {
        return binarySearch ( mid , big ) ;
      }
    }
    System . out . println ( binarySearch ( 2 , 2 * N - 2 ) ) ;
    return 0 ;
  }
  