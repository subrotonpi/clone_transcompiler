public static void input ( Scanner in ) {
  int [ ] N_list = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    N_list [ i ] = in . nextInt ( ) ;
  }
  if ( N_list [ 0 ] == N_list [ 1 ] == N_list [ 2 ] || N_list [ 1 ] == N_list [ 2 ] == N_list [ 3 ] ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
