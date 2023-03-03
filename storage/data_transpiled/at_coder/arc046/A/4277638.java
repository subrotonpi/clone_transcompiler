public static int N = Integer . parseInt ( input ) {
  int [ ] list = {
    1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 }
    ;
    for ( int i = 10 ;
    i < 100 ;
    i ++ ) {
      String temp = Integer . toString ( i ) ;
      if ( temp . charAt ( 0 ) == temp . charAt ( 1 ) ) {
        list [ N - 1 ] = i ;
      }
    }
    for ( int i = 101 ;
    i < 1000 ;
    i ++ ) {
      String temp = Integer . toString ( i ) ;
      if ( temp . charAt ( 0 ) == temp . charAt ( 1 ) && temp . charAt ( 1 ) == temp . charAt ( 2 ) ) {
        list [ N - 1 ] = i ;
      }
    }
    for ( int i = 1001 ;
    i < 10000 ;
    i ++ ) {
      String temp = Integer . toString ( i ) ;
      if ( temp . charAt ( 0 ) == temp . charAt ( 1 ) && temp . charAt ( 1 ) == temp . charAt ( 2 ) && temp . charAt ( 2 ) == temp . charAt ( 3 ) && temp . charAt ( 3 ) == temp . charAt ( 4 ) && temp . charAt ( 4 ) == temp . charAt ( 5 ) ) {
        list [ N - 1 ] = i ;
      }
    }
    System . out . println ( list [ N - 1 ] ) ;
    return N ;
  }
  