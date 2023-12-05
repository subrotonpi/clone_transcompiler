public static int N = Integer . parseInt ( input ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int posCount = 0 ;
  int sign = 1 ;
  int cumsum = 0 ;
  for ( int a : A ) {
    cumsum += a ;
    if ( cumsum * sign <= 0 ) {
      posCount += Math . abs ( sign - cumsum ) ;
      cumsum = sign ;
    }
    sign *= - 1 ;
  }
  return posCount ;
}
