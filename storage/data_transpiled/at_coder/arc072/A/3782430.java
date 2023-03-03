public static final int input ( ) {
  final int [ ] A = Integer . parseInt ( input . nextLine ( ) ) ;
  int ret = Integer . MAX_VALUE ;
  int sign = 1 ;
  int s = 0 ;
  int k = 0 ;
  for ( int a : A ) {
    if ( sign * ( s + a ) > 0 ) {
      s += a ;
    }
    else {
      k += Math . abs ( s + a ) + 1 ;
      s = sign ;
    }
    sign *= - 1 ;
  }
  ret = Math . min ( ret , k ) ;
  return ret ;
}
