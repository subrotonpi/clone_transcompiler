public static void print ( int N ) {
  int D = Integer . parseInt ( input ( ) ) , X = Integer . parseInt ( input ( ) ) ;
  int ans = X ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int A = Integer . parseInt ( input ( ) ) ;
    X += ( D + A - 1 ) / A ;
  }
  System . out . println ( X ) ;
}
