public static int n ( ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] lis = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] li = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) li [ i ] = 0 ;
  for ( int i = 0 ;
  i < li . length ;
  i ++ ) li [ i ] ++ ;
  return li [ i ] ;
}
