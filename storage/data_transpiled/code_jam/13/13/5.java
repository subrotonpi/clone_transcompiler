static final int [ ] [ ] db ( ) throws IOException {
  final int R = 100 ;
  final int N = 3 ;
  final int M = 5 ;
  final int K = 7 ;
  final HashMap < Point , Integer > db = new HashMap < Point , Integer > ( ) ;
  for ( int i = 2 ;
  i <= M ;
  i ++ ) {
    for ( int j = 2 ;
    j <= M ;
    j ++ ) {
      for ( int k = 2 ;
      k <= M ;
      k ++ ) {
        final HashMap < Integer , Integer > p = new HashMap < Integer , Integer > ( ) ;
        for ( int n1 = 2 ;
        n1 <= N ;
        n1 ++ ) {
          for ( int n2 = 2 ;
          n2 <= N ;
          n2 ++ ) {
            for ( int n3 = 2 ;
            n3 <= N ;
            n3 ++ ) {
              final int num = i * n1 * j * n2 * k * n3 ;
              if ( ! p . containsKey ( num ) ) {
                p . put ( num , 1 ) ;
              }
              else {
                p . put ( num , 1 ) ;
              }
            }
          }
        }
        db . put ( new Point ( i , j , k ) , p ) ;
      }
    }
  }
  final BufferedReader br = new BufferedReader ( new FileReader ( "small.in" ) ) ;
  final int t = Integer . parseInt ( br . readLine ( ) ) ;
  ( Integer . parseInt ( br . readLine ( ) ) ) ;
  System . out . println ( R + N + M + K ) ;
  System . out . println ( "Case #1:" ) ;
  for ( int T = 0 ;
  T < R ;
  T ++ ) {
    final int [ ] products = new int [ N ] ;
    for ( int i = 0 ;
    i <= M ;
    i ++ ) {
      products [ i ] = Integer . parseInt ( br . readLine ( ) ) ;
    }
    int m = 0 ;
    Point ans = new Point ( 0 , 0 , 0 ) ;
    for ( int i = 2 ;
    i <= M ;
    i ++ ) {
      for ( int j = 2 ;
      j <= M ;
      j ++ ) {
        for ( int k = 2 ;
        k <= M ;
        k ++ ) {
          int l = 1 ;
          for ( int product : products ) {
            if ( db . get ( new Point ( i , j , k ) ) . containsKey ( product ) ) {
              l *= db . get ( new Point ( i , j , k ) ) . get ( product ) ;
            }
            else {
              l = 0 ;
            }
            if ( l > m ) {
              m =