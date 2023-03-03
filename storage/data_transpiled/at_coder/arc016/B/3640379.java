public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String [ ] [ ] game = new String [ 9 ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String line = input . nextLine ( ) ;
    for ( int coun = 0 ;
    coun < line . length ( ) ;
    coun ++ ) {
      String st = line . substring ( coun , i + 1 ) ;
      game [ coun ] [ i ] = st ;
    }
  }
  int result = 0 ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    for ( int ii = 0 ;
    ii < N ;
    ii ++ ) {
      switch ( game [ i ] [ ii ] ) {
        case "x" : result ++ ;
        break ;
        case "o" : if ( ii == N - 1 || game [ i ] [ ii + 1 ] != "o" ) {
          result ++ ;
        }
        break ;
      }
    }
  }
  System . out . println ( result ) ;
}
