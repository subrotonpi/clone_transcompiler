public static int [ ] [ ] solve ( int xs , int ys , int xt , int yt ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < List < Integer >> a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N + 2 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N + 2 ;
    j ++ ) {
      if ( i > j ) {
        distancemap [ i ] [ j ] = distancemap [ j ] [ i ] ;
      }
      else {
        distancemap [ i ] [ j ] = distance ( i , j ) ;
      }
    }
    Dijkstra d = new Dijkstra ( distancemap , 0 ) ;
    return ( d . distance . pop ( ) ) ;
  }
  System . out . println ( solve ( xs , ys , xt , yt , a ) ) ;
  int [ ] [ ] distancemap = new int [ N + 2 ] [ N + 2 ] ;
  for ( int i = 0 ;
  i < N + 2 ;
  i ++ ) {
    distancemap [ i ] [ 0 ] = distancemap [ i ] [ 1 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 1 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 2 ] = Double . MIN_VALUE ;
    distancemap [ i ] [ 2 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 3 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 0 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 1 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 2 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 3 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 3 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 3 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 4 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 5 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 6 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 7 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 8 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 9 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 8 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 9 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 9 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 9 ] = Double . MAX_VALUE ;
    distancemap [ i ] [ 9 ] = Double . MAX_VALUE