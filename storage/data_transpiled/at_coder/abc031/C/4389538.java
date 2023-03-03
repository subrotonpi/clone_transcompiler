static final Scanner in = new Scanner ( System . in ) {
  public int next ( ) {
    int N = Integer . parseInt ( in . nextLine ( ) ) ;
    int [ ] A = Lists . newArrayList ( Integer . parseInt ( in . nextLine ( ) ) ) ;
    int ans = - ( 10 * 5 ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int c = - ( 10 * 5 ) ;
      int tmp = 0 ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( ( i != j ) && ( i != j ) ) {
          int l = new Integer ( i ) . intValue ( ) ;
          int r = new Integer ( j ) . intValue ( ) ;
          int x = Arrays . binarySearch ( A , l + 1 , r + 1 , 2 ) ;
          if ( ( x > c ) && ( x > c ) ) {
            tmp = j ;
            c = x ;
          }
        }
      }
      int l = new Integer ( i ) . intValue ( ) ;
      int r = new Integer ( j ) . intValue ( ) ;
      ans = Math . max ( ans , Arrays . binarySearch ( A , l , r + 1 , 2 ) ) ;
    }
  }
  System . out . println ( ans ) ;
}
