static String solve ( ) {
  final int n = ( Integer ) input . nextInt ( ) ;
  int a = ( Integer ) input . nextInt ( ) ;
  int b = ( Integer ) input . nextInt ( ) ;
  int c = ( Integer ) input . nextInt ( ) ;
  int d = ( Integer ) input . nextInt ( ) ;
  if ( a > b ) a = b ;
  else b = a ;
  String ans = "NO" ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a + i * c - ( n - i - 1 ) * d <= b && b <= a + i * d - ( n - i - 1 ) * c ) ans = "YES" ;
  }
  return ans ;
}
