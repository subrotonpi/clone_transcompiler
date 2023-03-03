static final Scanner getScanner ( ) {
  final Scanner si = new Scanner ( System . in ) ;
  final PrintStream so = System . out ;
  final PrintStream se = System . err ;
  final String readLine = scanner . nextLine ( ) ;
  final String [ ] readArgs = new String [ ] {
    readLine ( ) }
    ;
    final Function < String [ ] , Integer > readInts = new Function < String [ ] , Integer > ( ) {
      @ Override public Integer [ ] apply ( String [ ] input ) {
        return Integer . parseInt ( input [ 0 ] ) ;
      }
    }
    ;
    final Function < String [ ] , Integer > readInt = new Function < String [ ] , Integer > ( ) {
      @ Override public Integer apply ( String [ ] input ) {
        return readInts . apply ( input ) [ 0 ] ;
      }
    }
    ;
    final Function < String [ ] , Integer > process = new Function < String [ ] , Integer > ( ) {
      @ Override public Integer apply ( String [ ] input ) {
        if ( input . length == 0 ) return "" ;
        String ret = input [ 0 ] ;
        for ( int i = 1 ;
        i < input . length ;
        i ++ ) {
          if ( input [ i - 1 ] . equals ( input [ i ] ) ) {
            ret += input [ i ] ;
          }
        }
        return ret ;
      }
    }
    ;
    final Function < String [ ] , Integer > analyze = new Function < String [ ] , Integer > ( ) {
      @ Override public Integer apply ( String [ ] input ) {
        if ( input . length == 0 ) return Integer . MIN_VALUE ;
        String cur = input [ 0 ] ;
        int cnt = 1 ;
        List < Integer > ret = new ArrayList < Integer > ( ) ;
        for ( int i = 1 ;
        i < input . length ;
        i ++ ) {
          if ( input [ i - 1 ] . equals ( input [ i ] ) ) {
            cnt ++ ;
          }
          else {
            ret . add ( cnt ) ;
            cnt = 1 ;
            cur = input [ i ] ;
          }
        }
        ret . add ( cnt ) ;
        return ret ;
      }
    }
    ;
    final int T = readInt . apply ( ) ;
    for ( int t = 1 ;
    t <= T ;
    t ++ ) {
      final int N = readInt . apply ( ) ;
      final String [ ] tokens = new String [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        tokens [ i ] = readLine ( ) ;
      }
      System . out . println ( "Case #" + t + ":" ) ;
      