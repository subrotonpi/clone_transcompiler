static void a ( int a , int b , int n ) {
  a = map ( Integer . parseInt , open ( 0 ) ) ;
  while ( n % a + n % b ) n ++ ;
  System . out . println ( n ) ;
}
