public static int T = Integer . parseInt ( input ) {
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int N , S ;
    N = input . nextInt ( ) ;
    int answer = 0 , alive = Integer . parseInt ( S . substring ( 0 , 1 ) ) , N = Integer . parseInt ( N ) ;
    for ( int n = 1 ;
    n <= N ;
    n ++ ) {
      if ( S . charAt ( n ) == '0' ) continue ;
      if ( alive < n ) {
        answer += n - alive ;
        alive = n ;
      }
      alive += Integer . parseInt ( S . substring ( n , n + 1 ) ) ;
    }
    System . out . println ( "Case #" + t + ": " + answer ) ;
  }
  return N ;
}
