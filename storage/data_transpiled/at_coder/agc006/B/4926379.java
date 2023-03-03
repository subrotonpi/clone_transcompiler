public static void main ( String input , int n , int x ) {
  if ( x == 1 || x == ( 2 * n - 1 ) ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  System . out . println ( "Yes" ) ;
  int [ ] r = {
    x - 1 , x , x + 1 }
    ;
    List < Integer > tmp = new ArrayList < Integer > ( ) ;
    tmp . add ( x - 1 ) ;
    tmp . add ( x ) ;
    tmp . add ( x + 2 ) ;
    tmp . add ( 2 * n ) ;
    List < Integer > ans = tmp . subList ( n - 2 , n ) . stream ( ) . map ( r ) . collect ( Collectors . toList ( ) ) ;
    for ( int i = 0 ;
    i < ans . size ( ) ;
    i ++ ) {
      System . out . println ( ans . get ( i ) ) ;
    }
  }
  