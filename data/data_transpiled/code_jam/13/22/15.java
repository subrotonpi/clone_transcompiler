@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static int solve ( String inputName , String outputName ) throws IOException {
  final Scanner input = new Scanner ( System . in ) ;
  final String inputName = "B" ;
  final File input = null ;
  final String taskName = "" ;
  final String input = input . nextLine ( ) . trim ( ) ;
  final String [ ] inputNames = input . nextLine ( ) . split ( "-*.in" ) ;
  Preconditions . checkState ( inputNames . length == 1 ) ;
  for ( String inputName : inputNames ) {
    solve ( inputName , inputName . replace ( ".in" , ".out" ) ) ;
  }
  final int [ ] list = input . nextInt ( ) ;
  Preconditions . checkState ( list . length == 1 ) ;
  return list [ 0 ] ;
}
final int diamondsInLayer = 2 * ( n + 1 ) * n + n + 1 ;
final Map < Integer , Integer > currentD = new HashMap < Integer , Integer > ( ) ;
currentD . put ( new Integer ( 0 ) , 1 ) ;
for ( int i = 0 ;
i < range ( diamondsInLayer , 0 ) ;
i ++ ) {
  final Map < Integer , Integer > newD = new HashMap < Integer , Integer > ( ) ;
  final Iterator < Integer > it = currentD . entrySet ( ) . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    final Integer l = it . next ( ) ;
    final Integer r = it . next ( ) ;
    final int cnt = newD . get ( ) ;
    if ( l < length && r < length ) {
      newD . put ( new Integer ( l + 1 ) , r ) ;
      newD . put ( new Integer ( r + 1 ) , cnt ) ;
    }
    else if ( r < length ) {
      newD . put ( new Integer ( l ) , 2 * cnt ) ;
    }
    else {
      assert l <= length ;
      newD . put ( new Integer ( l + 1 ) , 2 * cnt ) ;
    }
  }
  currentD = newD ;
}
