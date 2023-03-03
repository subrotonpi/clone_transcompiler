@ VisibleForTesting static int [ ] [ ] floydWarshall ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] [ ] dist = new double [ n ] [ n ] ;
  HashMap < Integer , Integer > takaHashi = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dist [ i ] [ i ] = Double . MAX_VALUE ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    a -- ;
    b -- ;
    if ( a == 0 ) {
      takaHashi . put ( b , l ) ;
    }
    else {
      dist [ a ] [ b ] = l ;
      dist [ b ] [ a ] = l ;
    }
  }
  dist = floydWarshall ( dist , false ) ;
  List < Integer > canGo = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < takaHashi . size ( ) ;
  i ++ ) {
    canGo . add ( takaHashi . get ( i ) ) ;
  }
  int k = canGo . size ( ) ;
  double ans = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < k ;
    j ++ ) {
      int indI = canGo . get ( i ) ;
      int indJ = canGo . get ( j ) ;
      ans = Math . min ( ans , takaHashi . get ( indI ) + takaHashi . get ( indJ ) + dist [ indI ] [ indJ ] ) ;
    }
  }
  if ( ans == Double . MAX_VALUE ) {
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . println ( ( int ) ans ) ;
  }
  return dist ;
}
