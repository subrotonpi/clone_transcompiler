public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > l = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l . add ( i ) ;
  }
  l . add ( 0 ) ;
  int ans = 0 ;
  int k = Integer . parseInt ( input ) / n ;
  if ( k % 1 != 0 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    for ( int i = 1 ;
    i < n ;
    i ++ ) {
      if ( Integer . parseInt ( l . get ( 0 ) ) == k * i && Integer . parseInt ( l . get ( i ) ) == k * ( n - i ) ) {
      }
      else {
        ans ++ ;
      }
    }
    System . out . println ( ans ) ;
  }
}
