public static int [ ] getDistance ( ) {
  String s = input . nextLine ( ) ;
  int [ ] t = new int [ s . length ( ) - 2 ] ;
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( s . substring ( i , i + 3 ) ) ;
  }
  int [ ] u = new int [ t . length ] ;
  for ( int i = 0 ;
  i < u . length ;
  i ++ ) {
    u [ i ] = Math . abs ( t [ i ] - 753 ) ;
  }
  return u ;
}
