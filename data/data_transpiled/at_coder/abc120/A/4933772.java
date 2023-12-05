public static void print ( int a , int b , int c ) {
  int ans = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  ans = min ( ( int ) ( b / a ) , c ) ;
  System . out . println ( ans ) ;
}
