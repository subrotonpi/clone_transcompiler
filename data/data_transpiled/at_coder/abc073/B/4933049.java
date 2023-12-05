public static int N = Integer . parseInt ( input ) {
  int [ ] seats = new int [ 100001 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = l ;
    j <= r ;
    j ++ ) {
      seats [ j ] = 1 ;
    }
  }
  return seats . length ;
}
