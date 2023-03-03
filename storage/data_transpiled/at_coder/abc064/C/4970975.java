static final int [ ] getSummarbles ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] lis = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] l = {
    0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 }
    ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int a = Math . floor ( lis [ i ] / 400 ) ;
      if ( a < 8 ) {
        l [ a ] = 1 ;
      }
      else {
        l [ l . length - 1 ] ++ ;
      }
    }
    if ( Arrays . binarySearch ( l , 0 , 8 ) == 0 ) {
      System . out . println ( 1 + l [ 8 ] ) ;
    }
    else {
      System . out . println ( Arrays . binarySearch ( l , 0 , 8 ) + " " + Arrays . binarySearch ( l , 0 , 8 ) ) ;
    }
    return l ;
  }
  