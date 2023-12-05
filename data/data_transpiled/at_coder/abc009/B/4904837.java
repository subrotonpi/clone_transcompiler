public static void print ( int n ) {
  int [ ] hoge = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    hoge [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  hoge = new LinkedList ( hoge ) ;
  hoge . sort ( Collections . reverseOrder ( ) ) ;
  System . out . println ( hoge [ 1 ] ) ;
}
