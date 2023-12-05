static final double [ ] S ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > R = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    R . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  double area = 0 ;
  boolean flag = true ;
  for ( int r : R ) {
    if ( flag ) {
      area += r * r * r * Math . PI ;
    }
    else {
      area -= r * r * r * Math . PI ;
    }
    flag = ! flag ;
  }
  System . out . println ( area ) ;
  return R . toArray ( ) ;
}
