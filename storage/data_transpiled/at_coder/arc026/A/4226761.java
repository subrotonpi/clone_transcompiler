public static int N ( ) {
  int A , B = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  return A * ( N - min ( 5 , N ) ) + B * min ( 5 , N ) ;
}
