public static void main ( String input , int n , int q ) {
  int [ ] hoge = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    hoge [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int a = Integer . parseInt ( input . substring ( 0 , i ) ) ;
    int b = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
    int c = Integer . parseInt ( input . substring ( i + 1 , i + 1 ) ) ;
    for ( int j = 0 ;
    j < b - a + 1 ;
    j ++ ) {
      hoge [ a + j - 1 ] = c ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( hoge [ i ] ) ;
  }
}
