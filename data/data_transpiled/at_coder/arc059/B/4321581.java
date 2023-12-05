public static String input ( ) {
  int k = - 1 ;
  int l = - 1 ;
  boolean flag = false ;
  for ( int i = 0 ;
  i <= s . length ( ) - 1 ;
  i ++ ) {
    if ( s . charAt ( i ) == s . charAt ( i + 1 ) ) {
      flag = true ;
      k = i + 1 ;
      l = i + 2 ;
      break ;
    }
  }
  if ( ! flag ) {
    if ( s . length ( ) > 2 ) {
      for ( int j = 0 ;
      j <= s . length ( ) - 2 ;
      j ++ ) {
        if ( s . charAt ( j ) == s . charAt ( j + 2 ) ) {
          flag = true ;
          k = j + 1 ;
          l = j + 3 ;
          break ;
        }
      }
    }
    else {
      return null ;
    }
  }
  return print ( k , l ) ;
}
