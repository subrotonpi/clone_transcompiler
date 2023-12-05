static final String getStdIn ( int n ) {
  System . setIn ( "" ) ;
  String input = System . getProperty ( "line.separator" ) ;
  class WeightedUnionFind implements WeightedUnionFind {
    int [ ] par = new int [ n + 1 ] ;
    int [ ] rank = new int [ n + 1 ] ;
    int [ ] weight = new int [ n + 1 ] ;
    @ Override public int find ( int x ) {
      if ( par [ x ] == x ) {
        return x ;
      }
      else {
        int y = find ( par [ x ] ) ;
        weight [ x ] += weight [ par [ x ] ] ;
        par [ x ] = y ;
        return y ;
      }
    }
    @ Override public int union ( int x , int y , int w ) {
      int rx = find ( x ) ;
      int ry = find ( y ) ;
      if ( rank [ rx ] < rank [ ry ] ) {
        par [ rx ] = ry ;
        weight [ rx ] = w - weight [ x ] + weight [ y ] ;
      }
      else {
        par [ ry ] = rx ;
        weight [ ry ] = - w - weight [ y ] + weight [ x ] ;
        if ( rank [ rx ] == rank [ ry ] ) {
          rank [ rx ] ++ ;
        }
      }
      return 0 ;
    }
    @ Override public boolean same ( int x , int y ) {
      return find ( x ) == find ( y ) ;
    }
    @ Override public int diff ( int x , int y ) {
      return weight [ x ] - weight [ y ] ;
    }
  }
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  WeightedUnionFind Un = new WeightedUnionFind ( N + 1 ) ;
  String ans = "Yes" ;
  for ( ;
  ;
  ) {
    int l = Integer . parseInt ( input ) ;
    int r = Integer . parseInt ( input ) ;
    int w = Integer . parseInt ( input ) ;
    if ( Un . same ( l , r ) ) {
      if ( Un . diff ( l , r ) != w ) {
        ans = "No" ;
        break ;
      }
    }
    else {
      Un . union ( l , r , w ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
