static final int [ ] binarySearch ( int [ ] nums ) {
  int [ ] nums = {
    0 , 0 }
    . clone ( ) ;
    List < Integer > x = new ArrayList < > ( ) ;
    for ( int i = 2 ;
    i < 10 * 5 ;
    i ++ ) {
      if ( nums [ i ] != 0 ) {
        for ( int l = i * 2 ;
        l < 10 * l ;
        l += i ) nums [ l ] = 0 ;
        if ( nums [ ( i + 1 ) / 2 ] != 0 ) x . add ( i ) ;
      }
    }
    int Q = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) {
      int l = Integer . parseInt ( input . nextLine ( ) ) ;
      int r = Integer . parseInt ( input . nextLine ( ) ) ;
      int l_ = binarySearch ( x , l ) ;
      int r_ = binarySearch ( x , r ) ;
      System . out . println ( r_ - l_ ) ;
    }
    return nums ;
  }
  