@ VisibleForTesting static void binarySearch ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] d = new int [ 4 ] [ 4 ] ;
  List < Integer > l = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  List < Integer > o = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < l . size ( ) ;
  i ++ ) {
    d [ l . get ( i ) ] [ i ] ++ ;
    o . add ( i ) ;
  }
  Collections . sort ( o ) ;
  for ( int i = 0 ;
  i < l . size ( ) ;
  i ++ ) {
    int win = bisect_left ( o , i ) ;
    int lose = n - bisect_right ( o , i ) ;
    int draw = 0 ;
    switch ( i ) {
      case 1 : win += d [ i ] [ 2 ] ;
      draw += d [ i ] [ 1 ] - 1 ;
      lose += d [ i ] [ 3 ] ;
      break ;
      case 2 : win += d [ i ] [ 3 ] ;
      draw += d [ i ] [ 2 ] - 1 ;
      lose += d [ i ] [ 1 ] ;
      break ;
      case 3 : win += d [ i ] [ 1 ] ;
      draw += d [ i ] [ 3 ] - 1 ;
      lose += d [ i ] [ 2 ] ;
      break ;
    }
    System . out . println ( win + " " + lose + " " + draw ) ;
  }
}
