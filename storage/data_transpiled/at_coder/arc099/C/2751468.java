static final int [ ] [ ] getComponents ( ) {
  System . setProperty ( "apple.laf.useScreenMenuBar" , "true" ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] es = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) es [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] gr = new int [ N ] [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) gr [ j ] [ j ] = 0 ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) for ( int b = 0 ;
  b < N ;
  b ++ ) gr [ a ] [ b ] = gr [ b ] [ a ] = 1 ;
  int [ ] [ ] compgr = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) for ( int j = i + 1 ;
  j < N ;
  j ++ ) {
    if ( gr [ i ] [ j ] != 0 ) continue ;
    compgr [ i ] [ j ] = j ;
    compgr [ j ] [ i ] = i ;
  }
  int [ ] colors = new int [ N ] ;
  {
    int v = 0 ;
  }
  {
    colors [ v ] = color ;
    int b = color == 1 ? 1 : ( 0 ) ;
    int w = color == 0 ? 0 : ( 1 ) ;
    for ( int to : compgr [ v ] ) {
      if ( colors [ to ] == color ) {
        System . out . println ( - 1 ) ;
        exit ( ) ;
      }
      else if ( colors [ to ] == 0 ) {
        int db = dfs ( to , - color ) ;
        int dw = dfs ( to , - color ) ;
        b += db ;
        w += dw ;
      }
    }
  }
  Set < Integer > dp = new HashSet < Integer > ( ) ;
  dp . add ( 0 ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( colors [ i ] != 0 ) continue ;
    int b = dfs ( i , 1 ) ;
    int w = 0 ;
    Set < Integer > dp2 = new HashSet < Integer > ( ) ;
    for ( int n : dp ) {
      dp2 . add ( n + b ) ;
      dp2 . add ( n + w