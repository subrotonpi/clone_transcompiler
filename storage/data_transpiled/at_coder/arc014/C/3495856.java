public static int cPlace ( int N , String S ) {
  int red = S . indexOf ( 'R' ) ;
  int green = S . indexOf ( 'G' ) ;
  int blue = S . indexOf ( 'B' ) ;
  int ans = ( red % 2 ) + ( green % 2 ) + ( blue % 2 ) ;
  return ans ;
}
