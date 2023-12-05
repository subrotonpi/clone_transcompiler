public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  if ( Arrays . binarySearch ( a , n ) % n != 0 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  int m = Arrays . binarySearch ( a , n ) / n ;
  int ans = 0 ;
  int temp = - 1 ;
  int c = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( temp == - 1 ) {
      if ( a [ i ] != m ) {
        temp = a [ i ] ;
        ans ++ ;
        c = 1 ;
      }
    }
    else {
      c ++ ;
      temp += a [ i ] ;
      if ( temp == c * m ) {
        temp = - 1 ;
      }
      else {
        ans ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
}
