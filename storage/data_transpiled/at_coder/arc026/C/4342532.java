static final double [ ] getMemory ( ) {
  final double INF = Double . MAX_VALUE ;
  final double MOD = 10 * 9 + 7 ;
  final int [ ] LI = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    LI [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  }
  class SegmentTree implements Comparator < Object > {
    int n_ ;
    {
      int size = 2 * n_ ;
      int [ ] node = new int [ 2 * size ] ;
    }
    @ Override public void update ( int k , Object a ) {
      k += size - 1 ;
      node [ k ] = a ;
      while ( k >= 0 ) {
        k = ( k - 1 ) / 2 ;
        node [ k ] = Math . min ( node [ k * 2 + 1 ] , node [ k * 2 + 2 ] ) ;
      }
    }
    @ Override public int query ( int a , int b ) {
      int l = a + size , r = b + size ;
      int res = INF ;
      while ( l < r ) {
        if ( ( r & 1 ) != 0 ) {
          r -- ;
          res = Math . min ( res , node [ r - 1 ] ) ;
        }
        if ( ( l & 1 ) != 0 ) {
          res = Math . min ( res , node [ l - 1 ] ) ;
          l ++ ;
        }
        l >>= 1 ;
        r >>= 1 ;
      }
      return res ;
    }
  }
  final int n = LI [ 0 ] ;
  final int L = MOD ;
  SegmentTree sgt = new SegmentTree ( L + 1 ) ;
  final int [ ] Q = new int [ n ] ;
  for ( int i = 0 ;
  i < Q . length ;
  i ++ ) Q [ i ] = tuple ( LI ) ;
  Arrays . sort ( Q ) ;
  final double [ ] dp = new double [ L + 1 ] ;
  dp [ 0 ] = INF ;
  sgt . update ( 0 , 0 ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int l = Q [ i ] ;
    final int r = Q [ i ] ;
    final int c = Q [ i ] ;
    final double cost = sgt . query ( l , r ) + c ;
    if ( cost < dp [ r ] ) {
      dp [ r ] = cost ;
      sgt . update ( r , cost ) ;
    }
  }
  System . out . println ( dp [ dp . length - 1 ] ) ;
  return Q ;
  