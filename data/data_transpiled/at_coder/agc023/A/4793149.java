static final int [ ] getCounts ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  StringBuilder sb = new StringBuilder ( a [ 0 ] ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) sb . append ( a [ i ] ) ;
  return sb . toString ( ) . toCharArray ( ) ;
}
