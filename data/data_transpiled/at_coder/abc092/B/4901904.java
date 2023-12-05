public static void print ( int N ) {
  int D = Integer . parseInt ( input ( ) ) ;
  int X = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int A = Integer . parseInt ( input ( ) ) ;
    ans += ( D - 1 ) / A + 1 ;
  }
  System . out . println ( ans + X ) ;
}
