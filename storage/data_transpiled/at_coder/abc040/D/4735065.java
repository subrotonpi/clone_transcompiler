public static UnionFind < Integer > unionFind ( int n ) {
  int [ ] par = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) par [ i ] = - 1 ;
  return new UnionFind < Integer > ( n ) {
    @ Override public Integer root ( int x ) {
      if ( par [ x ] < 0 ) {
        return x ;
      }
      else {
        par [ x ] = root ( par [ x ] ) ;
        return par [ x ] ;
      }
    }
    @ Override public void merge ( int x , int y ) {
      int x = root ( x ) ;
      int y = root ( y ) ;
      if ( x != y ) {
        if ( par [ x ] > par [ y ] ) {
          x = y ;
          y = x ;
        }
        par [ x ] += par [ y ] ;
        par [ y ] = x ;
      }
    }
    @ Override public boolean isSameRange ( int x , int y ) {
      return root ( x ) == root ( y ) ;
    }
    @ Override public int getSize ( int x ) {
      return - par [ x ] ;
    }
  }
  ;
  final Scanner input = new Scanner ( System . in ) ;
  final List < Integer > ans = new ArrayList < Integer > ( ) ;
  final Comparator < Integer > anComparator = new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int m = input . nextInt ( ) ;
  final int [ ] [ ] info = new int [ m ] [ ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    info [ i ] = tuple ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  final int q = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] query = new int [ q ] [ ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    query [ i ] = tuple ( i + 1 , - 1 , - 1 ) ;
  }
  @ SuppressWarnings ( "rawtypes" ) final List < Integer > info = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < info . length ;
  i ++ ) {
    info . add ( tuple ( info [ i ] ) ) ;
  }
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    info . add ( query [