public static void main ( String input , int N , int Q ) {
  int [ ] COUNT = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int l = Integer . parseInt ( input ) ;
    int r = Integer . parseInt ( input ) ;
    COUNT [ l - 1 ] ++ ;
    COUNT [ r ] -- ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    COUNT [ i ] %= 2 ;
  }
  System . out . println ( Arrays . toString ( COUNT ) . substring ( 0 , N ) ) ;
}
