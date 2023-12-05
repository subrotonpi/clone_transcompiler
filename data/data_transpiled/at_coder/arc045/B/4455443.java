@ VisibleForTesting static Iterable < Integer > solve ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < List < Integer >> R = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    R . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  return new Iterable < Integer > ( ) {
    @ Override public Iterator < Integer > iterator ( ) {
      return new Iterator < Integer > ( ) {
        @ Override public boolean hasNext ( ) {
          return true ;
        }
        @ Override public Integer next ( ) {
          return R . get ( i ) ;
        }
      }
      ;
    }
  }
  ;
}
