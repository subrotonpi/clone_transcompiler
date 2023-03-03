public static void print ( int n , int m ) {
  int [ ] imosu = new int [ m + 1 ] ;
  int sumVal = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    imosu [ l - 1 ] += s ;
    sumVal += s ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( i > 0 ) {
      imosu [ i ] += imosu [ i - 1 ] ;
    }
  }
}
