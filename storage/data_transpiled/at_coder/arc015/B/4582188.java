public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] l = new int [ 6 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double a = Double . parseDouble ( input ) ;
    double b = Double . parseDouble ( input ) ;
    if ( a >= 35 ) {
      l [ 0 ] ++ ;
    }
    else if ( a >= 30 ) {
      l [ 1 ] ++ ;
    }
  }
}
