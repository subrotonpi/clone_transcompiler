public static int N ( Scanner input ) {
  int N = input . nextInt ( ) ;
  int [ ] [ ] matrix = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    matrix [ i ] [ i ] = 1 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    matrix [ i ] [ i ] = 0 ;
  }
  if ( N % 2 == 0 ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      matrix [ i ] [ N - i - 1 ] = 0 ;
    }
  }
  else {
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      matrix [ i ] [ N - i - 2 ] = 0 ;
    }
  }
  System . out . println ( ( int ) ( ( N * ( N - 1 ) / 2 ) - ( int ) ( N / 2 ) ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      if ( matrix [ i ] [ j ] == 1 ) {
        System . out . println ( i + 1 + " " + j + 1 ) ;
      }
    }
  }
  return N ;
}
