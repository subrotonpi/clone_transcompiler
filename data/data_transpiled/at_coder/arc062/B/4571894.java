public static int input ( ) {
  int g = 0 ;
  int p = 0 ;
  int win = 0 ;
  int lose = 0 ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    if ( ( S [ i ] == "g" ) ) {
      if ( ( p < g ) && ( p < win ) ) {
        p ++ ;
        win ++ ;
      }
      else if ( ( p == g ) && ( p < lose ) ) {
        g ++ ;
        lose ++ ;
      }
    }
  }
  return win - lose ;
}
