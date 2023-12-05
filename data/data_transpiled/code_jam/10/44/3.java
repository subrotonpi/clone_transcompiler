static final String getStdOut ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final Scanner in = new Scanner ( System . in ) ;
  final String line = in . nextLine ( ) ;
  /* input is the line to get the segment area */
  final double pq = ( ( p . x - q . x ) * ( p . x - q . x ) + ( p . y - q . y ) * ( q . y - q . y ) ) * .5 ;
  final double qt = ( ( q . x - t . x ) * ( q . x - t . x ) + ( q . y - t . y ) * ( q . y - t . y ) ) * .5 ;
  final double pt = ( ( p . x - t . x ) * ( p . y - t . y ) + ( p . y - t . y ) * ( p . y - t . y ) ) * .5 ;
  final double ang = 2 * acos ( ( qt * qt - pt * qt - pq * qt ) / ( - 2 * pq * pt ) ) ;
  final double area = pq * pq * ( ang - sin ( ang ) ) / 2 ;
  /* do the division */
  final int N = in . nextInt ( ) ;
  final int M = in . nextInt ( ) ;
  final int [ ] p1 = new int [ N ] ;
  final int [ ] p2 = new int [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    p1 [ i ] = in . nextInt ( ) ;
    p2 [ i ] = in . nextInt ( ) ;
  }
  final int [ ] Q = new int [ M ] ;
  for ( int i = 0 ;
  i < Q . length ;
  i ++ ) {
    Q [ i ] = in . nextInt ( ) ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    Q [ i ] = in . nextInt ( ) ;
  }
  for ( int i = 0 ;
  i < Q . length ;
  i ++ ) {
    System . out . println ( getSegmentArea ( p1 , q , p2 ) + getSegmentArea ( p2 , q , p1 ) ) ;
  }
  /* print */
  final long clk = in . nextLong ( ) ;
  for ( int i = 1 ;
  i < M ;
  i ++ ) {
    System . out . println ( "Case #" + i