public static int input ( ) {
  int res = 0 ;
  if ( S . charAt ( 0 ) == 'p' ) {
    res -- ;
  }
  int p = 0 ;
  int g = 1 ;
  for ( int i = 1 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'p' && p < g ) {
      p ++ ;
    }
    else if ( S . charAt ( i ) == 'p' && p >= g ) {
      g ++ ;
      res -- ;
    }
    else if ( S . charAt ( i ) == 'g' && p < g ) {
      p ++ ;
      res ++ ;
    }
    else {
      g ++ ;
    }
  }
  System . out . println ( res ) ;
  return res ;
}
