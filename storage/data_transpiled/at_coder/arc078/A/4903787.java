public static int N = Integer . parseInt ( input ) {
  int [ ] As = Lists . newArrayList ( ) ;
  for ( int i = 1 ;
  i < As . length ;
  i ++ ) As [ i ] += As [ i - 1 ] ;
  int res = 2 * 10 * 14 ;
  for ( int i = 0 ;
  i < As . length - 1 ;
  i ++ ) res = Math . min ( res , Math . abs ( 2 * As [ i ] - As [ As . length - 1 ] ) ) ;
  System . out . println ( res ) ;
  return res ;
}
