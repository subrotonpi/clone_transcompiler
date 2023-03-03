public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String [ ] W = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    W [ i ] = input . split ( " " ) ;
  }
  boolean flag = true ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( W [ i ] . charAt ( W [ i ] . length ( ) - 1 ) != W [ i + 1 ] . charAt ( 0 ) ) {
      flag = false ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( i != j ) {
        if ( W [ i ] . equals ( W [ j ] ) ) {
          flag = false ;
        }
      }
    }
  }
  if ( flag ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
