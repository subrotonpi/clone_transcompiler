public static void print ( int N , int K ) {
  map ( Integer . parseInt , input ( ) . split ( ) ) ;
  int ans = N % K == 0 ? 0 : 1 ;
  print ( ans ) ;
}
