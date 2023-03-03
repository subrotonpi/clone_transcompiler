@ GwtIncompatible ( "java.util.Scanner" ) public static int M = 2 * 3 * 5 * 7 ;
if ( getClass ( ) . equals ( "com.sun.tools.javac.Main" ) ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int [ ] digits = scanner . nextLine ( ) . split ( " " ) ;
  final int d = scanner . nextInt ( ) ;
  final Map < Integer , Integer > state = new HashMap < > ( ) ;
  state . put ( d , 1 ) ;
  for ( ;
  d < digits . length ;
  d ++ ) {
    final Map < Integer , Integer > res = new HashMap < > ( ) ;
    final Iterator < Integer > it = state . keySet ( ) . iterator ( ) ;
    while ( it . hasNext ( ) ) {
      final int m = it . next ( ) ;
      final int numlen = state . get ( m ) ;
      final int ways = res . get ( ( d + m ) % M , 1 ) ;
      res . put ( ( d - m ) % M , 1 ) ;
      res . put ( ( d * 10 * numlen + m ) % M , numlen + 1 ) ;
    }
    state . put ( res ) ;
  }
  return scanner . nextInt ( ) ;
}
else {
  return scanner . nextInt ( ) ;
}
}
