public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int nim = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    int z = Integer . parseInt ( input ) ;
    int xmin = x , ymin = y , zmin = z ;
    int xmax = 0 ;
    int ymax = 0 ;
    int zmax = 0 ;
    int m = Integer . parseInt ( input ) ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      int xj = Integer . parseInt ( input ) ;
      int yj = Integer . parseInt ( input ) ;
      int zj = Integer . parseInt ( input ) ;
      xmin = Math . min ( xj , xmin ) ;
      ymin = Math . min ( yj , ymin ) ;
      zmin = Math . min ( zj , zmin ) ;
      xmax = Math . max ( xj , xmax ) ;
      ymax = Math . max ( yj , ymax ) ;
      zmax = Math . max ( zj , zmax ) ;
    }
    nim ^= xmin ;
    nim ^= ymin ;
    nim ^= zmin ;
    nim ^= ( x - xmax - 1 ) ;
    nim ^= ( y - ymax - 1 ) ;
    nim ^= ( z - zmax - 1 ) ;
  }
  System . out . println ( nim == 0 ? "LOSE" : "WIN" ) ;
}
