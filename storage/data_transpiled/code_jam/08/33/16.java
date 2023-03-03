static private long [ ] makeSpeeds ( int n , int m , long [ ] A , long X , long Y , long Z ) throws IOException {
  final long [ ] speeds = new long [ n ] ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    speeds [ i ] = A [ i % m ] ;
    A [ i % m ] = ( X * A [ i % m ] + Y * ( i + 1 ) ) % Z ;
  }
  return speeds ;
  /* do a task */
  final int len_task = task_bite . length ;
  long [ ] possible_routes = new long [ len_task ] ;
  for ( int k = 0 ;
  k < len_task ;
  ++ k ) {
    possible_routes [ k ] = 1 ;
  }
  for ( int j = len_task - 1 ;
  j >= 0 ;
  -- j ) {
    final long this_sign = task_bite [ j ] ;
    for ( int k = j + 1 ;
    k < len_task ;
    ++ k ) {
      if ( this_sign < task_bite [ k ] ) {
        possible_routes [ j ] = possible_routes [ j ] + possible_routes [ k ] ;
      }
    }
  }
  /* print out */
  final String [ ] inputLines = FileUtil . readLines ( new InputStreamReader ( System . in ) ) ;
  final PrintWriter outWriter = new PrintWriter ( System . out ) ;
  final int ncases = Integer . parseInt ( inputLines [ 0 ] ) ;
  int linePos = 1 ;
  for ( int testCase = 0 ;
  testCase < ncases ;
  ++ testCase ) {
    System . out . println ( inputLines [ linePos ++ ] ) ;
    Arrays . fill ( inputLines [ linePos ++ ] , ( byte ) ' ' ) ;
    linePos = linePos + 1 ;
    final long [ ] A = Arrays . copyOf ( inputLines , linePos ) ;
    linePos = linePos + m ;
    final String outString = "Case #" + ( testCase + 1 ) + String . valueOf ( doTask ( makeSpeeds ( n , m , A , X , Y , Z ) ) ) ;
    System . out . println ( outString ) ;
    outWriter . println ( outString + "\n" ) ;
  }
  outWriter . close ( ) ;
}
