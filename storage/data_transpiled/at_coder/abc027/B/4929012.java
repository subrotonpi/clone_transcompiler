public static void print ( int N ) {
  int [ ] A = list ( Integer . parseInt ( input ( ) ) ) ;
  if ( sum ( A ) % A . length != 0 ) {
    System . out . println ( - 1 ) ;
    quit ( ) ;
  }
  int x = sum ( A ) / A . length ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( ( i + 1 ) * x != sum ( A , 0 , i + 1 ) ) ans ++ ;
  }
  System . out . println ( ans ) ;
}
