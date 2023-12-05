public static final PrintStream out = new PrintStream ( new FileOutputStream ( "p2.out" ) ) ;
final BufferedReader fin = new BufferedReader ( new FileReader ( sys . argv [ 0 ] ) ) ;
final PrintStream fout = new PrintStream ( new FileOutputStream ( "p2.out" ) ) ;
final int T = Integer . parseInt ( fin . readLine ( ) ) ;
for ( int tt = xrange ( T ) ;
tt < T ;
tt ++ ) {
  final List < String > s = new LinkedList < String > ( ) ;
  s . add ( fin . readLine ( ) . trim ( ) ) ;
  s = CollectionUtils . toCollection ( s ) ;
  s . add ( "+" ) ;
  s . add ( "true" ) ;
  int ans = 0 ;
  for ( int i : xrange ( s . size ( ) - 1 ) ) {
    if ( s . get ( i ) != s . get ( i + 1 ) ) ans ++ ;
  }
  fout . println ( "Case #" + ( tt + 1 ) + ": " + ans ) ;
}
