static final int N = Integer . parseInt ( input ) {
  final int [ ] AN = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    AN [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 1 ;
  double beforeDiff = 0 ;
  boolean chgFlag = true ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    final double diff = AN [ i ] - AN [ i - 1 ] ;
    if ( chgFlag || beforeDiff == 0 ) {
      beforeDiff = diff ;
      chgFlag = false ;
      continue ;
    }
    if ( ( Double . signum ( beforeDiff ) == 1 && Double . signum ( diff ) == - 1 ) || ( Double . signum ( beforeDiff ) == - 1 && Double . signum ( diff ) == 1 ) ) {
      chgFlag = true ;
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
