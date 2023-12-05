public static int N = Integer . parseInt ( input ) {
  A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . next ( ) ) ;
  }
  return A . length - Integer . numberOfLeadingZeros ( A . length ) ;
}
