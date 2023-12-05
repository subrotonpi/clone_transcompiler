public static void input ( ) {
  int N = S . length ( ) ;
  int [ ] DP = new int [ 26 ] ;
  int ans = 0 ;
  for ( String st : S ) {
    DP [ ( int ) st . charAt ( 0 ) - 'a' ] ++ ;
  }
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    ans += DP [ i ] * ( N - DP [ i ] ) ;
  }
  System . out . println ( ans / 2 + 1 ) ;
}
