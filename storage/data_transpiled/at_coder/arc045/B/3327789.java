public static void main ( String [ ] args ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int m = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Pair < Integer , Integer >> sts = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    final int s1 = Integer . parseInt ( input . nextLine ( ) ) ;
    final int t1 = Integer . parseInt ( input . nextLine ( ) ) ;
    sts . add ( new Pair < > ( s1 , t1 ) ) ;
  }
  final Set < Integer > startAt = new HashSet < > ( ) ;
  final Set < Integer > endAt = new HashSet < > ( ) ;
  for ( int x0 = 0 ;
  x0 < m ;
  x0 ++ ) {
    startAt . add ( x0 ) ;
    endAt . add ( x0 ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    neglecTable . add ( 1 ) ;
  }
}
