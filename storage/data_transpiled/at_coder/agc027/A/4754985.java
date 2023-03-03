public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int num = x ;
  List < Integer > aS = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    aS . add ( i ) ;
  }
  Collections . sort ( aS ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = aS . get ( i ) ;
    if ( num >= a ) {
      num -= a ;
      cnt ++ ;
    }
  }
  if ( cnt == N && num > 0 ) {
    cnt -- ;
  }
  System . out . println ( cnt ) ;
}
