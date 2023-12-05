public static void a ( int a , int b , int k , int l ) {
  int ans = Math . min ( ( k % l ) * a + ( k / l ) * b , ( k / l + 1 ) * b ) ;
  System . out . println ( ans ) ;
}
