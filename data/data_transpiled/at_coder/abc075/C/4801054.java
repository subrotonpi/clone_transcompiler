public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < List < Integer >> ab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    ab . add ( Collections . singletonList ( input ) ) ;
  }
  boolean flg = true ;
  int [ ] ch = new int [ N ] ;
  int [ ] [ ] gl = new int [ N ] [ N ] ;
  for ( List < Integer > x : ab ) {
    gl [ x . get ( 0 ) - 1 ] [ x . get ( 1 ) - 1 ] = 1 ;
    gl [ x . get ( 1 ) - 1 ] [ x . get ( 0 ) - 1 ] = 1 ;
  }
  int count = 0 ;
  while ( flg ) {
    flg = false ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( ( ch [ i ] == 0 ) && ( Arrays . binarySearch ( gl [ i ] , ch ) == 1 ) ) {
        ch [ i ] = 1 ;
        count ++ ;
        flg = true ;
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          if ( gl [ i ] [ j ] == 1 ) {
            gl [ j ] [ i ] = 0 ;
          }
        }
      }
    }
  }
  System . out . println ( count ) ;
}
