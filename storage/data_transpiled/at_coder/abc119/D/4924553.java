public static int calcDistance ( int frm , int x , int y ) {
  return Math . min ( Math . abs ( frm - x ) , Math . abs ( frm - y ) ) + Math . abs ( x - y ) ;
  /* Find the two adjacent numbers */
  if ( us . size ( ) == 1 ) {
    return us . get ( 0 ) ;
  }
  int idx = Arrays . binarySearch ( us , frm ) ;
  if ( idx == 0 ) {
    return us . get ( 0 ) ;
  }
  else if ( idx == us . size ( ) ) {
    return us . get ( us . size ( ) - 2 ) ;
  }
  else {
    return us . get ( idx - 1 ) ;
  }
  /* Find the two adjacent numbers */
  int [ ] ss = new int [ us . size ( ) ] ;
  int [ ] ts = new int [ us . size ( ) ] ;
  int [ ] xs = new int [ q ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    ss [ i ] = Integer . parseInt ( input ( ) ) ;
    ts [ i ] = Integer . parseInt ( input ( ) ) ;
    xs [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  for ( int i = 0 ;
  i < ss . length ;
  i ++ ) {
    xs [ i ] = Math . min ( ss [ i ] , ts [ i ] ) ;
  }
  for ( int i = 0 ;
  i < ss . length ;
  i ++ ) {
    xs [ i ] = Math . min ( ss [ i ] , ts [ i ] ) ;
  }
  for ( int i = 0 ;
  i < ss . length ;
  i ++ ) {
    xs [ i ] = Math . min ( ss [ i ] , ts [ i ] ) ;
  }
  for ( int i = 0 ;
  i < ts . length ;
  i ++ ) {
    xs [ i ] = Math . min ( ts [ i ] , ts [ i ] ) ;
  }
  for ( int i = 0 ;
  i < xs . length ;
  i ++ ) {
    System . out . println ( find ( ss [ i ] , ts [ i ] ) ) ;
  }
  return 0 ;
}
