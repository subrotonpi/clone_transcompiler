static boolean solve ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  List < List < Integer >> lrds = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    lrds . add ( ImmutableList . copyOf ( transform ( input . readLine ( ) . split ( " " ) ) ) ) ;
  }
  final long [ ] xs = new long [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xs [ i ] = 0L ;
  }
  List < List < Point >> ps = new ArrayList < > ( ) ;
  for ( List < Integer > lrd : lrds ) {
    int l = lrd . get ( 0 ) ;
    int r = lrd . get ( 1 ) ;
    int d = lrd . get ( 2 ) ;
    ps . get ( l - 1 ) . add ( new Point ( r - 1 , d ) ) ;
    ps . get ( r - 1 ) . add ( new Point ( l - 1 , - d ) ) ;
  }
  final Set < Integer > notdecided = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    notdecided . add ( i ) ;
  }
  return true ;
}
