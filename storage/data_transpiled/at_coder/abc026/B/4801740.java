static final double area ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > rArr = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    rArr . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  double ans = 0 ;
  for ( int i = 0 ;
  i < rArr . size ( ) ;
  i ++ ) {
    double r = rArr . get ( i ) ;
    double area = r * r * Math . PI ;
    if ( i % 2 == 0 ) {
      ans += area ;
    }
    else {
      ans -= area ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
