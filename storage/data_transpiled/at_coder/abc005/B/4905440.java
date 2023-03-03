public static void main ( ) {
  n = Integer . parseInt ( input ( ) ) ;
  hoge = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    hoge [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  System . out . println ( min ( hoge ) ) ;
}
