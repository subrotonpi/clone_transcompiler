public static double [ ] [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] [ ] gifts = new double [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String x = Integer . parseInt ( input . nextLine ( ) ) ;
    String u = Integer . parseInt ( input . nextLine ( ) ) ;
    gifts [ i ] = new double [ ] {
      Double . parseDouble ( x ) , u }
      ;
    }
    double ans = 0.0 ;
    for ( double [ ] g : gifts ) {
      double x = g [ 0 ] ;
      String u = g [ 1 ] ;
      if ( u . equals ( "JPY" ) ) ans += x ;
      if ( u . equals ( "BTC" ) ) ans += x * 380000.0 ;
    }
    System . out . println ( ans ) ;
    return gifts ;
  }
  