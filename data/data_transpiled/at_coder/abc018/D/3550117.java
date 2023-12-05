static final int [ ] [ ] combinations ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final int P = Integer . parseInt ( input . nextLine ( ) ) ;
  final int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  final int R = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] choco = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    choco [ i ] [ 0 ] = i ;
  }
  final List < Integer > list = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    list . add ( i ) ;
  }
  long ans = 0 ;
  for ( int [ ] girls : list ) {
    final long [ ] happiness = choco . get ( list . size ( ) - 1 ) ;
    happiness = new long [ happiness . length ] ;
    for ( int i = 0 ;
    i < happiness . length ;
    i ++ ) {
      happiness [ i ] = - 1 ;
    }
  }
  ans = Math . max ( ans , sum ( happiness , 0 , Q ) ) ;
  return choco ;
}
