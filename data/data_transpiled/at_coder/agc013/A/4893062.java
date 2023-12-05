public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int leftest = 0 ;
  int cnt = 1 ;
  for ( int right = 1 ;
  right < n ;
  right ++ ) {
    if ( a [ leftest ] > a [ right - 1 ] ) {
      if ( a [ right - 1 ] < a [ right ] ) {
        cnt ++ ;
        leftest = right ;
      }
    }
    else {
    }
  }
  System . out . println ( cnt ) ;
}
