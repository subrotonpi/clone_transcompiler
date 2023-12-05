public static void print ( int n = Integer . parseInt ( input ) ) {
  StringBuilder s = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s . append ( input . charAt ( i ) ) ;
  }
  char [ ] a = {
    'M' , 'A' , 'R' , 'C' , 'H' }
    ;
    final int [ ] num = new int [ 5 ] ;
    for ( int i = 0 ;
    i < 5 ;
    i ++ ) {
      num [ i ] = s . indexOf ( a [ i ] ) ;
    }
    int ans = 0 ;
    if ( num . length <= 2 ) {
      final int [ ] m = Arrays . copyOf ( num , num . length ) ;
      final int [ ] p = new int [ 3 ] ;
      for ( int j = 0 ;
      j < p . length ;
      j ++ ) {
        ans += p [ j ] [ 0 ] * p [ j ] [ 1 ] * p [ j ] [ 2 ] ;
      }
    }
    System . out . println ( ans ) ;
  }
  