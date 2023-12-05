private static int y ( ) {
  int y = input ( ) ;
  return y % 4 == 0 && y % 100 != 0 || y % 400 == 0 ? 0 : "NO" ;
}
