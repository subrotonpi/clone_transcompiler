public static void print ( int r , int c , int d ) {
  List < Integer > li = new ArrayList < > ( ) ;
  if ( d % 2 == 0 ) {
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      if ( i % 2 == 0 ) {
        List < Integer > a = new LinkedList < > ( ) ;
        for ( int j = 0 ;
        j < r ;
        j ++ ) {
          a . add ( Integer . valueOf ( j ) ) ;
        }
        a . subList ( 0 , Math . min ( c , Math . max ( 0 , d + 1 - i ) ) , 2 ) ;
      }
      else {
        a = new LinkedList < > ( ) ;
      }
      if ( a . size ( ) > 0 ) li . addAll ( a ) ;
    }
  }
  System . out . println ( max ( li ) ) ;
}
