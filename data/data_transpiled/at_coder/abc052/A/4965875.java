public static void print ( int a , int b , int c , int d ) {
  int max = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  int mx = max * ( a * b + c * d ) ;
  System . out . println ( mx ) ;
}
