public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > As = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    As . add ( Integer . parseInt ( input ) ) ;
  }
  int [ ] iAs = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < As . length ;
  i ++ ) {
    iAs [ i ] = i ;
  }
  int ans = 0 ;
  int [ ] iLs = Lists . newArrayList ( ) ;
  int [ ] iRs = Lists . newArrayList ( ) ;
  for ( int A = 1 ;
  A <= N ;
  A ++ ) {
    int iA = iAs [ A ] ;
    int iL = iLs [ iA ] , iR = iRs [ iA ] ;
    ans += A * ( iA - iL + 1 ) * ( iR - iA + 1 ) ;
    iLs [ iR + 1 ] = iL ;
    iRs [ iL - 1 ] = iR ;
  }
  System . out . println ( ans ) ;
}
