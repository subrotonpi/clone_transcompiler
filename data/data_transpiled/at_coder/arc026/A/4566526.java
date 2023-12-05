public static void main ( String input ) {
  int n , a , b = map ( Integer . parseInt , input . split ( " " ) ) ;
  System . out . println ( min ( n , 5 ) * b + max ( n - 5 , 0 ) * a ) ;
}
