static final double [ ] range ( int i ) {
  A = list ( map ( input -> Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  M = new double [ A [ 0 ] ] ;
  for ( int j = 0 ;
  j < M . length ;
  j ++ ) M [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
  return M ;
}
