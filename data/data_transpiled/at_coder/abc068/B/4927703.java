public static int N ( ) {
  int i = 1 ;
  int ans ;
  while ( 2 * i <= N ) {
    ans = 2 * i ;
    i ++ ;
  }
  if ( N == 1 ) {
    System . out . println ( 1 ) ;
  }
  else {
    System . out . println ( ans ) ;
  }
  return i ;
}
