static final void merge ( HashMap < String , Integer > g2 , String k , int v ) {
  if ( ! g2 . containsKey ( k ) ) {
    g2 . put ( k , v ) ;
    return ;
  }
  if ( v < g2 . get ( k ) ) {
    g2 . put ( k , v ) ;
  }
  /* foo */
  int D = Integer . parseInt ( iScanner . nextLine ( ) ) ;
  int I = Integer . parseInt ( iScanner . nextLine ( ) ) ;
  int M = Integer . parseInt ( iScanner . nextLine ( ) ) ;
  int N = Integer . parseInt ( iScanner . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( iScanner . nextLine ( ) ) ;
  }
  HashMap < String , Integer > g = new HashMap < String , Integer > ( ) ;
  g2 . clear ( ) ;
  g . put ( null , 0 ) ;
  for ( int x0 : a ) {
    for ( int k : g . keySet ( ) ) {
      int x = k ;
      int v = v0 + Math . abs ( x - x0 ) ;
      if ( k == 0 ) {
        merge ( g2 , x , v ) ;
      }
      else {
      }
    }
  }
}
