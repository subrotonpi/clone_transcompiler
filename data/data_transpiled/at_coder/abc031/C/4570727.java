public static double getDoubleSum ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  double ans = - Double . POSITIVE_INFINITY ;
  double Aans = - Double . POSITIVE_INFINITY ;
  int keep = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i != j ) {
        if ( i < j ) {
          if ( Aans < Math . pow ( a , i + 1 , j + 1 ) ) {
            Aans = Math . pow ( a , i + 1 , j + 1 ) ;
            keep = j ;
          }
        }
        else {
          if ( Aans < Math . pow ( a , j + 1 , i + 1 ) ) {
            Aans = Math . pow ( a , j + 1 , i + 1 ) ;
            keep = j ;
          }
        }
      }
    }
    if ( i <= keep ) {
      ans = Math . max ( ans , Math . pow ( a , i , keep + 1 ) ) ;
    }
    else {
      ans = Math . max ( ans , Math . pow ( a , keep ) ) ;
    }
    Aans = - Double . POSITIVE_INFINITY ;
    keep = 0 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
