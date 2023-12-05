public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] xi = new int [ n ] , yi = new int [ n ] , hi = new int [ n ] ;
  int [ ] stack = new int [ 101 ] ;
  int result ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xi [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    yi [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    hi [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( hi [ i ] > 0 ) {
      stack = new int [ 101 ] ;
      stack [ 0 ] = xi [ i ] ;
      stack [ 1 ] = yi [ i ] ;
      stack [ 2 ] = hi [ i ] ;
    }
  }
  for ( int i = 0 ;
  i < 101 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 101 ;
    j ++ ) {
      int guess = stack [ 2 ] + Math . abs ( stack [ 0 ] - i ) + Math . abs ( stack [ 1 ] - j ) ;
      boolean isResult = true ;
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        result = guess - Math . abs ( xi [ k ] - i ) - Math . abs ( yi [ k ] - j ) ;
        result = Math . max ( result , 0 ) ;
        if ( hi [ k ] != result ) {
          isResult = false ;
          break ;
        }
      }
      if ( isResult ) {
        System . out . println ( i + " " + j + " " + guess ) ;
        return ;
      }
    }
  }
  if ( getClass ( ) . equals ( " com . github . BigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBigBig@@