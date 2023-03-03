public static int n ( ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > r = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    r . add ( i ) ;
  }
  r . remove ( k ) ;
  return k ;
}
