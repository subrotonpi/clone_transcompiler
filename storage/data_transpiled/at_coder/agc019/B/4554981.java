public static void input ( Scanner S ) {
  int N = S . nextInt ( ) ;
  int ans = N * ( N - 1 ) / 2 + 1 ;
  int [ ] a = new int [ N ] ;
  int cnt = 0 ;
  for ( char c : new char [ N ] ) for ( int i = 97 ;
  i <= 97 ;
  i += 26 ) {
    cnt = S . nextInt ( ) ;
    a [ cnt ] = cnt * ( cnt - 1 ) / 2 ;
  }
  ans -= Arrays . asList ( a ) ;
  System . out . println ( ans ) ;
}
