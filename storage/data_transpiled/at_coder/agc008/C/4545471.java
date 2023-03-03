public static List < Integer > convert ( String input ) {
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int ans = A . get ( 1 ) ;
  int I = A . get ( 0 ) ;
  int J = A . get ( 3 ) ;
  int L = A . get ( 4 ) ;
  int odCnt = I % 2 + J % 2 + L % 2 ;
  if ( odCnt == 0 || odCnt == 3 ) {
    ans += I + J + L ;
  }
  else if ( odCnt == 1 ) {
    ans += I + J + L - 1 ;
  }
  else {
    ans += I + J + L - 2 ;
  }
  return ans ;
}
