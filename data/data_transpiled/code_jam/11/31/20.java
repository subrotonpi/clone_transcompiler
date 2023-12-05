static final Scanner getScanner ( ) throws FileNotFoundException {
  Scanner in ;
  if ( args . length == 2 && args [ 0 ] != null ) {
    in = new Scanner ( new File ( args [ 1 ] ) ) ;
  }
  else {
    System . out . println ( "Usage: square_tiles.py <input file>" ) ;
    System . exit ( 0 ) ;
  }
  int T = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int curCase = 0 ;
  curCase < T ;
  curCase ++ ) {
    int R = Integer . parseInt ( in . nextLine ( ) ) ;
    int C = Integer . parseInt ( in . nextLine ( ) ) ;
    String [ ] [ ] pic = new String [ R ] [ C ] ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) pic [ i ] = new String [ R ] ;
    for ( int i = 0 ;
    i < C ;
    i ++ ) pic [ i ] [ j ] = in . nextLine ( ) ;
    for ( int i = 0 ;
    i < R - 1 ;
    i ++ ) {
      for ( int j = 0 ;
      j < C - 1 ;
      j ++ ) {
        if ( pic [ i ] [ j ] . equals ( "#" ) && pic [ i + 1 ] [ j ] . equals ( "#" ) && pic [ i ] [ j + 1 ] . equals ( "#" ) && pic [ i ] [ j + 1 ] . equals ( "#" ) ) {
          pic [ i ] [ j ] = "/" ;
          pic [ i + 1 ] [ j ] = "\\" ;
          pic [ i ] [ j + 1 ] = "\\" ;
          pic [ i + 1 ] [ j + 1 ] = "/" ;
        }
      }
    }
    boolean isPossible = true ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      try {
        int t = pic [ i ] [ 0 ] . indexOf ( "#" ) ;
        isPossible = false ;
        break ;
      }
      catch ( Exception e ) {
      }
    }
    System . out . println ( "Case #" + ( curCase + 1 ) + ":" ) ;
    if ( isPossible ) {
      for ( int i = 0 ;
      i < R ;
      i ++ ) {
        System . out . println ( Arrays . toString ( pic [ i ] ) ) ;
      }
    }
    else {
      System . out . println ( "Impossible" ) ;
    }
  }
  in . close