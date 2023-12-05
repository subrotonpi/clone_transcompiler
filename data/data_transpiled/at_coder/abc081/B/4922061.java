public static int N = Integer . parseInt ( input ) {
  String [ ] A = input . split ( " " ) ;
  int [ ] AA = new int [ A . length ] ;
  for ( int i = 0 ;
  i < AA . length ;
  i ++ ) {
    AA [ i ] = Integer . parseInt ( A [ i ] ) ;
  }
  /*Even*/
  int counter = 0 ;
  while ( AA [ counter ] == true ) {
    AA = new int [ N ] ;
    counter ++ ;
  }
  return counter ;
}
