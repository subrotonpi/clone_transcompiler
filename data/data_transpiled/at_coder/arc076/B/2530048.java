@ Nonnull public static < T > UnionFind < T > create ( int N ) {
  class UnionFind < T > {
    private int [ ] parent = new int [ N ] ;
    private int [ ] rank = new int [ N ] ;
    private int count = 0 ;
    @ Override public T root ( T a ) {
      if ( parent [ a ] == a ) return a ;
      else {
        parent [ a ] = root ( parent [ a ] ) ;
        return parent [ a ] ;
      }
    }
    @ Override public boolean isSameIndex ( T a , T b ) {
      return root ( a ) == root ( b ) ;
    }
    @ Override public void unite ( T a , T b ) {
      int ra = root ( a ) ;
      int rb = root ( b ) ;
      if ( ra == rb ) return ;
      if ( rank [ ra ] < rank [ rb ] ) parent [ ra ] = rb ;
      else {
        parent [ rb ] = ra ;
        if ( rank [ ra ] == rank [ rb ] ) rank [ ra ] ++ ;
      }
      count ++ ;
    }
  }
  int N = Integer . parseInt ( input ( ) ) ;
  Map < Integer , T > xd = new LinkedHashMap < Integer , T > ( N ) ;
  Map < Integer , T > yd = new LinkedHashMap < Integer , T > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ( ) ) ;
    int y = Integer . parseInt ( input ( ) ) ;
    xd . put ( x , i ) ;
    yd . put ( y , i ) ;
  }
  UnionFind < T > uf = new UnionFind < T > ( N ) ;
  List < Entry < Integer , T >> es = new ArrayList < Entry < Integer , T >> ( ) ;
  int pre_x = 0 ;
  int pre_i = 0 ;
  for ( Entry < Integer , T > entry : xd . entrySet ( ) ) {
    int x = entry . getKey ( ) ;
    int y = entry . getValue ( ) ;
    if ( idxs . length >= 2 ) {
      for ( int i1 = 0 ;
      i1 < idxs . length ;
      i1 ++ ) {
        int i2 = idxs [ i1 ] ;
        if ( uf . isSameIndex ( i1 , i2 ) ) continue ;
        uf . unite ( i1 , i2 ) ;
      }
    }
    if ( pre_x != 0 ) {
      int dx = x - pre_x ;
      es . add ( new Entry < Integer , T > ( dx , pre_i , entry . getValue ( )