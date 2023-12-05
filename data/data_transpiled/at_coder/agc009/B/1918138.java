static final int [ ] getLevels ( ) {
  System . setIn ( "Enter the number of levels to display in order" ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > children = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    children . add ( i ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
    children . get ( a ) . add ( i ) ;
  }
  return children . toArray ( ) ;
}
