static final String solve ( String suffix ) throws IOException {
  final String input ;
  final String taskName = "C" ;
  final InputStream input = null ;
  final OutputStream output = new FileOutputStream ( taskName + "-" + suffix + ".in" ) ;
  final int caseCount = input . read ( ) . strip ( ) ;
  for ( int i = 1 ;
  i < caseCount + 1 ;
  ++ i ) {
    final String s = "Case #" + i + ": " + s ;
    System . out . println ( s ) ;
  }
  input . close ( ) ;
  output . close ( ) ;
  System . out . format ( "%s solved in %.3f" , suffix , System . nanoTime ( ) - tstart ) ;
  if ( className . equals ( "java.util.concurrent.ConcurrentLinkedQueue" ) ) {
    solve ( "small" ) ;
    solve ( "large" ) ;
  }
  else {
    final List < Integer > lst = readIntList ( input ) ;
    assert lst . size ( ) == 1 ;
    return lst . get ( 0 ) ;
  }
  final List < Integer > lst = readIntList ( input ) ;
  assert lst . size ( ) == 1 ;
  final List < Integer > lst = lst . subList ( 1 , lst . size ( ) ) ;
  final List < Integer > walls = Streams . readList ( input ) ;
  assert walls . size ( ) == wCnt ;
  final Set < Integer > rooms = new ArrayList < > ( ) ;
  final int vCnt = lst . size ( ) ;
  final int wCnt = lst . size ( ) ;
  for ( int i = 0 ;
  i < wCnt ;
  ++ i ) {
    final int w1 = lst . get ( i ) ;
    final int w2 = lst . get ( i ) ;
    final int i1 = lst . get ( w1 ) ;
    final int i2 = lst . get ( w2 ) ;
    final int intersection = i1 & i2 ;
    assert intersection == 1 ;
    final int i = intersection > 0 ;
    final Set < Integer > room = new TreeSet < > ( ) ;
    rooms . remove ( i ) ;
    final Set < Integer > wall = new HashSet < > ( ) ;
    wall . add ( w1 ) ;
    wall . add ( w2 ) ;
    final int p1 = lst . get ( 0 ) ;
    final int p2 = lst . size ( ) ;
    final int p3 = lst . size ( ) ;
    rooms . add ( new HashSet < > ( p2 ) ) ;
    rooms . add ( new HashSet <