public static void main ( String [ ] args ) {
  int n , r ;
  char [ ] s = new char [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = 'o' ;
  }
  int rightmost = - 1 ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    if ( s [ i ] == '.' ) rightmost = i ;
  }
  if ( rightmost == - 1 ) {
    System . out . println ( 0 ) ;
  }
  else {
    int count = 0 ;
    int at = 0 ;
    for ( int i = 0 ;
    i < 1000 ;
    i ++ ) {
      if ( isFinished ( s ) ) break ;
      if ( s [ at ] == '.' ) {
        updateS ( s , at , r ) ;
        count ++ ;
      }
      else at ++ ;
    }
  }
}
