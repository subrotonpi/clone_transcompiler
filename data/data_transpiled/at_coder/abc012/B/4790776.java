public static int n ( ) {
  int h = 0 ;
  int m = 0 ;
  int s = 0 ;
  while ( n >= 3600 ) {
    n -= 3600 ;
    h ++ ;
  }
  while ( n >= 60 ) {
    n -= 60 ;
    m ++ ;
  }
  s += ( int ) n ;
  return s ;
}
