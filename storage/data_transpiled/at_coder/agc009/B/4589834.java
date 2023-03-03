static final Scanner input = new Scanner ( System . in ) {
  @ Override public int next ( ) {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] A = new int [ N - 1 ] ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      A [ i ] = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
    }
    Arrays . sort ( A ) ;
    int [ ] [ ] table = new int [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      table [ A [ i ] ] = new int [ N ] ;
    }
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      table [ A [ i ] ] [ i ] = i ;
    }
    int [ ] num = new int [ N ] ;
    Arrays . fill ( num , - 1 ) ;
    /* if (num[s] != -1) return num[s]; */
    int child = table [ s ] . length ;
    if ( child == 0 ) {
      num [ s ] = 0 ;
      return 0 ;
    }
    int [ ] L = new int [ child ] ;
    int n = 0 ;
    for ( int y = 0 ;
    y < child ;
    y ++ ) {
      int x = table [ s ] [ y ] ;
      L [ n ] = x ;
    }
    Arrays . sort ( L ) ;
    for ( int l : L ) {
      n = Math . max ( n + 1 , l + 1 ) ;
    }
    num [ s ] = n ;
    return n ;
  }
}
