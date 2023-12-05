public static void print ( int N ) {
  int D = Integer . parseInt ( input ( ) ) ;
  int X = Integer . parseInt ( input ( ) ) ;
  int ans = X ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += 1 + ( D - 1 ) / Integer . parseInt ( input ( ) ) ;
  }
  System . out . println ( ans ) ;
}
