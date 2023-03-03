public static void print ( int N ) {
  String S = input ( ) ;
  int count = S . substring ( 1 ) . indexOf ( 'E' ) ;
  int ans = S . substring ( 1 ) . indexOf ( 'E' ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    count += ( S . charAt ( i ) . indexOf ( 'W' ) - S . charAt ( i + 1 ) . indexOf ( 'E' ) ) ;
    ans = count < ans ? count : ans ;
  }
  System . out . println ( ans ) ;
}
