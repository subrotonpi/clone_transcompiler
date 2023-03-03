public static void main ( String [ ] args ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( "C.in" ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    System . out . println ( "Case #" + t + ":" ) ;
    int R = Integer . parseInt ( br . readLine ( ) ) ;
    int C = Integer . parseInt ( br . readLine ( ) ) ;
    int M = Integer . parseInt ( br . readLine ( ) ) ;
    int free = R * C - M ;
    if ( free == 0 ) {
      System . out . println ( "Impossible" ) ;
    }
    else if ( R == 1 || C == 1 ) {
      print1 ( R , C , M ) ;
    }
    else if ( C == 2 || C == 5 || C == 7 ) {
      System . out . println ( "Impossible" ) ;
    }
    else if ( R == 2 || C == 2 ) {
      if ( ( free % 2 ) == 0 ) {
        print2 ( R , C , M ) ;
      }
      else {
        if ( ( R == 2 && C == 2 ) || ( C == 1 ) ) {
          printGeneral ( R , C , M ) ;
        }
        else {
          System . out . println ( "Impossible" ) ;
        }
      }
    }
    else {
      printGeneral ( R , C , M ) ;
    }
  }
  {
    int free = R * C - M ;
    int [ ] [ ] ans = new int [ 2 ] [ 2 ] ;
    ans [ 0 ] [ 0 ] = 'c' ;
    if ( ( C == 1 ) && ( C == 2 ) ) {
      ans = transpose ( ans ) ;
    }
    printMap ( ans ) ;
  }
  int fullLines = free / C ;
  if ( ( fullLines == 2 ) && ( C == 1 ) ) {
    ans = new int [ ] [ ] {
      '.' , 'c' , 2 * C - free }
      ;
      ans [ 0 ] [ 0 ] = 'c' ;
      printMap ( ans ) ;
      return ;
    }
    int free = R * C - M ;
    if ( ( free % 2 ) == 0 ) {
      print2 ( 2 , C , 2 * C - free ) ;
      printMap ( new int [ ] [ ] {
        '*' , 'c' , 2 * C - free }
        ) ;
      }
    }
    