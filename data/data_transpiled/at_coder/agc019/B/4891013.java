static final public Collection < Integer > getCounts ( ) {
  final Function < Integer , Integer > f = Function . factorial ;
  String s = input ( ) ;
  int n = s . length ( ) ;
  int a = n * - ~ n / 2 + 1 ;
  for ( int i : c . getCounter ( s ) . values ( ) ) {
    a -= i ;
    if ( i > 1 ) {
      a -= f . apply ( i ) / f . apply ( i - 2 ) / 2 ;
    }
  }
  System . out . println ( a ) ;
}
