public static int solve ( int N , int L , int H , int [ ] inputs ) {
  for ( int i : xrange ( L , H + 1 ) ) {
    boolean can = true ;
    for ( int j : inputs ) {
      if ( i % j != 0 && j % i != 0 ) {
        can = false ;
      }
    }
    if ( can ) {
      return i ;
    }
  }
  return Integer . NO ;
}
