public static String print ( int r , int g , int b ) {
  return Integer . toString ( r ) + ( g * r + b ) % 4 == 0 ? "YES" : "NO" ;
}
