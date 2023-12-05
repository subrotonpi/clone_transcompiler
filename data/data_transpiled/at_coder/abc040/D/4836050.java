static final String [ ] getUnionFinds ( int N ) {
  final String input = "Enter a union find of two nodes." ;
  class UnionFind implements Comparator {
    private final int [ ] parent = new int [ N ] ;
    private final int [ ] size = new int [ N ] ;
    private int [ ] count = new int [ N ] ;
    @ Override public int find ( int x ) {
      if ( parent [ x ] == x ) {
        return x ;
      }
      else {
        return find ( parent [ x ] ) ;
      }
    }
    @ Override public void union ( int x , int y ) {
      int px = find ( x ) ;
      int py = find ( y ) ;
      if ( px == py ) {
        return ;
      }
      if ( count [ px ] < count [ py ] ) {
        parent [ px ] = py ;
        count [ py ] += count [ px ] ;
      }
      else {
        parent [ py ] = px ;
        count [ px ] += count [ py ] ;
      }
    }
    @ Override public boolean same ( int x , int y ) {
      return count [ x ] == y ;
    }
  }
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < List < Integer >> road = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    road . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  int Q = Integer . parseInt ( input ) ;
  List < int [ ] > query = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int q = Integer . parseInt ( input ) ;
    int year = Integer . parseInt ( input ) ;
    query . add ( new int [ ] {
      i , q , year }
      ) ;
    }
    Arrays . sort ( road , new Comparator < Integer > ( ) {
      @ Override public int compare ( Integer o1 , Integer o2 ) {
        return o1 . compareTo ( o2 ) ;
      }
    }
    ) ;
    Arrays . sort ( query , new Comparator < Integer > ( ) {
      @ Override public int compare ( Integer o1 , Integer o2 ) {
        return o1 . compareTo ( o2 ) ;
      }
    }
    ) ;
    UnionFind Un = new UnionFind ( N ) ;
    int ans [ ] = new int [ Q ] ;
    int left = 0 ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) {
      int n = query . get ( i ) ;
      for (