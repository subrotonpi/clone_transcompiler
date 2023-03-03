public static int calcAns ( int x ) {
  int ret ;
  if ( x < 0 ) {
    return 0 ;
  }
  else if ( x < X ) {
    return x ;
  }
  else {
    return X ;
  }
  if ( Class . isEnum ( ) ) {
    X = Integer . parseInt ( input . nextLine ( ) ) ;
    K = Integer . parseInt ( input . nextLine ( ) ) ;
    r = new LinkedList < Integer > ( ) ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      r . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    }
    Q = Integer . parseInt ( input . nextLine ( ) ) ;
    int j = 0 ;
    int sign = - 1 ;
    int s = 0 ;
    int e = X ;
    int y = 0 ;
    int [ ] sandQuantity = new int [ K ] ;
    sandQuantity [ 0 ] = r . get ( 0 ) ;
    for ( int i = 1 ;
    i < K ;
    i ++ ) {
      sandQuantity [ i ] = r . get ( i ) - r . get ( i - 1 ) ;
    }
    int chasmTime = 0 ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) {
      int t = Integer . parseInt ( input . nextLine ( ) ) ;
      int a = Integer . parseInt ( input . nextLine ( ) ) ;
      while ( j < K && r . get ( j ) < t ) {
        y += sign * sandQuantity [ j ] ;
        if ( y < 0 ) {
          s += - y ;
          if ( e < s ) {
            s = e ;
          }
          y = 0 ;
        }
        if ( X < y + e - s ) {
          int tmpDiff = ( y + e - s ) - X ;
          e -= tmpDiff ;
          if ( e < s ) {
            e = s ;
          }
        }
        if ( X < y ) {
          y = X ;
        }
        chasmTime = r . get ( j ++ ) ;
        sign *= - 1 ;
      }
      int tmpTime = t - chasmTime ;
      if ( a < s ) {
        ret = y ;
      }
      else if ( a < e ) {
        ret = y + a - s ;
      }
      else {
        ret = y + e - s ;
      }
      ret += tmpTime * sign ;
      System . out . println ( calcAns ( ret ) ) ;
    }
    return 0 ;
  }
  