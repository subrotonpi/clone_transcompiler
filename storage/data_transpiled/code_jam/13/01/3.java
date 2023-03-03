public static String bingo ( char [ ] a , char c ) {
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    boolean flag = true ;
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      if ( a [ i ] [ j ] != c && a [ i ] [ j ] != 'T' ) {
        flag = false ;
      }
    }
    if ( flag ) {
      return true ;
    }
  }
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    boolean flag = true ;
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      if ( a [ j ] [ i ] != c && a [ j ] [ i ] != 'T' ) {
        flag = false ;
      }
    }
    if ( flag ) {
      return true ;
    }
  }
  boolean flag = true ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    if ( a [ i ] [ i ] != c && a [ i ] [ i ] != 'T' ) {
      flag = false ;
    }
  }
  if ( flag ) {
    return true ;
  }
  flag = true ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    if ( a [ i ] [ 3 - i ] != c && a [ i ] [ 3 - i ] != 'T' ) {
      flag = false ;
    }
  }
  if ( flag ) {
    return true ;
  }
  return false ;
}
