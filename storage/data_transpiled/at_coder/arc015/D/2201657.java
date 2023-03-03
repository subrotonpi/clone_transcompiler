public static double getDoubleDouble ( ) {
  int T = input . nextInt ( ) ;
  int N = input . nextInt ( ) ;
  double P = Double . parseDouble ( input . nextLine ( ) ) ;
  double [ ] [ ] D = new double [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double q , x , t ;
    q = Double . parseDouble ( input . nextLine ( ) ) ;
    x = Double . parseDouble ( input . nextLine ( ) ) ;
    t = Double . parseDouble ( input . nextLine ( ) ) ;
    D [ i ] = new double [ ] {
      t , x , q }
      ;
    }
    Arrays . sort ( D ) ;
    double cur = 1 - P + P * Math . pow ( x * q , 2 ) ;
    int j = 0 ;
    double ans = 0. ;
    double res = 1. ;
    for ( int y = 0 ;
    y < T ;
    y ++ ) {
      while ( j < N && D [ j ] [ 0 ] <= y ) {
        double t , x , q ;
        cur += P * q * ( 1 - x ) ;
        j ++ ;
      }
      ans += res ;
      res *= cur ;
    }
    System . out . println ( "" + ans + "f" ) ;
    return ans ;
  }
  