public static int get ( int x ) {
  int cnt = 0 ;
  while ( x % 2 == 0 ) {
    cnt ++ ;
    x = x / 2 ;
  }
  return cnt ;
}
