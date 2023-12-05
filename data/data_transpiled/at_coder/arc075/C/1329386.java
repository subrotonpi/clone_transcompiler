@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static void solve ( ) {
  int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int k = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) - k ;
  }
  List < Integer > s = new ArrayList < > ( ) ;
  s . add ( 0 ) ;
  s . add ( 0 ) ;
  s . add ( 0 ) ;
  s . add ( 0 ) ;
  for ( Iterator < Integer > it = s . iterator ( ) ;
  it . hasNext ( ) ;
  ) {
    int si = it . next ( ) ;
    s . add ( ( si = it . next ( ) ) ) ;
  }
  Collections . sort ( s ) ;
  int [ ] z = new int [ n + 1 ] ;
  int num = - 1 ;
  double p = - Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    if ( s . get ( i ) . intValue ( ) > p ) {
      num ++ ;
    }
    z [ s . get ( i ) . intValue ( ) ] = num ;
    p = s . get ( i ) . intValue ( ) ;
  }
  FenwickTree ft = new FenwickTree ( num + 1 ) ;
  int ans = 0 ;
  for ( int zi : z ) {
    ans += ft . psum ( zi + 1 ) ;
    ft . add ( zi , 1 ) ;
  }
  System . out . println ( ans ) ;
  class FenwickTree {
    int n ;
    int [ ] b = new int [ n + 1 ] ;
    int i = 0 ;
    int x ;
    int i = n ;
    while ( i < = n ) {
      b [ i ++ ] = x ;
      i += i & ( - i ) ;
    }
  }
  FenwickTree < Integer > b = new FenwickTree < > ( n ) ;
  b [ n ] = 0 ;
  b [ n ] = 0 ;
  b [ n + 1 ] = 1 ;
  b [ n + 1 ] = 1 ;
  b [ n + 1 ] = 1 ;
  b [ n + 1 ] = 1 ;
  b [ n + 1 ] = 1 ;
}
