@ VisibleForTesting static List < Integer > getPath ( int start , int goal ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] rs = new int [ n ] [ r ] ;
  for ( int i = 1 ;
  i < r ;
  i ++ ) {
    rs [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] abc = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    abc [ i ] [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  ans = Math . min ( ans , distance ) ;
  class Dijkstra {
    int [ ] [ ] adj ;
    int num = adj . length ;
    int [ ] dist = new int [ num ] ;
    int [ ] prev = new int [ num ] ;
    int [ ] q = new int [ num ] ;
  }
  public Dijkstra ( int [ ] [ ] adj ) {
    int [ ] adj = adj ;
    int num = adj . length ;
    int [ ] dist = new int [ num ] ;
    int [ ] prev = new int [ num ] ;
    int [ ] prev = new int [ num ] ;
    int [ ] prev = new int [ num ] ;
    int [ ] prev = new int [ num ] ;
    int [ ] prev = new int [ num ] ;
    for ( int i = 0 ;
    i < num ;
    i ++ ) {
      prev [ i ] = i ;
    }
    int [ ] dist = new int [ num ] ;
    for ( int i = 0 ;
    i < num ;
    i ++ ) {
      dist [ i ] = INF ;
      prev [ i ] = INF ;
    }
    int [ ] dist = new int [ num ] ;
    for ( int i = 0 ;
    i < num ;
    i ++ ) {
      dist [ i ] = INF ;
      prev [ i ] = INF ;
    }
    int [ ] dist = new int [ num ] ;
    for ( int i = 0 ;
    i < num ;
    i ++ ) {
      dist [ i ] = INF ;
      prev [ i ] = INF ;
    }
    int [ ] path = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      path [ i ] = dist [ i ] ;
    }
    for ( int i = 0 ;
    i < num ;
    i ++