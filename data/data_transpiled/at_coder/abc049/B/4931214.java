@ Sys public static void main ( String [ ] args ) {
  int height = Integer . parseInt ( args [ 0 ] ) ;
  int width = Integer . parseInt ( args [ 1 ] ) ;
  int [ ] [ ] g = new int [ height ] [ width ] ;
  for ( int h = 0 ;
  h < height ;
  h ++ ) {
    int l = Integer . parseInt ( args [ 2 ] ) ;
    g [ h ] [ 0 ] = l ;
    g [ h ] [ 1 ] = l ;
  }
  for ( int h = 0 ;
  h < height * 2 ;
  h ++ ) {
    System . out . println ( StringUtils . join ( g , "" ) ) ;
  }
}
