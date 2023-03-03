@ VisibleForTesting static void from ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  Integer [ ] xs = new Integer [ n - 1 ] ;
  for ( int i = 0 ;
  i < xs . length ;
  i ++ ) xs [ i ] = null ;
  for ( int i = 0 ;
  i < xs . length ;
  i ++ ) xs [ i ] = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
  int [ ] countWin = new int [ xs . length ] ;
  for ( int i = 0 ;
  i < q . length ;
  i ++ ) q [ i ] = i ;
  List < Integer > children = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < q . length ;
  i ++ ) children . add ( xs [ i ] ) ;
  int qi = 0 ;
  while ( ! q [ qi ] . equals ( 0 ) ) {
    i = q [ qi ] ;
    qi = qi + 1 ;
  }
  children . get ( i ) . add ( children . get ( i ) ) ;
}
