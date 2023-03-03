public static void X ( int X ) {
  List < Integer > ans = new ArrayList < > ( ) ;
  for ( int b = 1 ;
  b <= 32 ;
  b ++ ) {
    for ( int p = 2 ;
    p <= 10 ;
    p ++ ) {
      if ( b * p <= X ) {
        ans . add ( b * p ) ;
      }
    }
  }
  System . out . println ( max ( ans ) ) ;
}
