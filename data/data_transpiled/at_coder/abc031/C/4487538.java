public static void print ( int n ) {
  int [ ] A = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  double B = - Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double [ ] C = {
      - Double . MAX_VALUE , 0 , 0 }
      ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( i < j && C [ 0 ] < Math . pow ( A [ i ] , j + 1 ) ) {
          C [ 0 ] = Math . pow ( A [ i ] , j + 1 ) ;
          C [ 1 ] = i ;
          C [ 2 ] = j ;
        }
        else if ( j < i && C [ 0 ] < Math . pow ( A [ j ] , i + 1 ) ) {
          C [ 0 ] = Math . pow ( A [ j ] , i + 1 ) ;
          C [ 1 ] = j ;
          C [ 2 ] = i ;
        }
      }
      B = Math . max ( B , Math . pow ( A [ C [ 1 ] , C [ 2 ] + 1 ) , 0 ) ;
    }
    System . out . println ( B ) ;
  }
  