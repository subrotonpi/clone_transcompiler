private static String problem = 'c' ;
String inputFileName = problem + ".in" ;
String outputFileName = problem + ".out" ;
String testData = "3\n3 4\n1 2 3 4\n2 3 4 6\n6 5 4 3\n3 3\n5 5\n4 4 6\n4 5 4\n5 5 2\n1 1\n2 2\n5 4\n4 4 1\n" ;
if ( className == null ) {
  final long start = System . currentTimeMillis ( ) ;
  final long N = main ( ) ;
  System . out . println ( "Done in " + ( System . currentTimeMillis ( ) - start ) + " seconds" ) ;
  System . out . println ( "Average " + ( ( System . currentTimeMillis ( ) - start ) * 1000 ) / N ) ;
}
else {
  final long start = System . currentTimeMillis ( ) ;
  final long N = main ( ) ;
  System . out . println ( "Done in " + ( System . currentTimeMillis ( ) - start ) + " milliseconds" ) ;
  System . out . println ( "Average " + ( ( System . currentTimeMillis ( ) - start ) * 1000 ) / N ) ;
}
final boolean [ ] [ ] intsc = new boolean [ nn ] [ nn ] ;
for ( int i = 0 ;
i < nn ;
++ i ) {
  intsc [ i ] = new boolean [ nn ] ;
}
for ( int i = 0 ;
i < nn - 1 ;
++ i ) {
  for ( int j = i + 1 ;
  j < nn ;
  ++ j ) {
    for ( int k = 0 ;
    k < kk - 1 ;
    ++ k ) {
      if ( 0 >= ( stk [ i ] [ k ] - stk [ j ] [ k ] ) * ( stk [ i ] [ k + 1 ] - stk [ j ] [ k + 1 ] ) ) {
        intsc [ i ] [ j ] = true ;
        intsc [ j ] [ i ] = true ;
        break ;
      }
    }
  }
}
for ( int i : intsc ) {
  System . out . println ( i ) ;
}
int result = 1 ;
final String [ ] ss = new String [ nn ] ;
for ( int i = 0 ;
i < nn ;
++ i ) {
  final boolean [ ] ns = new boolean [ ss . length ] ;
  for ( final