static final Object SOURCE = new Object ( ) {
  private final Object SINK = new Object ( ) ;
  private int maxflow ( Map < Integer , Map < String , Integer >> edges ) {
    int r = 0 ;
    do {
      LinkedList < Integer > q = new LinkedList < > ( ) ;
      Set < Integer > seen = new HashSet < > ( q ) ;
      Map < String , Integer > prev = new HashMap < > ( ) ;
      while ( q . isEmpty ( ) && ! seen . contains ( SINK ) ) {
        int next = q . removeFirst ( ) ;
        Map < String , Integer > map = edges . computeIfAbsent ( next , k -> new HashMap < > ( ) ) ;
        for ( Map . Entry < String , Integer > e : map . entrySet ( ) ) {
          if ( e . getValue ( ) == null ) continue ;
          if ( seen . contains ( e . getKey ( ) ) ) continue ;
          seen . add ( e . getKey ( ) ) ;
          q . addLast ( e . getKey ( ) ) ;
          prev . put ( e . getKey ( ) , next ) ;
        }
      }
      if ( ! seen . contains ( SINK ) ) break ;
      r ++ ;
      int cur = SINK ;
      while ( cur != SOURCE ) {
        int next = prev . get ( cur ) ;
        edges . computeIfAbsent ( cur , k -> new HashMap < > ( ) ) ;
        edges . computeIfAbsent ( next , k -> new HashMap < > ( ) ) . put ( cur , map . getOrDefault ( k , 0 ) + 1 ) ;
        cur = next ;
      }
    }
    while ( true ) ;
    if ( className . equals ( "java.util.Scanner" ) ) {
      BufferedReader br = null ;
      if ( args . length >= 2 ) {
        String fn = args [ 1 ] ;
        if ( fn != null ) {
          br = new BufferedReader ( new InputStreamReader ( new FileInputStream ( fn ) ) ) ;
        }
      }
      int T = Integer . parseInt ( br . readLine ( ) ) ;
      for ( int _T = xrange ( T ) ;
      _T < T ;
      _T ++ ) {
        int N = Integer . parseInt ( br . readLine ( ) ) ;
        List < String > L = new ArrayList < > ( ) ;
        for ( int i = xrange ( N ) ;
        i < N ;
        ++ i ) L . add ( br . readLine ( ) . split ( " " ) ) ;
        Map < String , Integer > c1 = new HashMap < > ( ) ;
        Map < String , Integer > c2 = new HashMap < >