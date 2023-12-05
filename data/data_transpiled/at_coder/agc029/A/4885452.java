static final double sum ( double [ ] input ) {
  Scanner s = new Scanner ( list ) ;
  int ind = s . nextInt ( ) ;
  int lenInd = ind ;
  int len = s . nextInt ( ) ;
  double [ ] dist = new double [ len - lenInd ] ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    dist [ i ] = s . nextDouble ( ) ;
  }
  return dist [ lenInd ] ;
}
