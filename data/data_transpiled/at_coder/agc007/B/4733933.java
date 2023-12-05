public static int [ ] convert ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int [ ] x = Lists . newArrayList ( ) ;
  for ( int i = 1 ;
  i <= a ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input ) ;
  }
  return x ;
}
