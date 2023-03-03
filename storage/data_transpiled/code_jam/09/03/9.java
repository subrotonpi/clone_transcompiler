@ VisibleForTesting static boolean print ( String task ) throws IOException {
  VERBOSE = true ;
  VERBOSE = false ;
  final String PHRASE = "welcome to code jam" ;
  final int MODULO = 10000 ;
  final int PHRASE_LEN = PHRASE . length ( ) ;
  {
    int task_len = task . length ( ) ;
    Map < String , Integer > [ ] count = new HashMap [ task_len + 1 ] ;
    for ( int l = 0 ;
    l <= task_len ;
    l ++ ) {
      count [ l ] = new HashMap < String , Integer > ( 1 ) ;
    }
    for ( int suffix_len = 1 ;
    suffix_len <= PHRASE_LEN ;
    suffix_len ++ ) {
      String suffix = PHRASE . substring ( PHRASE . length ( ) - suffix_len ) ;
      for ( int pos = task_len - 1 ;
      pos >= 0 ;
      pos -- ) {
        int cnt = count [ pos + 1 ] . getOrDefault ( suffix , 0 ) ;
        if ( suffix . charAt ( 0 ) == task . charAt ( pos ) ) {
          cnt += count [ pos + 1 ] . getOrDefault ( suffix . substring ( 1 ) , 0 ) ;
        }
        count [ pos ] . put ( suffix , cnt % MODULO ) ;
      }
    }
    return count [ 0 ] . get ( PHRASE ) ;
  }
  if ( className == null ) {
    final String input = System . getProperty ( "file.encoding" ) ;
    if ( ! input . equals ( "UTF-8" ) ) {
      throw new IOException ( "Give input as parameter" ) ;
    }
    final BufferedReader input = new BufferedReader ( new InputStreamReader ( new FileInputStream ( input ) ) ) ;
    final int tasksCount = Integer . parseInt ( input . readLine ( ) ) ;
    for ( int taskNo : xrange ( 0 , tasksCount ) ) {
      String task = input . readLine ( ) . trim ( ) ;
      int r = solve ( task ) ;
      System . out . format ( "Case #%d: %04d%n" , taskNo + 1 , r ) ;
    }
  }
  return VERBOSE ;
}
