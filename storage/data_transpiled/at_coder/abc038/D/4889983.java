static final int [ ] getBinarySearch ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Pair < Integer , Integer >> E = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int u = Integer . parseInt ( input . nextLine ( ) ) ;
    final int v = Integer . parseInt ( input . nextLine ( ) ) ;
    E . add ( new Pair < > ( u , - v ) ) ;
  }
  Collections . sort ( E ) ;
  int h = - E . get ( 0 ) . second ;
  final int [ ] L = new int [ N ] ;
  dp = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    h = - E . get ( i ) . first ;
  }
  return L ;
}
