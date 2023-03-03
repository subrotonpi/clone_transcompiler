public static void x ( int y , int at , int bt , int ct , int dt ) {
  int a = at - x ;
  int b = bt - y ;
  int c = ct - x ;
  int d = dt - y ;
  int m = Math . abs ( ( a * d ) - ( b * c ) ) ;
  System . out . println ( m / 2 ) ;
}
