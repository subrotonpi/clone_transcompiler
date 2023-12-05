static final int [ ] getStdIn ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int syo = 0 ;
  int dai = 10 * 15 ;
  {
    int [ ] tmp = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( input . nextLine ( ) - a [ i ] [ 0 ] < 0 ) {
        return 0 ;
      }
      int ka = ( input . nextLine ( ) - a [ i ] [ 0 ] ) / a [ i ] [ 1 ] ;
      tmp [ i ] = ka ;
    }
    Arrays . sort ( tmp ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( i > tmp [ i ] ) {
        return 0 ;
      }
    }
    return 1 ;
  }
}
