public static double l ( int x , int y , int s , int d ) {
  double t1 , t2 , t3 , t4 ;
  double d = Integer . parseInt ( input . nextLine ( ) ) ;
  t1 = ( l - Math . abs ( d - s ) ) / ( x + y ) ;
  t2 = ( l - Math . abs ( d - s ) ) / Math . max ( Math . abs ( x - y ) , 0.0000000001 ) ;
  t3 = Math . abs ( d - s ) / ( x + y ) ;
  t4 = Math . abs ( d - s ) / Math . max ( Math . abs ( x - y ) , 0.0000000001 ) ;
  if ( x < y && s <= d ) {
    System . out . println ( Math . min ( t2 , t3 ) ) ;
  }
  else if ( s <= d ) {
    System . out . println ( t3 ) ;
  }
  else if ( x < y && s > d ) {
    System . out . println ( Math . min ( t1 , t4 ) ) ;
  }
  else {
    System . out . println ( t1 ) ;
  }
  return t2 ;
}
