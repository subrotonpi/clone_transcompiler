public static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    A [ a ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] Plus = new int [ N ] , Whole = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Plus [ i ] = Plus [ N - 1 ] + Math . max ( A [ i ] , 0 ) ;
    Whole [ i ] = Whole [ i - 1 ] + A [ i ] ;
  }
  int Score = Math . max ( Math . max ( 0 , Whole [ K ] - Whole [ 0 ] ) + Plus [ N ] - Plus [ K ] , Plus [ N - K ] - Plus [ 0 ] + Math . max ( 0 , Whole [ N ] - Whole [ N - K ] ) ) ;
  for ( int i = 1 ;
  i < N - K ;
  i ++ ) {
    int temp = Plus [ i ] + Math . max ( 0 , Whole [ i + K ] - Whole [ i ] ) + Plus [ N ] - Plus [ i + K ] ;
    Score = Math . max ( Score , temp ) ;
  }
  System . out . println ( Score ) ;
}
