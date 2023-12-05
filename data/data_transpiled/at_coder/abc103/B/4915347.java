public static void enter ( String a , String b ) {
  int n = a . length ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a = a . substring ( 1 ) + a . substring ( 0 , 1 ) ;
    if ( a . equals ( b ) ) {
      System . out . println ( "Yes" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "No" ) ;
}
