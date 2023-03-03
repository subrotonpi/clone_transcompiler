public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    l . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > sumList = getSumList ( l ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < l . size ( ) ;
  i ++ ) {
    sumList . add ( l . get ( i ) ) ;
  }
}
