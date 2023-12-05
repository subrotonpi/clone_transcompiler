public static void print ( int N ) {
  int D = Integer . parseInt ( input ( ) ) , X = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int A = Integer . parseInt ( input ( ) ) ;
    X += 1 + ( D - 1 ) / A ;
  }
  System . out . println ( X ) ;
}
