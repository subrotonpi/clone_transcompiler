public static double [ ] [ ] getDistance ( int n , int A , int B ) {
  int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  double dif = max ( l ) - min ( l ) ;
  if ( dif == 0 ) {
    System . out . println ( - 1 ) ;
  }
  else {
    double P = B / dif ;
    l = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) l [ i ] = l [ i ] * P ;
    double ave = sum ( l ) / n ;
    double Q = A - ave ;
    System . out . println ( P + " " + Q ) ;
  }
  return l ;
}
