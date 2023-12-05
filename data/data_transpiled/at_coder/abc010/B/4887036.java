public static int N ( ) {
  int [ ] maisu = new int [ N ] ;
  for ( int i = 0 ;
  i < maisu . length ;
  i ++ ) {
    maisu [ i ] = i ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < maisu . length ;
  i ++ ) {
    while ( ( maisu [ i ] % 3 ) == 2 || ( maisu [ i ] % 2 ) == 0 ) {
      if ( ( maisu [ i ] % 3 ) == 2 ) {
        ans ++ ;
        maisu [ i ] -- ;
      }
      if ( ( maisu [ i ] % 2 ) == 0 ) {
        ans ++ ;
        maisu [ i ] -- ;
      }
    }
  }
  return ans ;
}
