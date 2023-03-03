public static int salary ( int x ) {
  N = Integer . parseInt ( input ( ) ) ;
  B = new int [ N - 1 ] ;
  for ( int i = 0 ;
  i < B . length ;
  i ++ ) {
    B [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  HashMap < Integer , Set < Integer >> staffs = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < B . length ;
  i ++ ) {
    staffs . computeIfAbsent ( B [ i ] , k -> new HashSet < > ( ) ) . add ( i + 2 ) ;
  }
  return 1 ;
}
