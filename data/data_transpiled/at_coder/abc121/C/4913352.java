public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < List < Integer >> AB = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    List < Integer > abI = Lists . newArrayList ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      abI . add ( Integer . parseInt ( input ) ) ;
    }
    AB . add ( abI ) ;
  }
  List < List < Integer >> abSorted = new ArrayList < > ( AB ) ;
  Collections . sort ( abSorted ) ;
  int num = 0 ;
  int paied = 0 ;
  for ( List < Integer > abI : abSorted ) {
    int a = abI . get ( 0 ) ;
    int b = abI . get ( 1 ) ;
    paied += a * b ;
    num += b ;
    if ( num >= M ) {
      paied -= ( num - M ) * a ;
      break ;
    }
  }
  System . out . println ( paied ) ;
}
