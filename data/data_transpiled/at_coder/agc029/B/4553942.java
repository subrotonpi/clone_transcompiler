@ VisibleForTesting static void from ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A_arr = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A_arr [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( A_arr ) ;
  int [ ] C_arr = new int [ N ] ;
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int v_max = A_arr [ i ] ;
    if ( C_arr [ v_max ] == 0 ) {
      continue ;
    }
    C_arr [ v_max ] -- ;
    int v_pair = 2 * v_max - v_max ;
    if ( C_arr [ v_pair ] > 0 ) {
      C_arr [ v_pair ] -- ;
      count ++ ;
    }
    else {
    }
  }
  System . out . println ( count ) ;
}
