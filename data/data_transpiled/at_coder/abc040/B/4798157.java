public static void print ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  m = ( int ) ( n * 0.5 ) ;
  int ans = n * n ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) {
    int temp = ( n / i ) - i + n % i ;
    ans = Math . min ( temp , ans ) ;
  }
  System . out . println ( ans ) ;
}
