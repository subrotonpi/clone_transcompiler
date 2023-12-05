public static int [ ] [ ] x ( int x , int a , int b ) {
  int [ ] [ ] array = new int [ input . length ] [ ] ;
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    array [ i ] = Integer . parseInt ( input [ i ] ) ;
  }
  if ( Math . abs ( x - a ) > Math . abs ( x - b ) ) {
    System . out . println ( "B" ) ;
  }
  else {
    System . out . println ( "A" ) ;
  }
  return array ;
}
