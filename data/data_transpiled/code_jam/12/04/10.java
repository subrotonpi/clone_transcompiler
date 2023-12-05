static int [ ] [ ] ints ( ) {
  final int [ ] [ ] ints = new int [ ints . length ] [ ] ;
  for ( int i = 0 ;
  i < ints . length ;
  i ++ ) {
    for ( String word : ints [ i ] ) {
      ints [ i ] = Integer . parseInt ( word ) ;
    }
  }
  return ints ;
}
