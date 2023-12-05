@ VisibleForTesting static String from ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ss = new ArrayList < > ( n ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ss . add ( i ) ;
  }
  StringBuffer sb = new StringBuffer ( ) ;
  for ( int c : ss ) {
    sb . append ( c * Math . min ( c , ss . size ( ) ) ) ;
  }
  return sb . toString ( ) ;
}
