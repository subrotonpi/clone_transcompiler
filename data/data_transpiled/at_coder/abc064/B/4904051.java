public static int N ( ) {
  int ans = 0 ;
  List < Integer > zahyou = Lists . newArrayList ( ) ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    zahyou . add ( Integer . parseInt ( s ) ) ;
  }
  Collections . sort ( zahyou , Collections . reverseOrder ( ) ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    ans += zahyou . get ( i ) - zahyou . get ( i + 1 ) ;
  }
  return ans ;
}
