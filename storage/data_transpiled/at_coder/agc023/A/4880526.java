public static void print ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  List < Integer > S = new ArrayList < > ( ) ;
  S . add ( 0 ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S . add ( S . get ( i ) + A . get ( i ) ) ;
  }
  Collections . sort ( S ) ;
  int now = S . get ( 0 ) ;
  int s = 1 ;
  int ans = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( now == S . get ( i ) ) {
      s ++ ;
    }
    else {
      ans += s * ( s - 1 ) / 2 ;
      s = 1 ;
    }
    now = S . get ( i ) ;
  }
  ans += s * ( s - 1 ) / 2 ;
  System . out . println ( ans ) ;
}
