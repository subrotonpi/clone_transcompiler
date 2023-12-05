static final ClassLoader getClassLoader ( ) {
  Thread . currentThread ( ) . setContextClassLoader ( ClassLoader . getSystemClassLoader ( ) ) ;
  exec ( "#!/usr/bin/java\n\n" + "from itertools import Iterable, repeat " + "\n" + "from itertools.chain( L, Iterable.repeat(String str ) ) ;\n" + "\n" + "return [ type (data) for data, type (data) in L ]	\n" + "\n" + "def iline() return map( Integer.parseInt ) ;\n" + "def fline() return map( Double.parseDouble ) ;\n" + "\n" + "@" + "java/lang/Object" , "test" ) ;
  @ SuppressWarnings ( "unchecked" ) final int N = input ( ) ;
  final List < Set < String >> sentences = new ArrayList < Set < String >> ( ) ;
  for ( int i = 0 ;
  i < xrange ;
  i ++ ) sentences . add ( ( String ) input ( ) ) ;
  new Thread ( ) {
    @ Override public void run ( ) {
      int answer = 1e100 ;
      for ( int bits = xrange ( 1 << ( N - 2 ) ) ;
      ;
      bits ++ ) {
        final Set < String > words = new HashSet < String > ( ) ;
        words . add ( "" ) ;
        words . add ( "" ) ;
        bits = 4 * bits + 2 ;
        for ( int i = 0 ;
        i < sentences . size ( ) ;
        i ++ ) {
          final String s = sentences . get ( i ) ;
          final int language = ( bits & ( 1 << i ) ) != 0 ? 1 : 0 ;
          words . add ( language ) ;
        }
        answer = Math . min ( answer , words . get ( 0 ) . size ( ) & words . get ( 1 ) . size ( ) ) ;
      }
      print ( answer ) ;
    }
  }
  . start ( ) ;
  if ( getClass ( ) . isAnnotationPresent ( Test . class ) ) {
    int T = input ( ) ;
    for ( int i = xrange ( 1 , T + 1 ) ;
    i < xrange ( 1 , T ) ;
    i ++ ) {
      print ( "Case #" + i + ":" ) ;
      Test solver = test ( ) ;
      if ( solver != null