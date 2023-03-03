static final int [ ] resize ( ) {
  int k = Integer . parseInt ( input ( ) ) ;
  int n = 50 ;
  int [ ] res = new int [ 50 ] ;
  for ( int i = 0 ;
  i < 50 ;
  i ++ ) {
    res [ i ] += n + 1 ;
    res [ i ] -- ;
  }
  System . out . println ( n ) ;
  System . out . println ( Arrays . toString ( res ) ) ;
}
