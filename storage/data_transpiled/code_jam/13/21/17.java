static final public void f ( int a , int [ ] sizes ) {
  Arrays . sort ( sizes ) ;
  int len = sizes . length ;
  int res = len ;
  int nb = 0 ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    int s = sizes [ i ] ;
    while ( a <= s ) {
      a += a - 1 ;
      nb ++ ;
      if ( nb > res ) break ;
      if ( nb > res ) break ;
      res = Math . min ( res , nb + len - i - 1 ) ;
      a += s ;
    }
  }
  int samples = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i = 0 ;
  i < samples ;
  i ++ ) {
    Arrays . sort ( sizes ) ;
    Arrays . sort ( sizes ) ;
    a = Integer . parseInt ( a ) ;
    sizes = ArrayUtil . toIntArray ( sizes ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + f ( a , sizes ) ) ;
  }
}
