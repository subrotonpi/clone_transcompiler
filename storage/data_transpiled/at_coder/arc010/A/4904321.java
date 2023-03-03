public static int [ ] shortArray ( int N , int M , int A , int B ) {
  int [ ] shortArray = new int [ M ] ;
  int flg = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    if ( N <= A ) N = N + B ;
    N = N - Integer . parseInt ( input ( ) ) ;
    if ( N < 0 ) {
      shortArray [ N ] = i + 1 ;
      flg = 1 ;
    }
  }
  if ( flg == 0 ) {
    System . out . println ( "complete" ) ;
  }
  else {
    System . out . println ( min ( shortArray ) ) ;
  }
  return shortArray ;
}
