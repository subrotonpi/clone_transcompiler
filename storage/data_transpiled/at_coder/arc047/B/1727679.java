@ VisibleForTesting static void main ( String [ ] args ) {
  final double INF = Double . MAX_VALUE ;
  final Scanner input = new Scanner ( System . in ) ;
  final double [ ] points = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int x = input . nextInt ( ) ;
    final int y = input . nextInt ( ) ;
    points [ i ] = new Point ( x , y ) ;
  }
  final List < Point > rotated = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < points . length ;
  i ++ ) {
    rotated . add ( new Point ( points [ i ] . x + points [ i ] . y , points [ i ] . x - points [ i ] . y ) ) ;
  }
  final List < Point > xs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < points . length ;
  i ++ ) {
    xs . add ( points [ i ] . x ) ;
  }
  final List < Point > ys = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < points . length ;
  i ++ ) {
    ys . add ( points [ i ] . y ) ;
  }
  final double dx = max ( xs ) - min ( xs ) ;
  final double dy = max ( ys ) - min ( ys ) ;
  final double D = max ( dx , dy ) ;
  final Point p1 = new Point ( Math . min ( xs ) + D / 2 , Math . min ( ys ) + D / 2 ) ;
  final Point p2 = new Point ( Math . min ( xs ) + D / 2 , Math . max ( ys ) - D / 2 ) ;
  final Point p3 = new Point ( Math . max ( xs ) - D / 2 , Math . min ( ys ) + D / 2 ) ;
  final Point p4 = new Point ( Math . max ( xs ) - D / 2 , Math . max ( ys ) - D / 2 ) ;
  for ( int i = p1 . x , j = p2 . x ;
  i <= p2 . x ;
  i ++ , j = p2 . y ) {
    final double px = ( x + y ) / 2 , py = ( x - y ) / 2 ;
    if ( Sets . intersection ( points , Math . abs ( px - x ) + Math . abs ( py - y ) ) . size ( ) == 1 ) {
      System . out . println ( px + "," + py )