static final int [ ] getSorters ( ) {
  int order = 5 ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] lr = new int [ q ] [ ] ;
  for ( int i = 0 ;
  i < lr . length ;
  i ++ ) {
    lr [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* sieve n */
  boolean [ ] isPrime = new boolean [ n + 1 ] ;
  for ( int i = 0 ;
  i < lr . length ;
  i ++ ) {
    isPrime [ i ] = true ;
  }
  isPrime [ 0 ] = false ;
  isPrime [ 1 ] = false ;
  for ( int i = 2 ;
  i <= ( int ) ( n * 0.5 ) ;
  i ++ ) {
    if ( ! isPrime [ i ] ) continue ;
    for ( int j = i * 2 ;
    j <= n ;
    j += i ) {
      isPrime [ j ] = false ;
    }
  }
  int [ ] sosu = sieve ( 10 * order ) ;
  int [ ] like2017 = new int [ 10 * order + 1 ] ;
  for ( int s = 0 ;
  s < sosu . length ;
  s ++ ) {
    if ( s % 4 == 1 || s == 3 ) {
      int index = Arrays . binarySearch ( sosu , ( s + 1 ) / 2 ) ;
      if ( sosu [ index ] == ( s + 1 ) / 2 ) {
        like2017 [ s ] = 1 ;
      }
    }
  }
  int [ ] cs = new int [ like2017 . length ] ;
  for ( int l = 0 ;
  l < lr . length ;
  l ++ ) {
    System . out . println ( cs [ r ] - cs [ l - 1 ] ) ;
  }
  return lr ;
}
