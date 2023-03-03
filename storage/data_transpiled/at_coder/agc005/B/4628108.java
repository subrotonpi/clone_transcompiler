static final int [ ] getUnionFinds ( int N ) {
  System . setSecurityManager ( new RMISecurityManager ( ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  class UnionFind implements Comparator {
    int [ ] parent = new int [ N ] ;
    int [ ] size = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) parent [ i ] = i ;
    int [ ] size = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) size [ i ] = 1 ;
  }
  int [ ] a = new int [ N ] ;
  UnionFind ( N ) {
    int px , py ;
    public void find ( int x , int y ) {
      int px , py ;
      px = x ;
      py = y ;
      if ( px == py ) return ;
      if ( size [ px ] < size [ py ] ) {
        parent [ px ] = py ;
        size [ py ] += size [ px ] ;
      }
      else {
        parent [ py ] = px ;
        size [ px ] += size [ py ] ;
      }
    }
    public boolean same ( int x , int y ) {
      return this . find ( x ) == this . find ( y ) ;
    }
  }
  ;
  N = Integer . parseInt ( input ) ;
  A = Integer . parseInt ( input ) ;
  UnionFind Un = new UnionFind ( N + 1 ) ;
  int [ ] pos = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) pos [ i ] = - 1 ;
  for ( int i = 0 ;
  i < pos . length ;
  i ++ ) {
    pos [ i ] = i ;
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int ind = pos [ i ] ;
    int left = 0 ;
    int right = 0 ;
    if ( ind > 0 && A [ ind ] < A [ ind - 1 ] ) {
      left = Un . size [ Un . indexOf ( ind - 1 ) ] ;
      Un . union ( ind , ind - 1 ) ;
    }
    if ( ind + 1 < N && A [ ind + 1 ] > A [ ind ] ) {
      right = Un . size [ Un . indexOf ( ind + 1 ) ] ;
      Un . union ( ind , ind + 1 ) ;
    }
    ans += ( left + 1 ) * ( right + 1 ) * A [ ind ]