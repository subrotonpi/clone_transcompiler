public static void main ( String [ ] args ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] xy = new int [ n ] [ 2 ] ;
  int [ ] ez = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    xy [ i ] = new int [ 2 ] ;
    xy [ i ] [ 0 ] = x ;
    xy [ i ] [ 1 ] = y ;
    int eta = xYToEzeta ( x , y ) ;
    int zeta = xYToEzeta ( x , y ) ;
    ez [ i ] [ 0 ] = eta ;
    ez [ i ] [ 1 ] = zeta ;
  }
  int eta_min = Integer . min ( ez [ 0 ] ) ;
  int eta_max = Integer . max ( ez [ 0 ] ) ;
  int zeta_min = Integer . min ( ez [ 1 ] ) ;
  int zeta_max = Integer . max ( ez [ 1 ] ) ;
  int d = Math . max ( eta_max - eta_min , zeta_max - zeta_min ) ;
  for ( int eta = eta_max - d / 2 ;
  eta <= eta_min ;
  eta += d ) {
    for ( int zeta = zeta_max - d / 2 ;
    zeta <= zeta_min ;
    zeta += d ) {
      int xp = eta_zeta_to_x_y ( eta , zeta ) ;
      int yp = z_zeta_to_x_y ( xp , yp ) ;
      Set < Integer > mds = new HashSet < Integer > ( ) ;
      for ( int i = 0 ;
      i < mds . size ( ) ;
      i ++ ) {
        int x = xy [ i ] [ 0 ] ;
        int y = xy [ i ] [ 1 ] ;
        int md = manhattanDistance ( x , y , xp , yp ) ;
        mds . add ( md ) ;
      }
      if ( mds . size ( ) > 1 ) continue ;
      if ( mds . size ( ) == 1 ) {
        System . out . println ( xp + yp ) ;
        return ;
      }
    }
  }
}
