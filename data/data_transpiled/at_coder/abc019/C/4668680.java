public static int n ( ) {
  int [ ] A = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] = i ;
  }
  List < Integer > res = new ArrayList < > ( ) ;
  for ( int a : A ) {
    while ( a % 2 == 0 ) {
      a /= 2 ;
    }
    res . add ( a ) ;
  }
  return res . size ( ) ;
}
