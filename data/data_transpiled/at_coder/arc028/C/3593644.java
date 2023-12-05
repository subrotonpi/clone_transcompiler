static final int [ ] read ( int [ ] in ) {
  System . setIn ( in , "Enter a value for the first occurrence of a node." ) ;
  final int N = in . length ;
  final int [ ] [ ] edges = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    edges [ i ] [ 0 ] = in [ i ] ;
    edges [ i ] [ 1 ] = i ;
  }
  final int [ ] balance = new int [ N ] ;
  {
    int total = 0 , maxCount = 0 ;
    for ( int to : edges [ 0 ] ) {
      if ( to != prev ) {
        int part = rec ( to , in ) ;
        total = total + part ;
        maxCount = max ( maxCount , part ) ;
      }
    }
    balance [ v ] = max ( maxCount , N - 1 - total ) ;
  }
}
