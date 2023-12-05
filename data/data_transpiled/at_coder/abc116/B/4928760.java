public static int s = Integer . parseInt ( input ) {
  int a = s ;
  Set < Integer > already = new HashSet < Integer > ( ) ;
  already . add ( a ) ;
  for ( int i = 0 ;
  i < 10000000 ;
  i ++ ) {
    if ( a % 2 != 0 ) {
      a = 3 * a + 1 ;
      if ( new Integer ( a ) . compareTo ( already ) <= 0 ) {
        System . out . println ( i + 2 ) ;
        exit ( 0 ) ;
      }
      already . add ( a ) ;
    }
    else {
      a /= 2 ;
      if ( new Integer ( a ) . compareTo ( already ) <= 0 ) {
        System . out . println ( i + 2 ) ;
        exit ( 0 ) ;
      }
      already . add ( a ) ;
    }
  }
  return a ;
}
