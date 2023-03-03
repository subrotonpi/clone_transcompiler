static final int [ ] [ ] input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] t = new int [ n ] [ k ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] q = new int [ ] {
      input . readLine ( ) }
      ;
      for ( int j = 0 ;
      j < k ;
      j ++ ) {
        t [ i ] [ j ] = q [ j ] ;
      }
    }
    boolean flag = false ;
    for ( int iter = 0 ;
    iter < n ;
    iter ++ ) {
      int xor = 0 ;
      for ( int idx = 0 ;
      idx < iter ;
      idx ++ ) {
        xor ^= t [ idx ] [ iter ] ;
      }
      if ( xor == 0 ) {
        flag = true ;
        break ;
      }
    }
    System . out . println ( flag ? "Found" : "Nothing" ) ;
  }
  