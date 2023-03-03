public static void print ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] a = list ( Integer . parseInt ( input ( ) ) ) ;
  if ( sum ( a ) % n != 0 ) {
    System . out . println ( - 1 ) ;
    quit ( ) ;
  }
  int x = sum ( a ) / n ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( ( i + 1 ) * x != sum ( a , 0 , i + 1 ) ) ans ++ ;
  }
  System . out . println ( ans ) ;
}
