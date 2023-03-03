public static void print ( String input , String output ) throws IOException {
  BufferedReader IN = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  PrintWriter OUT = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ) ;
  int NUM_TESTS = Integer . parseInt ( IN . readLine ( ) ) ;
  YES = "POSSIBLE" ;
  NO = "IMPOSSIBLE" ;
  for ( int test = 0 ;
  test < NUM_TESTS ;
  test ++ ) {
    int R = Integer . parseInt ( IN . readLine ( ) ) ;
    int C = Integer . parseInt ( IN . readLine ( ) ) ;
    int [ ] grid = new int [ C + 2 ] ;
    for ( int i = 0 ;
    i < grid . length ;
    i ++ ) {
      grid [ i ] = "#" + grid [ i ] . substring ( 0 , y ) ;
    }
    int yy = Integer . parseInt ( IN . readLine ( ) ) ;
    int horCover = Integer . parseInt ( IN . readLine ( ) ) ;
    int verCoveral = Integer . parseInt ( IN . readLine ( ) ) ;
    if ( verCoveral == 0 ) {
      answer = NO ;
      break ;
    }
    else if ( horCoveral == 0 ) {
      int x = Integer . parseInt ( in . readLine ( ) ) ;
      int y = Integer . parseInt ( in . readLine ( ) ) ;
      for ( int i = 0 ;
      i < grid . length ;
      i ++ ) {
        int laser = Integer . parseInt ( in . readLine ( ) ) ;
        if ( grid [ i ] . equals ( "-" ) && grid [ i ] . equals ( "#" ) ) {
          grid [ i ] = grid [ i ] . substring ( 0 , y ) ;
        }
        else if ( grid [ i ] . equals ( "-" ) && grid [ i ] . equals ( "#" ) ) {
          grid [ i ] = grid [ i ] . substring ( 0 , y ) ;
        }
      }
      freeLars = new int [ grid . length - 1 ] ;
      horCoveral = Collections . emptyMap ( ) ;
      verCoveral = Collections . emptyMap ( ) ;
      for ( int i = 0 ;
      i < grid . length - 1 ;
      i ++ ) {
        int x = Integer . parseInt ( in . readLine ( ) ) ;
        int y = Integer . parseInt ( in . readLine ( ) ) ;
        if ( grid [ i ] . equals ( "-" ) ) {
          horCover = true ;
          break ;
        }
      }
    }
    OUT . println (