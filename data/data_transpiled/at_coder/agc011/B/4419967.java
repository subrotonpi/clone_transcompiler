public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  Arrays . sort ( a ) ;
  int [ ] ruiseki = new int [ n ] ;
  ruiseki [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ruiseki [ i ] = ruiseki [ ruiseki . length - 1 ] + a [ i ] ;
  }
  ruiseki = ruiseki [ 1 ] ;
  int ans = 0 ;
  for ( int i = n ;
  i > 0 ;
  i -- ) {
    int eater = ruiseki [ i ] ;
    if ( i == n - 1 || eater * 2 >= a [ i + 1 ] ) {
      ans ++ ;
    }
    else {
      break ;
    }
  }
  System . out . println ( ans ) ;
}
