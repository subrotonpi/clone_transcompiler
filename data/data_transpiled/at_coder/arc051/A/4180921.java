public static int x = input . nextInt ( ) {
  x = x ;
  y = y ;
  r = r ;
  int a = x + r ;
  int b = y + r ;
  int c = y + r ;
  int d = y + r ;
  if ( a <= x - r && x + r <= c && b <= y - r && y + r <= d ) return d ;
  else return d ;
}
