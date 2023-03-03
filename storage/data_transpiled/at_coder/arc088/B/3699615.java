public static int input ( ) {
  String s = input ( ) ;
  int N = s . length ( ) ;
  int ans = N / 2 ;
  for ( int i = N / 2 + 1 ;
  i < N ;
  i ++ ) {
    if ( s . substring ( N - i , i ) . equals ( "0" ) * ( 2 * i - N ) || s . substring ( N - i , i ) . equals ( "1" ) * ( 2 * i - N ) ) {
      ans = i ;
    }
  }
  if ( s . equals ( "0" ) * N || s . equals ( "1" ) * N ) {
    ans = N ;
  }
  return ans ;
}
