static final boolean isDebug ( ) {
  int N = 0 ;
  boolean debug = false ;
  {
    N = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  {
    boolean testEval = ( ( n <= N && String . valueOf ( n ) . compareTo ( N ) <= 0 ) || ( n > N && String . valueOf ( n ) . compareTo ( N ) > 0 ) ) ;
  }
  {
    boolean query = ( n > 0 ) ;
    if ( debug ) {
      return testEval ;
    }
    System . out . println ( "? " + n ) ;
    System . out . flush ( ) ;
    return input . nextLine ( ) . equals ( "Y" ) ;
  }
  {
    int retval = 1 ;
    while ( ! query ) {
      retval ++ ;
    }
    if ( retval == 1 ) {
      while ( ! query ) {
        while ( ( 10 * retval - 1 ) * 10 * 9 ) {
          retval ++ ;
        }
        while ( ! query ) {
          retval ++ ;
        }
      }
      return retval ;
    }
    {
      int l = x != 0 ? String . valueOf ( x ) . length ( ) : 0 ;
      /* q */
      int D = query ? ( x * 10 + D ) : 0 ;
      int d = 5 ;
      boolean r = q ( d ) ;
      if ( r ) {
        d = 7 ;
        r = q ( d ) ;
        if ( r ) {
          d = 8 ;
          r = q ( d ) ;
          if ( r ) {
            d = 9 ;
            r = q ( d ) ;
            return r ? 9 : 8 ;
          }
          else return 7 ;
        }
      }
      else {
        d = 6 ;
        r = q ( d ) ;
        return r ? 6 : 5 ;
      }
    }
    {
      int d = 2 ;
      r = q ( d ) ;
      if ( r ) {
        d = 3 ;
        r = q ( d ) ;
        if ( r ) {
          d = 4 ;
          r = q ( d ) ;
          return r ? 3 : 4 ;
        }
        else return 2 ;
      }
      else {
        d = 1 ;
        r = q ( d ) ;
        return r ? 1 : 0 ;
      }
    }
  }
  {
    int nd = nDigit ( ) ;
    int value = 0 ;
    for ( int i = 0 ;
    i < nd - 1 ;
    i ++ ) {
      value = value * 10 + getDigit ( value ) ;
    }
    boolean [ ] ar = new boolean [ 10 ] ;
    int i = 0 ;
    if ( nd == 1 ) {
      i ++ ;
    }
    while ( ! query ) {
      ar [ i ] = false ;
    }
    return ar ;
  }
  