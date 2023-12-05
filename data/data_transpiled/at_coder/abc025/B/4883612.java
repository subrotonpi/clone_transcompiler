public static void print ( int n , int a , int b ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String muki = Integer . toString ( input . nextInt ( ) ) ;
    String atai = Integer . toString ( input . nextInt ( ) ) ;
    int atai = Integer . parseInt ( atai ) ;
    if ( ( a > atai ) && ( a < atai ) ) atai = a ;
    else if ( ( b < atai ) && ( b < atai ) ) atai = b ;
    if ( ( muki . equals ( "East" ) ) && ( a < atai ) ) ans += atai ;
    else ans -= atai ;
  }
  if ( ( ans > 0 ) && ( ans > 0 ) ) System . out . println ( "East" + ans ) ;
  else if ( ( ans < 0 ) && ( a < - ans ) ) System . out . println ( "West" + - ans ) ;
  else System . out . println ( 0 ) ;
}
