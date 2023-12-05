public static int max ( ) {
  int A , B = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  return max ( max ( A + B , A - B ) , A * B ) ;
}
