static final Scanner in = new Scanner ( System . in ) {
  final int n ;
  final int m ;
  {
    final double d = d ;
    final double m = m ;
    final double first = ( 360 - d ) * m ;
    final double step = 360 * m ;
    @ Override public boolean equals ( final int other ) {
      return first <= other ;
    }
    @ Override public String toString ( ) {
      return UIDs . Hiker . toString ( ) ;
    }
    @ Override public int encounters ( final int pos ) {
      if ( pos < first ) {
        return 1 ;
      }
      return ( int ) ( ( double ) ( pos - first ) / ( double ) step ) ;
    }
  }
  ;
  final List < Hiker > hikers = new ArrayList < Hiker > ( ) ;
  final int n = in . nextInt ( ) ;
  for ( int j : xrange ( n ) ) {
    final int d = in . nextInt ( ) ;
    final int h = in . nextInt ( ) ;
    final int m = in . nextInt ( ) ;
    for ( int k : xrange ( h ) ) {
      hikers . add ( new Hiker ( d , m + k ) ) ;
    }
  }
  final List < Hiker > sorted = new ArrayList < Hiker > ( hikers ) ;
  Collections . sort ( sorted ) ;
  int best = sorted . size ( ) ;
  int current = sorted . size ( ) ;
  for ( final Hiker hiker : sorted ) {
    final double position = ( double ) hiker . first + 0.5 ;
    current = Arrays . stream ( hiker . encounters ( position ) ) . mapToInt ( hiker :: end ) . sum ( ) ;
    best = Math . min ( current , best ) ;
  }
  System . out . println ( best ) ;
  final int t = in . nextInt ( ) ;
  for ( int i : xrange ( t ) ) {
    System . out . printf ( "Case #%d:%n" , i + 1 ) ;
    solve ( ) ;
  }
  return new Scanner ( System . in ) ;
}
