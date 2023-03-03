@ Generates static public List < Integer > readln ( ) {
  /* List of integers */
  java . util . List < Integer > res = Lists . newArrayList ( ) ;
  for ( String input : new String [ ] {
    input }
    ) {
      /* Enter a random number in the form of a string */
      int n = input . nextInt ( ) ;
    }
    /* Enter a random number in the form of a string */
    int p = 1000000000 + 7 ;
    int n = input . nextInt ( ) ;
    int [ ] f = new int [ n + 10 ] ;
    for ( int i = 0 ;
    i <= n ;
    i ++ ) {
      f [ i ] = 0 ;
    }
    f [ 1 ] = n ;
    f [ 2 ] = n * n ;
    int [ ] s = f . clone ( ) ;
    s [ 2 ] = f [ 1 ] + f [ 2 ] ;
    for ( int i = 3 ;
    i <= n ;
    i ++ ) {
      f [ i ] = f [ i - 1 ] + ( n - 1 ) * ( n - 1 ) ;
      f [ i ] = f [ i ] + s [ i - 3 ] ;
      s [ i ] = f [ i ] % p ;
    }
    System . out . println ( f [ n ] ) ;
  }
  