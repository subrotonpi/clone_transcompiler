public static String baseNeg2 ( @ IntRange ( from = 0 ) int n ) {
  int [ ] negTwoL = new int [ 32 ] ;
  int index = negTwoL . length - 1 ;
  if ( n >= 0 ) {
    while ( index > - 1 ) {
      if ( n >= 2 * index ) {
        if ( n % 2 == 0 ) {
          -- index ;
        }
      }
      else {
        negTwoL [ index ] ++ ;
        negTwoL [ index + 1 ] ++ ;
      }
      N -= 2 * index ;
    }
    index -- ;
  }
  else {
    int N = - n ;
    while ( index > - 1 ) {
      if ( n >= 2 * index ) {
        if ( n % 2 == 1 ) {
          -- index ;
        }
        else {
          break ;
        }
      }
    }
    return new String ( Integer . toString ( n ) ) ;
  }
  System . out . println ( baseNeg2 ( n ) ) ;
  int index2 = 0 ;
  while ( index2 < negTwoL . length - 2 ) {
    if ( negTwoL [ index2 ] > 1 ) {
      flag = 1 ;
      if ( negTwoL [ index2 ] % 2 == 0 ) {
        if ( negTwoL [ index2 + 1 ] == 1 ) {
          negTwoL [ index2 + 1 ] = 0 ;
        }
        else {
          negTwoL [ index2 + 1 ] ++ ;
          negTwoL [ index2 + 2 ] ++ ;
        }
        negTwoL [ index2 ] ++ ;
      }
      else {
        if ( negTwoL [ index2 + 1 ] == 1 ) {
          negTwoL [ index2 + 1 ] = 0 ;
        }
        else {
          negTwoL [ index2 + 1 ] ++ ;
          negTwoL [ index2 + 2 ] ++ ;
        }
      }
      index2 ++ ;
    }
  }
  return new String ( Integer . toString ( index2 ) ) ;
}
