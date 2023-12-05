public static int input ( ) {
  int [ ] count = new int [ T ] , temp = 0 ;
  char [ ] AGCT = {
    'A' , 'G' , 'C' , 'T' }
    ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      if ( ( AGCT [ i ] == True ) ) {
        temp ++ ;
      }
      else {
        count [ i ] = temp ;
        temp = 0 ;
      }
    }
    count [ T ] = temp ;
    System . out . println ( max ( count ) ) ;
    return count [ T ] ;
  }
  