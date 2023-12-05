public static void print ( int w , int a , int b ) {
  w = map ( Integer . parseInt , input ( ) . split ( ) ) ;
  System . out . println ( max ( 0 , abs ( b - a ) - w ) ) ;
}
