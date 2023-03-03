public static int N = Integer . parseInt ( input ) {
  String S1 = input . next ( ) ;
  String S2 = input . next ( ) ;
  Map < String , Integer > D = new HashMap < String , Integer > ( ) ;
  for ( int i = 10 ;
  i < 36 ;
  i ++ ) D . put ( String . valueOf ( i ) , i ) ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) D . put ( String . valueOf ( i ) , i ) ;
  class UnionFind implements UnivariateFindVisitor {
    int n ;
    int [ ] par = new int [ n ] ;
    int [ ] rank = new int [ n ] ;
    int [ ] size = new int [ n ] ;
    int x ;
    int y ;
    public UnivariateFindVisitor ( int n ) {
      par [ 0 ] = i ;
      rank [ 0 ] = 0 ;
      size [ 0 ] = 1 ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        par [ i ] = i ;
      }
      return new UnivariateFindVisitor ( ) {
        @ Override public int find ( int i ) {
          if ( par [ i ] == x ) {
            return i ;
          }
          else {
            par [ i ] = find ( par [ i ] ) ;
            return par [ i ] ;
          }
        }
        @ Override public int union ( int i , int j ) {
          x = par [ i ] ;
          y = par [ j ] ;
          if ( x == y ) return 0 ;
          if ( rank [ x ] < rank [ y ] ) {
            par [ i ] = y ;
            size [ y ] += size [ x ] ;
            size [ x ] = 0 ;
          }
          else {
            par [ i ] = x ;
            size [ x ] += size [ y ] ;
            size [ y ] = 0 ;
            if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
          }
          return 0 ;
        }
        @ Override public boolean same ( int i , int j ) {
          return par [ i ] == j ;
        }
        @ Override public void allFind ( ) {
          for ( int n = 0 ;
          n < par . length ;
          n ++ ) {
            par [ n ] = par [ n ] ;
          }
        }
      }
      ;
    }
    UnionFind UF = new UnionFind ( 37 ) ;
    UF . union ( D . get ( S1 [ 0 ] ) , 36 ) ;
    UF . union ( D . get ( S2 [ 0 ] ) , 36 ) ;
    for ( int s1 = 0 , s2 = 0 ;
    