public static int N = Integer . parseInt ( input ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] A = new String [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    String a = new String ( ) ;
    a = new String ( ) ;
    a . append ( " " ) ;
    System . arraycopy ( a . split ( " " ) , 0 , A , 0 , A . length ) ;
    A [ i ] = a ;
  }
  int [ ] B = new int [ ( N ) * 2 ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    B [ i ] = i ;
  }
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    for ( int j = 0 ;
    j < A [ 0 ] . length ( ) ;
    j ++ ) {
      if ( A [ i ] . charAt ( j ) == '-' ) {
        B [ j - 1 ] = B [ j + 1 ] ;
        B [ j ] = B [ j - 1 ] ;
      }
    }
  }
  String M = new String ( ) ;
  for ( int i = 0 ;
  i < M . length ( ) ;
  i ++ ) {
    if ( M . charAt ( i ) == 'o' ) {
      System . out . println ( ( B [ i + 1 ] + 1 ) / 2 ) ;
    }
  }
  return B [ L ] ;
}
