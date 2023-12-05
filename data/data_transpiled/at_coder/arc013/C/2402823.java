public static void inpl ( ) {
  return map . get ( input . nextInt ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int nim = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int X = inpl ( ) ;
    int Y = inpl ( ) ;
    int Z = inpl ( ) ;
    int xmin = 10 * 9 + 1 , ymin = 10 * 9 + 1 , zmin = 10 * 9 + 1 ;
    int xmax = 0 , ymax = 0 , zmax = 0 ;
    int M = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      int x = inpl ( ) ;
      int y = inpl ( ) ;
      int z = inpl ( ) ;
      xmin = Math . min ( xmin , x ) ;
      ymin = Math . min ( ymin , y ) ;
      zmin = Math . min ( zmin , z ) ;
      xmax = Math . max ( xmax , x ) ;
      ymax = Math . max ( ymax , y ) ;
      zmax = Math . max ( zmax , z ) ;
    }
    nim = nim ^ xmin ^ ymin ^ zmin ^ ( X - xmax - 1 ) ^ ( Y - ymax - 1 ) ^ ( Z - zmax - 1 ) ;
  }
  System . out . println ( nim > 0 ? "WIN" : "LOSE" ) ;
}
