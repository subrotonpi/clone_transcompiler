public static void main ( String [ ] args ) throws IOException {
  final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int T = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    int n = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    int [ ] myBlocks = new int [ n ] ;
    for ( int x = br . readLine ( ) . trim ( ) . toCharArray ( ) ;
    x > 0 ;
    x = br . readLine ( ) . trim ( ) ) {
      tell = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    }
    int [ ] kenBlocks = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( myBlocks [ i ] + lose < kenBlocks [ i ] ) {
        lose ++ ;
      }
    }
    return ;
  }
  if ( Class . isMainClass ( ) ) {
    main ( ) ;
  }
  else {
    int tell = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    int [ ] myBlocks = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      myBlocks [ i ] = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    }
    int [ ] kenBlocks = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( myBlocks [ i ] + lose < kenBlocks [ i ] ) {
        lose ++ ;
      }
    }
  }
  NaiomiWar naiomi = new NaiomiWar ( myBlocks ) ;
  KenWar ken = new KenWar ( kenBlocks ) ;
  int myPoints = 0 ;
  for ( int j : xrange ( n ) ) {
    final int myB = naiomi . play ( ) ;
    final int myTell = ken . play ( myTell ) ;
    if ( myB > kenBlocks [ i ] ) {
      myPoints ++ ;
    }
  }
  NaiomiWar naiomi = new NaiomiWar ( myBlocks ) ;
  KenWar ken = new KenWar ( kenBlocks ) ;
  int myPointsDeceitful = 0 ;
  for ( int j : xrange ( n ) ) {
    final int myB = naiomi . play ( ) ;
    final int myTell = ken . play ( myTell ) ;
    