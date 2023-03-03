public static void txa ( int txa , int tya , int txb , int tyb , float T , float V ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> XY = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) XY . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  for ( int x = 0 ;
  x < XY . size ( ) ;
  x ++ ) {
    int y = XY . get ( x ) ;
    float x1 = txa - x ;
    float y1 = tya - y ;
    float x2 = txb - x ;
    float y2 = tyb - y ;
    if ( 4 * ( x1 * x1 + y1 * y1 ) * ( x2 * x2 + y2 * y2 ) <= ( ( T * V ) * ( x1 * y1 + y1 * y2 ) - ( x2 * y2 + y2 * y2 ) ) * ( T * V ) ) {
      System . out . println ( "YES" ) ;
      exit ( ) ;
    }
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
