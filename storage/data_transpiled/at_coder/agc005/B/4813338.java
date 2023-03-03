public static int [ ] [ ] solve ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  class UnionFind {
    int [ ] par = new int [ n ] ;
    int [ ] rank = new int [ n ] ;
    int [ ] size = new int [ n ] ;
    int left = 0 ;
    int right = 0 ;
    public int [ ] findInPlace ( int x ) {
      if ( par [ x ] == x ) {
        return par [ x ] ;
      }
      else {
        par [ x ] = find ( par [ x ] ) ;
        return par [ x ] ;
      }
    }
    public int [ ] unite ( int x , int y ) {
      x = input . nextInt ( ) ;
      y = input . nextInt ( ) ;
      if ( x != y ) {
        if ( rank [ x ] < rank [ y ] ) {
          par [ x ] = y ;
          size [ y ] += size [ x ] ;
        }
        else {
          par [ y ] = x ;
          size [ x ] += size [ y ] ;
        }
        if ( rank [ x ] == rank [ y ] ) {
          rank [ x ] ++ ;
        }
      }
    }
    public boolean sameCheck ( int x , int y ) {
      return input . nextInt ( ) == y ;
    }
    public int [ ] treeSize ( int x ) {
      return size [ x ] ;
    }
  }
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = - 1 ;
  UnionFind uf = new UnionFind ( N + 1 ) ;
  int [ ] place = new int [ N + 1 ] ;
  int ans = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) place [ a [ i ] ] = i ;
  for ( int i = N ;
  i > 0 ;
  i -- ) {
    int left = 0 ;
    int right = 0 ;
    if ( a [ place [ i ] ] < a [ place [ i - 1 ] ] ) {
      left = uf . treeSize ( uf . indexOf ( a [ place [ i ] - 1 ] ) ) ;
      uf . unite ( a [ place [ i ] ] , a [ place [ i - 1 ] ] ) ;
    }
    if ( a [ place [ i ] ] < a [ place [ i + 1 ] ] ) {
      right = uf . treeSize ( uf . indexOf ( a [ place [ i ] ]