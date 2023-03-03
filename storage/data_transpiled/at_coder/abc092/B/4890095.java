public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int D = Integer . parseInt ( input ) ;
  int X = Integer . parseInt ( input ) ;
  int [ ] lists = new int [ N ] ;
  int [ ] dayList = new int [ D ] ;
  int chocolate = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int A = Integer . parseInt ( input ) ;
    lists [ i ] = A ;
    dayList = new int [ D ] ;
    for ( int j = 0 ;
    j < D ;
    j ++ ) {
      if ( j * lists [ i ] + 1 <= D ) {
        dayList [ j ] = lists [ i ] + 1 ;
      }
    }
    chocolate += dayList . length ;
  }
  System . out . println ( X + chocolate ) ;
}
