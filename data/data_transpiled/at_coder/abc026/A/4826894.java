public static int A ( ) {
  int ans = 0 ;
  for ( int i = 1 ;
  i <= A ;
  i ++ ) {
    if ( ans < i * ( A - i ) ) {
      ans = i * ( A - i ) ;
    }
  }
  return ( ans ) ;
}
