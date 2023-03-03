static final int [ ] S ( ) {
  final int N = Integer . parseInt ( input ( ) ) ;
  final String S = input ( ) ;
  final int [ ] cnt = new int [ 4 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cnt [ Integer . parseInt ( S ) - 1 ] ++ ;
  }
  System . out . println ( max ( cnt ) + "," + min ( cnt ) ) ;
  return cnt ;
}
