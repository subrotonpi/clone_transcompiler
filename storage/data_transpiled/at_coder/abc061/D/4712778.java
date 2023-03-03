public static int N ( Scanner input ) {
  int M = input . nextInt ( ) ;
  int [ ] [ ] Edges = new int [ M ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a , b , c ;
    a = input . nextInt ( ) ;
    b = input . nextInt ( ) ;
    c = input . nextInt ( ) ;
    Edges [ i ] = a ;
    Edges [ i ] [ 0 ] = b ;
  }
  double [ ] dist = new double [ N ] ;
  dist [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int fr = 0 ;
    fr < Edges [ i ] . length ;
    fr ++ ) {
      int to = Edges [ i ] [ fr ] ;
      double cost = Edges [ i ] [ to ] ;
      if ( ( dist [ fr ] != 0 ) && ( dist [ to ] > dist [ fr ] + cost ) ) {
        dist [ to ] = dist [ fr ] + cost ;
        if ( ( i == N - 1 ) & ( to == N - 1 ) ) {
          System . out . println ( "inf" ) ;
          exit ( ) ;
        }
      }
    }
  }
  return - dist [ N - 1 ] ;
}
