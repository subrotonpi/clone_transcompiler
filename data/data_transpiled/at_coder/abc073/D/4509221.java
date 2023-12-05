@ VisibleForTesting static int [ ] [ ] solve ( int N , int [ ] [ ] R , int [ ] [ ] ABCs ) {
  final int INF = 2 * R . intInfo . getBitsPerDigit ( ) ;
  int [ ] [ ] dists = new int [ N ] [ N ] ;
  for ( int __ = 0 ;
  __ < N ;
  __ ++ ) {
    dists [ __ ] [ __ ] = - 1 ;
  }
  int ans = INF ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int tans = 0 ;
    for ( int j = 0 ;
    j < R . length ;
    j ++ ) {
      int s = i ;
      int e = i ;
      if ( dists [ s - 1 ] [ e - 1 ] == - 1 ) {
        int d = denseDijkstra ( s , e , N , ABCs ) ;
        dists [ s - 1 ] [ e - 1 ] = d ;
        dists [ e - 1 ] [ s ] = d ;
      }
      else {
        int d = dists [ s - 1 ] [ e - 1 ] ;
        dists [ s ] [ e ] = d ;
      }
    }
    ans = min ( ans , tans ) ;
  }
  if ( __name__ . equals ( "__main__" ) ) {
    N = Integer . parseInt ( input ( ) ) ;
    M = Integer . parseInt ( input ( ) ) ;
    R = Integer . parseInt ( input ( ) ) ;
    Arrays . sort ( dists ) ;
    Arrays . sort ( dists ) ;
    Arrays . sort ( dists ) ;
    System . out . println ( solve ( N , M , R , ABCs ) ) ;
  }
  else {
    Arrays . sort ( dists ) ;
    Arrays . sort ( dists ) ;
  }
  int [ ] [ ] adjlist = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    int c = Integer . parseInt ( input ( ) ) ;
    adjlist [ a - 1 ] [ b ] = c ;
    adjlist [ b - 1 ] [ a ] = c ;
  }
  PriorityQueue < Integer > q = new PriorityQueue < Integer > ( ) ;
  q . add ( new Integer ( 0 ) ) ;
  while ( q . size ( ) > 0 ) {
    int d = q . poll ( ) ;
    int i = q . poll ( ) ;
    if ( i == e ) return d ;
    