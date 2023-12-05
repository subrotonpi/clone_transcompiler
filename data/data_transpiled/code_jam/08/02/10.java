static final String [ ] getTimes ( String t ) throws IOException {
  final int A = Integer . parseInt ( t . split ( ":" ) [ 0 ] ) ;
  final int B = Integer . parseInt ( t . split ( ":" ) [ 1 ] ) ;
  return new String [ ] {
    A * 60 + B }
    ;
    /* solve the two times */
    final List < Pair > ALL = new ArrayList < Pair > ( ) ;
    ALL . add ( new Pair ( A , B , 0 ) ) ;
    ALL . add ( new Pair ( A , B , 1 ) ) ;
    Collections . sort ( ALL , new Comparator < Pair > ( ) {
      public int compare ( Pair o1 , Pair o2 ) {
        int ans [ ] = 0 ;
        ans [ 0 ] = 0 ;
        return ans [ 1 ] = 0 ;
      }
    }
    ) ;
    final List < List < Integer >> wait = new ArrayList < List < Integer >> ( ) ;
    final Iterator < Pair > iter = ALL . iterator ( ) ;
    for ( int i = 0 ;
    i < wait . size ( ) ;
    i ++ ) {
      final Pair A = iter . next ( ) ;
      final int B = iter . next ( ) . second ;
      final int s = iter . next ( ) . second ;
      for ( int i = 0 ;
      i < s ;
      i ++ ) {
        if ( wait . get ( s ) . second . compareTo ( A ) <= 0 ) {
          wait . remove ( i ) ;
          break ;
        }
      }
      else {
        ans [ s ] ++ ;
      }
      wait . get ( 1 - s ) . add ( B ) ;
      wait . get ( 1 - s ) . sort ( Collections . reverseOrder ( ) ) ;
    }
    String inputName = ( args . length < 2 ) ? "test.in" : args [ 0 ] ;
    final BufferedReader br = new BufferedReader ( new InputStreamReader ( new FileInputStream ( inputName ) ) ) ;
    final int caseCount = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int testCase = 0 ;
    testCase < caseCount ;
    testCase ++ ) {
      final int T = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
      final int A = Integer . parseInt ( br . readLine ( ) ) ;
      final int B = Integer . parseInt ( br . readLine ( ) ) ;
      final List < Pair > TA = new ArrayList < Pair > ( ) ;
      for ( int i = 0 ;
      i < A ;
      i ++ ) {
        final Pair e = br .