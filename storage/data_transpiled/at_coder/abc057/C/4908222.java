public static int N ( ) {
  int ans = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( i * i <= N ) {
      if ( N % i == 0 ) ans = i ;
    }
    else break ;
  }
  System . out . println ( Integer . toString ( N / ans ) . length ( ) ) ;
  return ans ;
}
