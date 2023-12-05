public static void print ( String s ) {
  String S = input . next ( ) ;
  String D = "abcdefghijklmnopqrstuvwxyz" ;
  if ( S . length ( ) == 26 ) {
    int cnt = 0 ;
    List < String > L = new ArrayList < String > ( ) ;
    for ( int i = 25 ;
    i >= 0 ;
    i -- ) {
      boolean Flag = true ;
      for ( int j = cnt ;
      j < 26 ;
      j ++ ) {
        if ( S . charAt ( i ) == D . charAt ( j ) ) {
          L . add ( S . charAt ( i ) ) ;
          cnt = j ;
          Flag = false ;
          break ;
        }
      }
      if ( Flag ) {
        Collections . sort ( L ) ;
        for ( int k = 0 ;
        k < L . size ( ) ;
        k ++ ) {
          if ( L . get ( k ) . compareTo ( S . charAt ( i ) ) > 0 ) {
            S . setChar ( L . get ( k ) ) ;
            break ;
          }
        }
        System . out . println ( Arrays . toString ( S . substring ( 0 , i + 1 ) ) ) ;
        exit ( ) ;
      }
    }
    System . out . println ( "-1" ) ;
  }
  else {
    for ( int i = 0 ;
    i < S . length ( ) ;
    i ++ ) {
      D . remove ( S . charAt ( i ) ) ;
    }
    System . out . println ( Arrays . toString ( S ) + D . substring ( 0 , D . length ( ) ) ) ;
  }
}
