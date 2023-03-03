public static final String getSumOfDigits ( ) {
  Scanner scanner = new Scanner ( System . in ) ;
  double dist ;
  double time ;
  double [ ] [ ] flies ;
  double [ ] [ ] com = new double [ 6 ] [ 6 ] ;
  for ( int n = 0 ;
  n < 6 ;
  n ++ ) {
    flies = new double [ 6 ] [ 6 ] ;
    for ( int N = 0 ;
    N < 6 ;
    N ++ ) flies [ n ] [ N ] = scanner . nextDouble ( ) ;
    com [ N ] [ 0 ] = 0 ;
    for ( int i = 0 ;
    i < 6 ;
    i ++ ) {
      for ( double [ ] fly : flies ) com [ N ] [ i ] += fly [ i ] ;
    }
    com [ N ] [ 0 ] /= N + 1 ;
  }
  s = 0 , t = 0 ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    s += com [ 3 + i ] * com [ i ] ;
    t += com [ 3 + i ] * com [ i ] ;
  }
  if ( t == 0 ) {
    dist = ( ( com [ 0 ] ) * ( com [ 0 ] ) + ( com [ 1 ] ) * ( com [ 1 ] ) + ( com [ 2 ] ) * ( com [ 2 ] ) * ( com [ 3 ] ) * ( com [ 4 ] ) * ( com [ 5 ] ) ) ;
    time = 0.0 ;
    System . out . println ( "Case #" + Integer . toString ( n + 1 ) + ": " + dist + " " + time + " " + time + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " " + " ▁