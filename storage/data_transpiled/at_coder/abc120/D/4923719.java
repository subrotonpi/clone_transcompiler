public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  Pair [ ] bridges = new Pair [ M ] ;
  for ( int m = 0 ;
  m < M ;
  m ++ ) {
    bridges [ m ] = Pair . of ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  UnionFind tree = new UnionFind ( N ) ;
  int [ ] increments = new int [ M ] ;
  for ( int m = M ;
  m > 0 ;
  m -- ) {
    if ( tree . isSameType ( ( Pair ) bridges [ m ] ) ) continue ;
    increments [ m ] += tree . getSize ( ( Pair ) bridges [ m ] . getLeft ( ) ) * tree . getSize ( ( Pair ) bridges [ m ] . getRight ( ) ) ;
    tree . unite ( ( Pair ) bridges [ m ] ) ;
  }
  int cumsum = 0 ;
  for ( int i : increments ) {
    cumsum += i ;
    System . out . println ( cumsum ) ;
  }
  class UnionFind {
    int [ ] par = new int [ n + 1 ] ;
    int [ ] rank = new int [ n + 1 ] ;
    int [ ] size = new int [ n + 1 ] ;
    int x ;
    int y ;
    public UnionFind ( int x ) {
      if ( par [ x ] == x ) {
        return x ;
      }
      else {
        par [ x ] = find ( par [ x ] ) ;
        return par [ x ] ;
      }
    }
    public void unite ( int x , int y ) {
      x = par [ x ] ;
      y = par [ y ] ;
      if ( rank [ x ] > rank [ y ] ) {
        par [ y ] = x ;
        size [ x ] += size [ y ] ;
      }
      else if ( rank [ x ] < rank [ y ] ) {
        par [ x ] = y ;
        size [ y ] += size [ x ] ;
      }
      else {
        par [ x ] = y ;
        size [ y ] += size [ x ] ;
        rank [ y ] ++ ;
      }
    }
    public int getSize ( int x ) {
      return size [ find ( x ) ] ;
    }
    public boolean isSameType ( int x , int y ) {
      return find ( x , y ) == find ( y ) ;
    }
  }
  