@ org . python . Method ( __doc__ = "Case #" + num + ": " + str ( 0 ) ) public static String doCase ( int l , int h , int [ ] ns ) {
  for ( int mine : xrange ( l , h + 1 ) ) {
    boolean good = true ;
    for ( int his : ns ) {
      if ( mine % his != 0 && his % mine != 0 ) {
        good = false ;
        break ;
      }
    }
    if ( good ) {
      return mine ;
    }
  }
  return "NO" ;
}
