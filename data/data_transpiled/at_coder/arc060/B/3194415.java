public static int n ( ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) , b ;
  /*if (n < b) return n;
  return f(b, n/b) + n%b;*/
  if ( n == s ) {
    System . out . println ( n + 1 ) ;
    exit ( ) ;
  }
  for ( int i = 2 ;
  i <= ( int ) ( n * .5 ) ;
  i ++ ) {
    b = ( n - s ) / i + 1 ;
    if ( b > 1 && s == f ( b , n ) ) {
      System . out . println ( b ) ;
      exit ( ) ;
    }
  }
  System . out . println ( - 1 ) ;
  return s ;
}
