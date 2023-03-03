public static int [ ] getPrime ( ) {
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ q ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int MAX = 10 * 5 ;
  int [ ] isPrime = new int [ MAX ] ;
  for ( int i = 2 ;
  i < MAX ;
  i ++ ) {
    if ( ! isPrime [ i ] ) continue ;
    for ( int j = i * 2 ;
    j < MAX ;
    j += i ) isPrime [ j ] = 0 ;
  }
  int [ ] s = new int [ MAX ] ;
  for ( int i = 3 ;
  i < MAX ;
  i ++ ) s [ i ] = isPrime [ i ] && isPrime [ ( i + 1 ) / 2 ] ? s [ i - 1 ] + 1 : s [ i - 1 ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int l = a [ i ] ;
    int r = a [ i ] ;
    System . out . println ( s [ r ] - s [ l - 1 ] ) ;
  }
  return s ;
}
