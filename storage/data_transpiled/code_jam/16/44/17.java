{
  grids = new int [ ] [ ] [ ] {
    {
      1 }
    }
    ;
    int cases = Integer . parseInt ( ( String ) in . nextLine ( ) ) ;
    int total = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( L [ i ] [ j ] < L [ i ] [ j ] ) {
          total ++ ;
        }
        else if ( L [ i ] [ j ] > L [ i ] [ j ] ) {
          valid = false ;
          break ;
        }
      }
      if ( valid && ( best == null || total < best ) ) {
        best = total ;
      }
    }
    System . out . println ( "Case #" + testCase + ": " + best ) ;
  }
  