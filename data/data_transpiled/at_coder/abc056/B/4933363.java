@ MoreIO public static void main ( String [ ] args ) {
  final int W = ( Integer ) input . nextInt ( ) ;
  int a = 0 , b = 0 ;
  if ( ( a > b ) && ( a < W ) ) {
    int tmp = a ;
    a = b ;
    b = tmp ;
  }
  int ans ;
  if ( b - ( a + W ) <= 0 ) ans = 0 ;
  else ans = b - ( a + W ) ;
  System . out . println ( ans ) ;
}
