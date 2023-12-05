@ InputFunction public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] aby = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    aby [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] vw = new int [ q ] [ ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      vw [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  Arrays . sort ( aby , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return 2 - o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  Arrays . sort ( vw , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return 1 - o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  class UnionFind implements UnionFind {
    int [ ] rank = new int [ size ] ;
    int [ ] number = new int [ size ] ;
    for ( int i = 0 ;
    i < size ;
    i ++ ) {
      rank [ i ] = - 1 ;
    }
    int [ ] rank = new int [ size ] ;
    for ( int i = 0 ;
    i < rank . length ;
    i ++ ) {
      rank [ i ] = 1 ;
    }
    int [ ] rank = new int [ size ] ;
    for ( int i = 0 ;
    i < rank . length ;
    i ++ ) {
      rank [ i ] = rank [ i ] ;
    }
  }
  UnionFind ( ) {
    UnionFind uft = new UnionFind ( n ) ;
    int [ ] ans = new int [ q ] ;
    int t = 0 ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      int v = vw [ i ] [ 0 ] ;
      int w = vw [ i ] [ 1 ] ;
      for ( int j = t ;
      j < m ;
      j ++ ) {
        int a = aby [ i ] ;
        int b = aby [ j ] ;
        int y = aby [ i ] ;
        if ( y <= w ) {
          t = i ;
          break ;
        }
        if ( uft . find ( a -