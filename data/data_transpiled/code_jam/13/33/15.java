static final String getOpString ( ) throws IOException {
  final BufferedReader lolReader = new BufferedReader ( new FileReader ( sys . getProperty ( "file" ) ) ) ;
  final String getline = new String ( ) {
  }
  ;
  final Function < String , String > gettoken = new Function < String , String > ( ) {
    @ Override public String apply ( final String s ) {
      return s . substring ( 0 , s . length ( ) - 1 ) ;
    }
  }
  ;
  final Function < String , Integer > getint = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( final String input ) {
      return Integer . parseInt ( input ) ;
    }
  }
  ;
  final Function < String , Integer > getints = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( final String input ) {
      final Integer vowel = new Integer ( input ) ;
      return vowel . intValue ( ) ;
    }
  }
  ;
  Arrays . sort ( getints ) ;
  int T = 0 ;
  for ( int cases : xrange ( 1 , T + 1 ) ) {
    int ans = 0 ;
    final List < Attack > attacks = new ArrayList < > ( ) ;
    final int N = getint . apply ( input ) ;
    for ( final int i : xrange ( N ) ) {
      int d = getints . apply ( input ) ;
      int n = getints . apply ( input ) ;
      int w = getints . apply ( input ) ;
      int e = getints . apply ( input ) ;
      int s = getints . apply ( input ) ;
      int dd = getints . apply ( input ) ;
      int dp = getints . apply ( input ) ;
      int ds = getints . apply ( input ) ;
      for ( int i : xrange ( n ) ) {
        attacks . add ( new Attack ( d , w , e , s , null ) ) ;
        d += dd ;
        w += dp ;
        e += dp ;
        s += ds ;
      }
    }
    Collections . sort ( attacks , new Comparator < Attack > ( ) {
      @ Override public int compare ( final Attack o1 , final Attack o2 ) {
        final int d = getints . apply ( input ) ;
        final int w = getints . apply ( input ) ;
        final int e = getints . apply ( input ) ;
        final int s = getints . apply ( input ) ;
        if ( d != pd ) {
          final Iterator < Attack > iter = upgrades . iterator ( ) ;
          for ( int p : iter . next ( ) ) {
            wall . set ( p