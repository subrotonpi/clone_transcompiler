static final int binarySearch ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int n = Integer . parseInt ( input ) ;
  final int [ ] A = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( A ) ;
  final int ma = A [ A . length - 1 ] ;
  Arrays . sort ( A ) ;
  int mi = - 1 ;
  final int mid = ma / 2 ;
  final int midInd = Arrays . binarySearch ( A , mid ) ;
  final int l = n - 1 ;
  if ( midInd >= l ) {
    mi = A [ A . length - 1 ] ;
  }
  else if ( midInd <= 0 ) {
    mi = A [ 0 ] ;
  }
  return mi ;
}
