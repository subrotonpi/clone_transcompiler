public static int N = Integer . parseInt ( input ) {
  class DisjointSet {
    private final List < Integer > parent ;
    private final int [ ] rank = new int [ size ] ;
    @ Override public Integer find ( int x ) {
      if ( parent [ x ] == x ) {
        return x ;
      }
      else {
        parent [ x ] = find ( parent [ x ] ) ;
        return parent [ x ] ;
      }
    }
    @ Override public void union ( int x , int y ) {
      int xr = find ( x ) ;
      int yr = find ( y ) ;
      if ( rank [ xr ] > rank [ yr ] ) {
        parent [ yr ] = xr ;
      }
      else if ( rank [ xr ] < rank [ yr ] ) {
        parent [ xr ] = yr ;
      }
      else if ( xr != yr ) {
        parent [ yr ] = xr ;
        rank [ xr ] ++ ;
      }
    }
  }
  List < Integer > X = new ArrayList < > ( ) , Y = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    X . add ( new Integer ( x ) ) ;
    Y . add ( new Integer ( y ) ) ;
  }
  Collections . sort ( X ) ;
  Collections . sort ( Y ) ;
  /* Convert to an array of doubles */
  Iterator < List < Integer >> it = L . iterator ( ) ;
  Iterator < List < Integer >> it2 = L . iterator ( ) ;
  while ( it2 . hasNext ( ) ) {
    List < Integer > D = new ArrayList < > ( ) ;
    for ( int a = it . next ( ) ;
    a != null ;
    a = it . next ( ) ) {
      int ax = a ;
      int ai = a ;
      int bx = b ;
      int bi = b ;
      int d = Math . abs ( ax - bx ) ;
      D . add ( new Integer ( d ) ) ;
    }
  }
  List < Integer > dX = convertToDists ( X ) ;
  List < Integer > dY = convertToDists ( Y ) ;
  List < Integer > D = dX . stream ( ) . map ( Integer :: parseInt ) . collect ( Collectors . toList ( ) ) ;
  int cost = 0 ;
  DisjointSet S = new DisjointSet ( N ) ;
  int edgeCount = 1 ;
  for ( int d : D ) {
    int i