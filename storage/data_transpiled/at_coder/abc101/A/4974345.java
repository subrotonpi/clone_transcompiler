public static int input ( ) {
  int res = 0 ;
  for ( int i = 0 ;
  i < S ;
  i ++ ) {
    if ( S [ i ] == "+" ) {
      res ++ ;
    }
    else {
      res -- ;
    }
  }
  System . out . println ( res ) ;
  return res ;
}
