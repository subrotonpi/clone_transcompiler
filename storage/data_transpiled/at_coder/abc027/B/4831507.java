public static void print ( int N ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  if ( Arrays . binarySearch ( a , a ) % N != 0 ) {
    System . out . println ( - 1 ) ;
    quit ( ) ;
  }
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( Arrays . binarySearch ( a , a , i + 1 ) != ( i + 1 ) * Arrays . binarySearch ( a , i + 1 ) / N ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
