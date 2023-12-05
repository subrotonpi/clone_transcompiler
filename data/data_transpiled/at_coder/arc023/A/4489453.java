@ VisibleForTesting static void from ( ) {
  int [ ] x = new int [ 3 ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Calendar cal = Calendar . getInstance ( ) ;
  cal . set ( Calendar . YEAR , x [ 0 ] ) ;
  q = 1 ;
  while ( q -- > 0 ) {
    if ( cal . get ( Calendar . YEAR ) != 2014 || cal . get ( Calendar . MONTH ) != 5 || cal . get ( Calendar . DAY_OF_MONTH ) != 17 ) {
      cal . add ( Calendar . DATE , 1 ) ;
      ans ++ ;
    }
    else {
      break ;
    }
  }
  System . out . println ( ans ) ;
}
