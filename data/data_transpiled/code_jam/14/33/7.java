@ VisibleForTesting static int [ ] readArray ( final Converter < String , Integer > convertor ) {
  int [ ] ret = new Scanner ( System . in ) . nextInt ( ) ;
  if ( convertor != null ) ret = ArrayUtil . convert ( ret , convertor ) ;
  final char BLACK = 'B' ;
  final char WHITE = 'W' ;
  final char ENCLOSED = 'E' ;
  final char NOT_ENC = 'N' ;
  final DataContainer < String > solver = new DataContainer < String > ( ) {
    @ Override public void run ( DataContainer < String > dataContainer ) {
      int n = dataContainer . getNmk ( ) ;
      int m = dataContainer . getNm ( ) ;
      int k = dataContainer . getNmk ( ) ;
      int [ ] result ;
      if ( USE_MULTI ) {
        pool = new Pool < Integer > ( NUM_THREAD ) ;
        result = pool . map ( solver , inputContainer ) ;
      }
      else {
        result = new int [ T ] ;
        for ( int i = 0 ;
        i < T ;
        i ++ ) result [ i ] = solver . run ( inputContainer ) ;
      }
    }
  }
  ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    System . out . format ( "Case #%d: %s" , i + 1 , result [ i ] ) ;
  }
  int n = dataContainer . getNmk ( ) ;
  int m = dataContainer . getNm ( ) ;
  int k = dataContainer . getNk ( ) ;
  int ans = n * m ;
  ans = k ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int bt = dataContainer . getNmk ( ) ;
    int needBlack = 0 ;
    int bt2 = bt ;
    while ( bt2 != 0 ) {
      bt2 = bt2 & ( bt2 - 1 ) ;
      needBlack ++ ;
    }
    if ( needBlack >= ans ) continue ;
    Queue < Integer > q = new LinkedList < Integer > ( ) ;
    for ( ;
    ;
    ) {
      q . add ( new Integer ( i ) ) ;
      q . add ( new Integer ( 0 ) ) ;
      q . add ( new Integer ( m - 1 ) ) ;
    }
    for ( ;
    ;
    ) {
      q . add ( new Integer ( n ) ) ;
      q . add ( new Integer ( n - 1 ) ) ;
    }
    Set < Integer > allOpen = new HashSet < Integer > ( ) ;
    while ( ! q . isEmpty ( ) ) {
      