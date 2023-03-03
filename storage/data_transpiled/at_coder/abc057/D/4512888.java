static final int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > V = new LinkedList < Integer > ( ) ;
  for ( int i = A ;
  i <= B ;
  i ++ ) {
    V . add ( i ) ;
  }
  Collections . sort ( V ) ;
  Collections . reverse ( V ) ;
  int cur = 0 ;
  List < Integer > selectlist = new ArrayList < Integer > ( ) ;
  for ( int i = A ;
  i <= B ;
  i ++ ) {
    int S = 0 ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      S += V . get ( j ) ;
    }
    S = S / i ;
    if ( cur < S ) {
      cur = S ;
      selectlist = new ArrayList < Integer > ( ) ;
    }
    else if ( cur == S ) {
      selectlist . add ( i ) ;
    }
  }
  int ans = 0 ;
  for ( int p = 0 ;
  p < selectlist . size ( ) ;
  p ++ ) {
    int nowselect = 1 ;
    int s = 0 ;
    List < Integer > K = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < selectlist . get ( p ) ;
    i ++ ) {
      K . add ( V . get ( i ) ) ;
    }
    List < Integer > P = new LinkedList < Integer > ( K ) ;
    Collections . sort ( P ) ;
    Collections . reverse ( P ) ;
    for ( int j = 0 ;
    j < P . size ( ) ;
    j ++ ) {
      int cnt = V . stream ( ) . filter ( P . get ( j ) ) . count ( ) ;
      s += cnt ;
      if ( s >= selectlist . get ( p ) ) {
        int res = K . stream ( ) . filter ( P . get ( j ) ) . count ( ) ;
        nowselect *= Math . factorial ( cnt ) / ( Math . factorial ( res ) * Math . factorial ( cnt - res ) ) ;
        ans += nowselect ;
      }
      else {
        nowselect *= cnt ;
      }
    }
  }
  System . out . println ( cur ) ;
  System . out . println ( ans ) ;
  return ans ;
}
