@ VisibleForTesting static int [ ] solve ( ) {
  final int circumference = Integer . parseInt ( input . nextLine ( ) ) ;
  final int n = input . nextInt ( ) ;
  final List < Integer > lll = Lists . newArrayList ( ) ;
  for ( int l : lll ) {
    lll . add ( circumference - l ) ;
  }
  final List < Integer > rrr = Lists . newArrayList ( ) ;
  for ( int l : lll ) {
    rrr . add ( circumference - l ) ;
  }
  Collections . reverse ( rrr ) ;
  final int [ ] lll = Arrays . copyOf ( lll , lll . length ) ;
  final int [ ] rrr = Arrays . copyOf ( rrr , rrr . length ) ;
  final int [ ] acc_l = Lists . accumulate ( lll ) ;
  final int [ ] acc_r = Lists . accumulate ( rrr ) ;
  int ans = Math . max ( lll [ lll . length - 1 ] , rrr [ rrr . length - 1 ] ) ;
  for ( int takeL = 1 ;
  takeL < n ;
  takeR ++ ) {
    final int takeR = n - takeL ;
    int tmp_l = lll [ takeL ] + 2 * ( acc_l [ takeL - 1 ] + acc_r [ takeR ] ) ;
    int tmp_r = rrr [ takeR ] + 2 * ( acc_r [ takeR - 1 ] + acc_l [ takeL ] ) ;
    if ( takeL < takeR ) {
      tmp_l -= 2 * acc_r [ takeR - takeL ] ;
      tmp_r -= 2 * acc_r [ takeR - 1 - takeL ] ;
    }
    else if ( takeL > takeR ) {
      tmp_l -= 2 * acc_l [ takeL - 1 - takeR ] ;
      tmp_r -= 2 * acc_l [ takeL - takeR ] ;
    }
    ans = Math . max ( ans , tmp_l , tmp_r ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
