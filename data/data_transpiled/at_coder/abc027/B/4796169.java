public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ! Arrays . equals ( a , n ) ) {
    System . out . println ( - 1 ) ;
  }
  else {
    int lastnum = Arrays . binarySearch ( a , n ) / n ;
    int ans = 0 ;
    for ( int i = 1 ;
    i < n ;
    i ++ ) {
      if ( ! ( Arrays . equals ( a , 0 , i ) && lastnum * i != i && lastnum * ( n - i ) != 0 ) ) {
        ans ++ ;
      }
    }
    System . out . println ( ans ) ;
  }
}
