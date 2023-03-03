public static String solveSmall ( int r , int y , int b ) {
  if ( r > y + b || y > r + b || b > r + y ) return "IMPOSSIBLE" ;
  String rs = "R" ;
  String ys = "Y" ;
  String bs = "B" ;
  if ( y >= r && y >= b ) {
    rs = ys ;
    ys = rs ;
    r = y ;
    y = r ;
  }
  else if ( b >= r && b >= y ) {
    rs = ys ;
    ys = rs ;
    r = b ;
    y = r ;
  }
  else if ( b > y ) {
    bs = ys ;
    ys = bs ;
    b = y ;
  }
  int n = r + y + b ;
  StringBuilder ans = new StringBuilder ( ) ;
  ans . append ( rs ) ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) ans . append ( bs ) ;
  for ( int j = b ;
  j < r ;
  j ++ ) ans . append ( ys ) ;
  for ( int k = r - b ;
  k < y ;
  k ++ ) ans . append ( ys ) ;
  return ans . toString ( ) ;
}
