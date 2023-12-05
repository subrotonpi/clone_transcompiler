private static int solve ( ) {
  String digits = scanner . nextLine ( ) ;
  int numDigits = digits . length ( ) ;
  /*if (start == numDigits) {
  assert false;
  }*/
  Map < Integer , Integer > s = new HashMap < > ( ) ;
  s . put ( Integer . parseInt ( digits . substring ( start ) ) , 1 ) ;
  for ( int i = start + 1 ;
  i < numDigits ;
  i ++ ) {
    int first = Integer . parseInt ( digits . substring ( start , i ) ) ;
    for ( Map . Entry < Integer , Integer > entry : numbers ( i ) . entrySet ( ) ) {
      int n = entry . getKey ( ) ;
      int f = entry . getValue ( ) ;
      s . put ( first + n , s . getOrDefault ( first + n , 0 ) + f ) ;
      s . put ( first - n , s . getOrDefault ( first - n , 0 ) + f ) ;
    }
  }
  return s . size ( ) ;
}
