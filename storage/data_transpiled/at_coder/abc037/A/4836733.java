public static void print ( int a , int b , int c ) {
  int ans = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  int d = Math . min ( a , b ) ;
  ans = c / d ;
  System . out . println ( ans ) ;
}
