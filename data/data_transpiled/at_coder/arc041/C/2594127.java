static int bunny ( int [ ] L , int [ ] R ) {
  final int l = L . length ;
  final int gap = l == 0 ? L [ 0 ] - L [ 0 ] : R [ 0 ] - 1 ;
  final int len_L = L . length ;
  final int len_R = R . length ;
  final int gap_L = Integer . valueOf ( l ) . intValue ( ) ;
  final int gap_R = Integer . valueOf ( l ) . intValue ( ) ;
  for ( int i = 1 ;
  i < len_L ;
  i ++ ) {
    gap_L = Integer . valueOf ( L [ i ] - L [ i ] - 1 ) ;
    gap_R = Integer . valueOf ( R [ i ] - R [ i ] - 1 ) ;
  }
  return gap_L + gap * Math . max ( len_L , len_R ) + gap_R ;
}
