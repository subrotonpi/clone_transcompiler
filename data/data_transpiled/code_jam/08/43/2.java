public static void input ( ) {
  for ( int loop = 0 ;
  loop < tn ;
  loop ++ ) {
    System . out . println ( "Case #" + loop + ":" ) ;
    int n = input . nextInt ( ) ;
    Point [ ] [ ] ps = new Point [ n ] [ 3 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      String line = readString ( ) ;
      double x = Double . parseDouble ( line ) ;
      double y = Double . parseDouble ( line ) ;
      double z = Double . parseDouble ( line ) ;
      double p = Double . parseDouble ( line ) ;
      ps [ i ] = new Point ( x , y , z , p ) ;
    }
    double lp = 0.0 ;
    double rp = 3000000.0 ;
    while ( lp + 0.0000008 < rp ) {
      double mp = ( lp + rp ) / 2 ;
      double mpi = mp * ps [ 0 ] [ 3 ] ;
      double c1 = ps [ 0 ] [ 0 ] + ps [ 0 ] [ 1 ] + ps [ 0 ] [ 2 ] + mpi ;
      double c2 = ps [ 0 ] [ 0 ] + ps [ 0 ] [ 1 ] - ps [ 0 ] [ 2 ] + mpi ;
      double c3 = ps [ 0 ] [ 0 ] - ps [ 0 ] [ 1 ] + ps [ 0 ] [ 2 ] + mpi ;
      double c4 = - ps [ 0 ] [ 0 ] + ps [ 0 ] [ 1 ] + ps [ 0 ] [ 2 ] - mpi ;
      double c7 = ps [ 0 ] [ 0 ] - ps [ 0 ] [ 1 ] + ps [ 0 ] [ 2 ] - mpi ;
      double c8 = - ps [ 0 ] [ 0 ] + ps [ 0 ] [ 1 ] + ps [ 0 ] [ 2 ] - mpi ;
      double cc6 = ps [ 0 ] [ 0 ] + ps [ 0 ] [ 1 ] - ps [ 0 ] [ 2 ] - mpi ;
      double cc7 = ps [ 0 ] [ 0 ] + ps [ 0 ] [ 1 ] - ps [ 0 ] [ 2 ] + ps [ 0 ] [ 2 ] - mpi ;
      double cc8 = - ps [ 0 ] [ 0 ] + ps [ 0 ] [ 1 ] - ps [ 0 ] [ 2 ] - mpi ;
      double cc5 = ps [ 0 ] [ 0 ] + ps [ 0 ] [ 1 ] - ps [ 0 ] [ 2 ] + ps [ 0 ] [ 3 ] - mpi ;
    }
  }
}
