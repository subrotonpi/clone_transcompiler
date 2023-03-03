static final long [ ] S = new long [ Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( ) ) ) ) ) ) ) ) ) ) ) ) ] ;
for ( int testCase = 1 ;
testCase <= Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( 0 ) ) ;
) {
  final int n = Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( Integer . numberOfLeadingZeros ( 0 ) ) ) ) ;
  final int [ ] A = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  }
  final int [ ] L = new int [ n ] ;
  final long [ ] S = new long [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    L [ i ] = A [ i % m ] ;
    S [ i ] = 0 ;
    A [ i % m ] = ( X * A [ i % m ] + Y * ( i + 1 ) ) % Z ;
  }
  S [ S . length - 1 ] = 1 ;
  long sum = 1 ;
  for ( int i = L . length - 2 ;
  i >= 0 ;
  i -- ) {
    long cnt = 1 ;
    for ( int j = i + 1 ;
    j < L . length ;
    j ++ ) {
      if ( ( L [ j ] > L [ i ] ) && ( S [ j ] > S [ i ] ) ) {
        cnt += S [ j ] % 1000000007 ;
      }
    }
    S [ i ] = cnt ;
    sum = ( sum + cnt ) % 1000000007 ;
  }
  System . out . println ( "Case #" + testCase + ": " + sum ) ;
  return S ;
}
