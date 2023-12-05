@ Function public static void math ( String ... input ) {
  int n = Integer . parseInt ( input [ 0 ] ) ;
  int k = Integer . parseInt ( input [ 1 ] ) ;
  int a = input [ 2 ] ;
  int ans = ceil ( ( n - 1 ) / ( k - 1 ) ) ;
  System . out . println ( ans ) ;
}
