public static void input ( Scanner in ) {
  int N = in . nextInt ( ) , K = in . nextInt ( ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = in . nextInt ( ) ;
  }
  int M1 = 0 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    if ( a [ i ] >= 0 ) M1 += a [ i ] ;
  }
  int s = 0 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    s += Math . max ( 0 , a [ K + i ] ) ;
  }
  int m1 = s ;
  for ( int i = 0 ;
  i < N - K ;
  i ++ ) {
    s = s + Math . max ( 0 , a [ K + i ] ) - Math . min ( 0 , a [ i ] ) ;
  }
  if ( m1 > s ) m2 = s ;
  System . out . println ( Math . max ( M1 - m1 , M1 + m2 ) ) ;
}
