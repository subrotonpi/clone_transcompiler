public static void print ( int x ) {
  x = input ( ) ;
  int p = ( x / 11 ) * 2 ;
  int q = x % 11 == 0 ? 0 : 1 <= x && x % 11 <= 6 ? 1 : 2 ;
  print ( p + q ) ;
}
