@ VisibleForTesting static LinkedHashMap < Character , String > map ( Scanner scanner ) {
  int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    Scanner s = new Scanner ( scanner ) ;
    int [ ] count = new int [ 10 ] ;
    count [ 0 ] = s . nextInt ( ) ;
    count [ 2 ] = s . nextInt ( ) ;
    count [ 4 ] = s . nextInt ( ) ;
    count [ 6 ] = s . nextInt ( ) ;
    count [ 8 ] = s . nextInt ( ) ;
    count [ 9 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
    count [ 10 ] = s . nextInt ( ) ;
  }
  return new LinkedHashMap < Character , String > ( ) {
    @ Override public String put ( Character c , String s ) {
      return s ;
      