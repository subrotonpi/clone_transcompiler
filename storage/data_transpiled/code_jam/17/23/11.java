private static int [ ] [ ] solve ( ) {
  final int n = Integer . parseInt ( System . in ) ;
  final int q = Integer . parseInt ( System . in ) ;
  final int [ ] [ ] horses = new int [ n ] [ n ] ;
  final int [ ] [ ] routes = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    horses [ i ] [ 0 ] = Integer . parseInt ( System . in ) ;
    horses [ i ] [ 1 ] = Integer . parseInt ( System . in ) ;
    routes [ i ] [ 2 ] = Integer . parseInt ( System . in ) ;
  }
  final int t = Integer . parseInt ( System . in ) ;
  if ( verbose ) {
    System . err . println ( ) ;
    System . err . flush ( ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . err . println ( "Case #" + ( i + 1 ) + ":" ) ;
    write ( testCases [ i ] ) ;
  }
  final int [ ] [ ] wanted = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . err . println ( ) ;
    System . err . flush ( ) ;
  }
  final int [ ] [ ] sol = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . err . println ( ) ;
    System . err . flush ( ) ;
  }
  final int n = Integer . parseInt ( System . in ) ;
  final int [ ] [ ] q = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . err . println ( ) ;
    System . err . flush ( ) ;
  }
  final int [ ] [ ] sol = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . err . println ( ) ;
    System . err . flush ( ) ;
  }
  final int [ ] [ ] result = sol ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int u = wanted [ i ] ;
    final int v = wanted [ i ] ;
    final PriorityQueue < Integer > queue = new PriorityQueue < > ( ) ;
    queue . offer ( new Integer ( 0.0 ) ) ;
    result [ i ] = u ;
    result [ i ] =