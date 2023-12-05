public static void print ( int N ) {
  int [ ] [ ] matrix = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    matrix [ i ] = new int [ N ] ;
  }
  int ans = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( matrix [ i ] [ i ] == 0 ) {
      for ( int j = i ;
      j < N ;
      j ++ ) {
        if ( matrix [ j ] [ i ] == 1 ) {
          matrix [ i ] [ j ] = matrix [ j ] [ i ] ;
          break ;
        }
      }
    }
  }
  System . out . println ( ans % 2 == 0 ? "Even" : "Odd" ) ;
}
