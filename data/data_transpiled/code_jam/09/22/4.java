@ Nullable public static String smallest ( int [ ] cnt ) {
  StringBuffer result = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i <= 10 ;
  i ++ ) {
    for ( int j = 0 ;
    j <= cnt [ i ] ;
    j ++ ) {
      result . append ( ( char ) ( i + '0' ) ) ;
    }
  }
  {
    StringBuilder sb = new StringBuilder ( ) ;
    for ( int i = 0 ;
    i <= 10 ;
    i ++ ) {
      char ch = ( char ) ( N [ i ] - '0' ) ;
      sb . append ( ch ) ;
    }
    int result = sb . length ( ) ;
    int d = 0 ;
    for ( int i = ( char ) ( N [ pos ] - '0' ) + 1 ;
    i <= 10 ;
    i ++ ) {
      if ( sb . length ( ) > 0 ) {
        d = i ;
        break ;
      }
    }
    if ( d == 0 ) {
      return null ;
    }
    sb . append ( ( char ) ( d + '0' ) ) ;
    sb . setLength ( d ) ;
    sb . setLength ( d ) ;
    sb . append ( smallest ( sb ) ) ;
    return sb . toString ( ) ;
  }
  public static void main ( String [ ] args ) {
    int T = Integer . parseInt ( readLine ( ) ) ;
    for ( int i = 1 ;
    i <= T ;
    i ++ ) {
      System . out . printf ( "Case #%d: " , i ) ;
      String N = readLine ( ) ;
      int [ ] cnt = new int [ 10 ] ;
      for ( int n = 0 ;
      n < N . length ( ) ;
      n ++ ) {
        cnt [ ( int ) N . charAt ( n ) - '0' ] ++ ;
      }
      String solution = null ;
      for ( int i = N . length ( ) - 1 ;
      i >= 0 ;
      i -- ) {
        String t = build ( N , i , cnt ) ;
        if ( t != null ) {
          solution = t ;
          break ;
        }
      }
      if ( solution == null ) {
        cnt [ 0 ] ++ ;
        for ( int i = 1 ;
        i <= 10 ;
        i ++ ) {
          if ( sb . length ( ) > 0 ) {
            solution = ( char ) ( i + '0' ) ;
            sb . setLength ( i ) ;
            break ;
          }
        }
        solution += smallest ( cnt ) ;
      }
      System . out . println ( solution ) ;
    }
  }
}
