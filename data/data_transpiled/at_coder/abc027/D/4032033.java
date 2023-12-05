public static void input ( Scanner s ) {
  int N = s . nextInt ( ) ;
  int pl = 0 , mi = 0 ;
  int [ ] rec = new int [ N ] ;
  int m = 0 ;
  for ( int i = N - 1 ;
  i >= 0 ;
  i -- ) {
    if ( s . charAt ( i ) == 'M' ) {
      rec [ i ] = pl - mi ;
      m ++ ;
    }
    else {
      mi ++ ;
    }
  }
}
