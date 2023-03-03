public static int Q = Integer . parseInt ( input ) {
  final int [ ] [ ] le = new int [ Q ] [ ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) le [ i ] = new int [ Q ] ;
  for ( int i = 0 ;
  i < le . length ;
  i ++ ) le [ i ] = new int [ ] {
    Integer . parseInt ( input . nextLine ( ) ) }
    {
      if ( n <= 1 ) return false ;
      for ( int k = 2 ;
      k <= ( int ) Math . sqrt ( n ) ;
      k ++ ) {
        if ( n % k == 0 ) return false ;
      }
      return true ;
    }
    final int [ ] list2017 = new int [ 10 * 5 + 1 ] ;
    int sum = 0 ;
    for ( int i = 0 ;
    i <= 10 * 5 ;
    i ++ ) {
      if ( isPrime ( i ) && isPrime ( ( i + 1 ) / 2 ) && i % 2 != 0 ) sum ++ ;
      list2017 [ i ] = sum ;
    }
    for ( int i = 0 ;
    i < Q ;
    i ++ ) System . out . println ( list2017 [ le [ i ] [ 1 ] ] - list2017 [ le [ i ] [ 0 ] - 1 ] ) ;
    return 0 ;
  }
  