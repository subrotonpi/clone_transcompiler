public static int sx ( int sx , int sy , int tx , int ty ) {
  int x = tx - sx ;
  int y = ty - sy ;
  StringBuffer S = new StringBuffer ( ) ;
  S . append ( 'R' ) ;
  S . append ( x ) ;
  S . append ( 'U' ) ;
  S . append ( y ) ;
  return S . length ( ) ;
}
