public static void main ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] hoge = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    hoge [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  huga = new LinkedList < Integer > ( ) ;
  huga . addAll ( hoge ) ;
  System . out . println ( n - huga . size ( ) ) ;
}
