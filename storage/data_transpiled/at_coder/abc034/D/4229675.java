static int n = Integer . parseInt ( input ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A . add ( Collections . singletonList ( i ) ) ;
  }
  int OK = 0 , NG = 100 ;
  for ( ;
  ;
  ;
  ) {
    int x = ( OK + NG ) / 2 ;
    List < Integer > B = new ArrayList < > ( ) ;
    for ( int w = 0 ;
    w < p ;
    w ++ ) B . add ( w * ( p - x ) ) ;
    if ( Arrays . binarySearch ( B , x ) >= k ) {
      OK = x ;
    }
    else {
      NG = x ;
    }
  }
}
