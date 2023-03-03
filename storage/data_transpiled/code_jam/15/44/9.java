@ VisibleForTesting static int lcm ( int a , int b ) {
  final int MODULUS = 1000000007 ;
  final int numTrials = Integer . parseInt ( input . nextLine ( ) ) ;
  @ SuppressWarnings ( "unused" ) int count = 0 ;
  if ( R < 0 ) {
    return 0 ;
  }
  else if ( R == 0 ) {
    return 1 ;
  }
  count = 0 ;
  if ( prev != 3 ) {
    count += recurse ( R - 2 , Cmod3 , Cmod6 , Cmod4 , 3 , period ) ;
  }
  if ( prev != 2 ) {
    int c0 = recurse ( R - 1 , Cmod3 , Cmod6 , Cmod4 , 2 , period ) ;
    int c1 = 0 ;
    int c2 = 0 ;
    int c3 = 0 ;
    if ( Cmod3 == 0 ) {
      c1 = gcd ( period , 3 ) * recurse ( R - 2 , Cmod3 , Cmod6 , Cmod4 , 2 , lcm ( period , 3 ) ) ;
    }
    if ( Cmod6 == 0 ) {
      c2 = gcd ( period , 6 ) * recurse ( R - 2 , Cmod3 , Cmod6 , Cmod4 , 2 , lcm ( period , 6 ) ) ;
    }
    if ( Cmod4 == 0 ) {
      c3 = gcd ( period , 4 ) * recurse ( R - 3 , Cmod3 , Cmod6 , Cmod4 , 2 , lcm ( period , 4 ) ) ;
    }
    count += c0 + c1 + c2 + c3 ;
  }
  return count % MODULUS ;
}
