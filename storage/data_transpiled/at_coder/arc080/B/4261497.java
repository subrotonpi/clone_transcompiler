public static void print ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) L [ i ] = Integer . parseInt ( input ) ;
  List < List < Integer >> M = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) M . add ( new ArrayList < > ( ) ) ;
  int c = 0 ;
  int x = 0 ;
  int y = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    while ( c < L [ i ] ) {
      if ( x != W ) {
        M . get ( y ) . add ( i + 1 ) ;
        c ++ ;
        x ++ ;
      }
      else {
        y ++ ;
        x = 1 ;
        M . get ( y ) . add ( i + 1 ) ;
        c ++ ;
      }
    }
    c = 0 ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    if ( i % 2 != 0 ) M . get ( i ) . reverse ( ) ;
  }
  for ( int j = 0 ;
  j < H ;
  j ++ ) System . out . println ( M . get ( j ) . toString ( ) ) ;
}
