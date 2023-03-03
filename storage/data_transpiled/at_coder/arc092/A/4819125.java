public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  Point [ ] red = new Point [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    red [ i ] = new Point ( b , a ) ;
  }
  Arrays . sort ( red ) ;
  Point [ ] blue = new Point [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int c = Integer . parseInt ( input ) ;
    int d = Integer . parseInt ( input ) ;
    blue [ i ] = new Point ( c , d ) ;
  }
  Arrays . sort ( blue ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int c = blue [ i ] ;
    for ( int j = N - 1 ;
    j >= 0 ;
    j -- ) {
      if ( red [ i ] . y < c && red [ i ] . x < d ) {
        ans ++ ;
        red [ i ] = new Point ( 300 , 300 ) ;
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
}
