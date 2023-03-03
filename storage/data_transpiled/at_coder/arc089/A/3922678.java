public static int z = Integer . parseInt ( input ) {
  int x = 0 ;
  int y = 0 ;
  int t = 0 ;
  for ( int i = 0 ;
  i < z ;
  i ++ ) {
    int s = Integer . parseInt ( input . readLine ( ) ) ;
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    if ( s - t < Math . abs ( a - x ) + Math . abs ( b - y ) ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
    else if ( ( s - t ) % 2 == 1 && ( Math . abs ( a - x ) + Math . abs ( b - y ) ) % 2 == 1 ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
    else {
      x = a ;
      y = b ;
      t = s ;
    }
  }
  System . out . println ( "Yes" ) ;
  return x ;
}
