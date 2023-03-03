@ Nonnull public static Collection < Integer > readArray ( @ Nullable Convertor < Integer , Integer > convertor ) {
  Collection < Integer > ret = new ArrayList < > ( ) ;
  int T ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    T = input . nextInt ( ) ;
    A = readArray ( Integer . class ) ;
    B = readArray ( Integer . class ) ;
    HashSet < Integer > conn = new HashSet < > ( ) ;
    for ( int i = 0 ;
    i < A . size ( ) ;
    i ++ ) {
      conn . add ( i ) ;
    }
    see_A ( A , conn ) ;
    see_B ( B , conn ) ;
    Collection < Integer > ans = cal ( conn , N ) ;
    System . out . format ( "Case #%d: " , T + 1 ) ;
    for ( int val : ans ) {
      System . out . println ( val ) ;
    }
    System . out . format ( "" ) ;
    main ( ) ;
  }
  {
    int i ;
    int val ;
    int L = B . size ( ) ;
    HashMap < Integer , Integer > first = new HashMap < > ( ) ;
    HashMap < Integer , Integer > last = new HashMap < > ( ) ;
    for ( int i = 0 ;
    i < B . size ( ) ;
    i ++ ) {
      val = B . get ( i ) ;
      if ( ! first . containsKey ( val ) ) {
        first . put ( val , i ) ;
      }
      else {
        conn . get ( L - 1 - last . get ( val ) ) . add ( L - 1 - i ) ;
      }
      if ( val > 1 ) {
        int preVal = val - 1 ;
        conn . get ( L - 1 - i ) . add ( L - 1 - last . get ( preVal ) ) ;
      }
      last . put ( val , i ) ;
    }
  }
  {
    int l = A . size ( ) ;
    TreeMap < Integer , Integer > m = new TreeMap < > ( ) ;
    for ( int i = 0 ;
    i < A . size ( ) ;
    i ++ ) {
      val = A . get ( i ) ;
      m . put ( val , i ) ;
    }
    int [ ] assigned = new int [ l + 1 ] ;
    int now = 1 ;
    for ( int _l = l + 1 ;
    _l <= N ;
    _l ++ ) {
      Collection < Integer > v = m . get ( _l ) ;
      for ( int idx : v ) {
        assigned [ idx