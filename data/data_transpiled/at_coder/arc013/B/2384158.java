public static int N = Integer . parseInt ( input ) {
  int n = 0 ;
  int m = 0 ;
  int l = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] a = new int [ ] {
      Integer . parseInt ( input . nextLine ( ) ) }
      ;
      Arrays . sort ( a ) ;
      n = Math . max ( n , a [ 0 ] ) ;
      m = Math . max ( m , a [ 1 ] ) ;
      l = Math . max ( l , a [ 2 ] ) ;
    }
    System . out . println ( n * m * l ) ;
    return n ;
  }
  