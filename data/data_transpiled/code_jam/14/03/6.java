@ Nullable public static List < Integer > getNums ( int n ) {
  List < Integer > nums = new ArrayList < > ( ) ;
  int tot = 0 ;
  while ( tot < n ) {
    List < Integer > next = new ArrayList < > ( ) ;
    for ( String s : ( new Scanner ( System . in ) ) . nextLine ( ) . split ( "\\s+" ) ) {
      next . add ( s ) ;
      tot += next . size ( ) ;
      nums . addAll ( next ) ;
    }
    return nums ;
  }
  {
    int [ ] board = new int [ n ] ;
    int nt = Integer . parseInt ( System . in ) ;
    for ( int testIdx = 0 ;
    testIdx < nt ;
    testIdx ++ ) {
      char cr = '' ;
      for ( int cc = 0 ;
      cc <= C ;
      cc ++ ) {
        char p = board [ rr ] ;
        if ( p == - 1 ) {
          cr += '.' ;
        }
        else if ( p == 2 || C == 2 ) {
          board = solve2 ( board , C , R * C - M ) ;
        }
        else {
          char allj [ ] = new char [ 3 ] ;
          for ( int rr = 0 ;
          rr < R ;
          rr ++ ) {
            allj [ rr ] = 'c' ;
            left -= 2 ;
          }
          for ( int row = 0 ;
          row < R ;
          row ++ ) {
            if ( left == 0 ) {
              return allj ;
            }
          }
        }
      }
    }
    if ( __name__ . equals ( "__main__" ) ) {
      main ( ) ;
    }
    else {
      int [ ] board = new int [ R ] ;
      int [ ] row = new int [ R ] ;
      left = 0 ;
      for ( int rr = 0 ;
      rr < empty ;
      rr ++ ) {
        char cr = '' ;
        for ( int cc = 0 ;
        cc <= R ;
        cc ++ ) {
          char p = board [ rr ] ;
          left -= 1 ;
        }
      }
      for ( int rr = 0 ;
      rr < R ;
      cc ++ ) {
        char c = board [ rr ] ;
        left -= 1 ;
      }
      for ( int rr = 0 ;
      rr < R ;
      rr ++ ) {
        char c = board [ rr ] ;
        left -= 1 ;
      }
      for ( int row = 0 ;
      row < R ;
      row ++ ) {
        char c = board [ rr ] ;
        left -= 1 ;
      }
    }
  }
  return null ;
}
