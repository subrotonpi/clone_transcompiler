public static int N ( int T ) {
  int [ ] ts = new int [ N ] ;
  for ( int i = 0 ;
  i < ts . length ;
  i ++ ) {
    ts [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int total = 0 ;
  for ( int i = 1 ;
  i < ts . length ;
  i ++ ) {
    if ( ts [ i ] - ts [ i - 1 ] >= T ) total += T ;
    else total += ts [ i ] - ts [ i - 1 ] ;
  }
  total += T ;
  return total ;
}
