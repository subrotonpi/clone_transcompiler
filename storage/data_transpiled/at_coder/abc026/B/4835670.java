static final int [ ] range ( int N ) {
  int s = 0 ;
  int [ ] l = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( l ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = l [ i ] ;
    if ( i % 2 == 0 ) {
      s += a * a * Math . PI ;
    }
    else {
      s -= a * a * Math . PI ;
    }
  }
  System . out . println ( s ) ;
  return l ;
}
