static final String print ( ) {
  final int n = Integer . parseInt ( System . in ) ;
  final int m = Integer . parseInt ( System . in ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    print ( "Case #" + ( i + 1 ) + ": " + foo ( ifile ) ) ;
  }
  final int h = Integer . parseInt ( System . in ) ;
  final int n = Integer . parseInt ( System . in ) ;
  final int m = Integer . parseInt ( System . in ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    print ( "Case #" + ( i + 1 ) + ": " + foo ( ifile ) ) ;
  }
  final int [ ] [ ] ceils = new int [ n ] [ m ] ;
  final int [ ] [ ] floors = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      floors [ i ] [ j ] = Integer . parseInt ( System . in ) ;
    }
  }
  final double [ ] [ ] res = new double [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    res [ i ] [ 0 ] = 0.0 ;
  }
  final PriorityQueue < Double > queue = new PriorityQueue < Double > ( ) ;
  queue . add ( new Double ( 0.0 ) ) ;
  while ( queue . size ( ) != 0 ) {
    final double time = queue . poll ( ) ;
    final int x = queue . poll ( ) ;
    final int y = queue . poll ( ) ;
    if ( time > res [ x ] [ y ] ) {
      continue ;
    }
    for ( int x1 = 0 , y1 = queue . poll ( ) ;
    x1 < n ;
    x1 ++ , y1 ++ ) {
      if ( ! valid ( x1 , y1 , n , m ) ) {
        queue . add ( new Double ( t2 ) ) ;
      }
    }
  }
  return res [ queue . size ( ) - 1 ] [ 0 ] ;
}
