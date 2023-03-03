private static final String FILE_NAME_BASE = "C-small-attempt0" ;
final int NUM_PROCESSES = 4 ;
final double MEM_LIMIT_GB = 1.5 ;
final int RECURSION_LIMIT = 1000 ;
@ SuppressWarnings ( "resource" ) final ExecutorService threadPool = Executors . newFixedThreadPool ( NUM_PROCESSES , new ThreadFactory ( ) {
  @ SuppressWarnings ( {
    "rawtypes" , "rawtypes" }
    ) @ Override public Object create ( final BufferedReader in ) throws IOException {
      final int numSentences = Integer . parseInt ( in . readLine ( ) ) ;
      final ImmutableList < String > sentences = ImmutableList . copyOf ( in . readLine ( ) . split ( " " ) ) ;
      return sentences . isEmpty ( ) ? null : sentences . get ( 0 ) ;
    }
  }
  ) ;
  final List < Set < String >> subsets = ImmutableList . copyOf ( sequence ) ;
  final int size = size ( sequence ) ;
  final List < Set < String >> list = new ArrayList < Set < String >> ( size ) ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    final Set < String > set = new HashSet < String > ( ) ;
    list . add ( sequence . get ( i ) ) ;
    final int i = i + 1 ;
    final String caseFmt = "[%" + caseFmt + "d] %s\n" ;
    list . add ( caseFmt ) ;
    list . add ( set ) ;
    list . add ( caseFmt ) ;
    list . add ( set ) ;
  }
  if ( getClass ( ) . getName ( ) . equals ( "java.util.concurrent.atomic.AtomicInteger" ) ) {
    main ( ) ;
  }
  else {
    final Set < String > words = new THashSet < String > ( ) ;
    for ( final Set < String > sentence : list ) {
      for ( final String word : sentence ) {
        if ( ! words . contains ( word ) ) {
          words . add ( word ) ;
        }
      }
    }
    final ImmutableList < Set < String >> sentences = ImmutableList . copyOf ( set ) ;
    final Set < String > enWords = sentences . get ( 0 ) ;
    final Set < String > frWords = sentences . get ( 1 ) ;
    int minBiling = words . size ( ) ;
    for ( final Set < String > enSentenceIndices : subsets ) {
      enWords . clear ( ) ;
      frWords . clear ( ) ;
      for ( final int idx : xrange ( sentences . size ( ) ) ) {
        if ( idx == 0 || enSentenceIndices