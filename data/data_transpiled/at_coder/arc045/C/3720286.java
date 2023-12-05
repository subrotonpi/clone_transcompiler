@ VisibleForTesting static void input ( ) {
  int n = ( Integer ) input . nextInt ( ) ;
  int k = ( Integer ) input . nextInt ( ) ;
  List < Pair > p = new ArrayList < > ( ) , q = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int x = ( Integer ) input . nextInt ( ) ;
    int y = ( Integer ) input . nextInt ( ) ;
    int c = ( Integer ) input . nextInt ( ) ;
    p . add ( new Pair ( y - 1 , c ) ) ;
    p . get ( y - 1 ) . add ( new Pair ( x - 1 , c ) ) ;
  }
  for ( int i = 0 ;
  i < p . get ( 0 ) . size ( ) ;
  i ++ ) q . add ( new Pair ( p . get ( i ) . get ( 0 ) , 0 , 0 ) ) ;
  int [ ] z = new int [ n ] , d = new int [ n ] ;
  z [ 0 ] = 0 ;
  d [ 0 ] = 0 ;
  int a = 0 ;
  while ( q . size ( ) > 0 ) {
    int p0 = q . remove ( ) ;
    int p1 = q . remove ( ) ;
    z [ p0 ] = z [ m ] ^ p1 ;
    a += d [ k ^ z [ p0 ] ] ;
    d [ z [ p0 ] ] ++ ;
    for ( int i = 0 ;
    i < p . get ( p0 ) . size ( ) ;
    i ++ ) if ( z [ i ] == - 1 ) q . add ( new Pair ( p . get ( p0 ) , i , p0 ) ) ;
  }
  System . out . println ( a ) ;
}
