public static int calc ( int a0 ) {
  int a1 = a0 + 1 ;
  String b0 = String . valueOf ( a0 * a0 ) ;
  String b1 = String . valueOf ( a1 * a1 ) ;
  int length = b0 . length ( ) ;
  if ( length != b1 . length ( ) ) {
    if ( a0 == 3 ) {
      return 9 ;
    }
    else if ( String . valueOf ( a0 ) . charAt ( 0 ) == '3' ) {
      return 10 ;
    }
    if ( a0 == 9 ) {
      return 81 ;
    }
    int ind = 0 ;
    for ( int i = 0 ;
    i < length ;
    i ++ ) {
      if ( ( b0 . charAt ( i ) != '9' ) && ( b0 . charAt ( i ) != 'a' ) ) {
        ind = i + 1 ;
        break ;
      }
    }
    int ans = 0 ;
    if ( ( length + ind ) % 2 == 1 ) {
      ind ++ ;
    }
    ans = Integer . parseInt ( b0 . substring ( 0 , ind ) ) + 1 ;
    return ans ;
  }
  int ind = 0 ;
  boolean diff = false ;
  for ( int i = 0 ;
  i < length ;
  i ++ ) {
    if ( i == length - 1 ) {
      ind = i + 1 ;
      break ;
    }
    if ( diff || b0 . charAt ( i ) != b1 . charAt ( i ) ) {
      diff = true ;
      int dig = 10 * ( length - i - 1 ) ;
      int under = Integer . parseInt ( b0 ) % dig ;
      int added = Integer . parseInt ( b0 ) - under + ( under > 0 ? dig : 0 ) ;
      if ( added < Integer . parseInt ( b1 ) ) {
        ind = i + 1 ;
        break ;
      }
    }
  }
  if ( ( length + ind ) % 2 == 1 ) {
    ind ++ ;
  }
  if ( ind == length || Integer . parseInt ( b0 . substring ( ind ) ) == 0 ) {
    ans = Integer . parseInt ( b0 . substring ( 0 , ind ) ) ;
  }
  else {
    ans = Integer . parseInt ( b0 . substring ( 0 , ind ) ) + 1 ;
  }
  while ( ans % 100 == 0 ) {
    ans /= 100 ;
  }
  return ans ;
}
