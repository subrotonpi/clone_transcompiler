public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ) ) ;
  }
  int ans = 0 ;
  do {
    if ( Arrays . binarySearch ( A , input ) < 0 ) break ;
    int temp = 0 ;
    int [ ] num = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      temp += A . get ( i ) / N ;
      num [ i ] = A . get ( i ) / N ;
      A . set ( i , temp - n ) ;
    }
    ans += temp ;
  }
  while ( true ) ;
}
