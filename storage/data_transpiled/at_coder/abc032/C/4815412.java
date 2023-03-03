public static final int [ ] getIntegerArray ( ) {
  Scanner input = new Scanner ( System . in ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] s = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) s [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( 0 == s [ N - 1 ] ) {
    System . out . println ( N ) ;
  }
  else {
    int tmp = 1 ;
    int ans = 0 ;
    int left = 0 ;
    int right = - 1 ;
    while ( right < N - 1 ) {
      right ++ ;
      tmp *= s [ right ] ;
      if ( tmp > K ) {
        while ( left < right ) {
          left ++ ;
          tmp = tmp / s [ left ] ;
          if ( tmp <= K ) break ;
        }
      }
    }
    if ( ( right - left ) > ans ) ans = ( right - left ) ;
  }
  System . out . println ( ans ) ;
  return s ;
}
