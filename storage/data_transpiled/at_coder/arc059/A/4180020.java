public static int n ( ) {
  int [ ] a = Integer . valueOf ( input . nextLine ( ) ) . split ( " " ) ;
  List < Integer > l = new ArrayList < > ( ) ;
  for ( int i = min ( a ) ;
  i <= max ( a ) ;
  i ++ ) {
    int cnt = 0 ;
    for ( int j : a ) {
      cnt += ( i - j ) * ( i - j ) ;
    }
    l . add ( cnt ) ;
  }
  System . out . println ( min ( l ) ) ;
  return l . size ( ) ;
}
