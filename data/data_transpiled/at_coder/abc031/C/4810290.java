public static int [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] odd = new int [ n + 1 ] ;
  int [ ] even = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      odd [ i + 1 ] = odd [ i ] + a [ i ] ;
      even [ i + 1 ] = even [ i ] ;
    }
    else {
      odd [ i + 1 ] = odd [ i ] ;
      even [ i + 1 ] = even [ i ] + a [ i ] ;
    }
  }
  int B = - 100000 ;
  int ans = B ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int p = B ;
    int c = - 1 ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      int temp ;
      if ( j % 2 == 0 ) {
        temp = even [ i + 1 ] - even [ j ] ;
        if ( temp > p ) {
          p = temp ;
          c = j ;
        }
      }
      else {
        temp = odd [ i + 1 ] - odd [ j ] ;
        if ( temp > p ) {
          p = temp ;
          c = j ;
        }
      }
    }
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      if ( i % 2 == 0 ) {
        temp = even [ j + 1 ] - even [ i ] ;
        if ( temp > p ) {
          p = temp ;
          c = j ;
        }
      }
      else {
        temp = odd [ j + 1 ] - odd [ i ] ;
        if ( temp > p ) {
          p = temp ;
          c = j ;
        }
      }
    }
    if ( c < i ) {
      if ( c % 2 == 1 ) {
        temp = even [ i + 1 ] - even [ c ] ;
      }
      else {
        temp = odd [ i + 1 ] - odd [ c ] ;
      }
    }
    else {
      if ( i % 2 == 1 ) {
        temp = even [ c + 1 ] - even [ i ] ;
      }
      else {
        temp = odd [ c + 1 ] - odd [ i ] ;
      }
    }
    if ( temp > ans ) {
      ans = temp ;
    }
  }
  return ans ;
  