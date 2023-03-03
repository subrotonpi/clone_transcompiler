public static int k = Integer . parseInt ( input ) {
  if ( k == 0 ) {
    System . out . println ( 2 ) ;
    System . out . println ( "1 1" ) ;
  }
  else if ( k == 1 ) {
    System . out . println ( 2 ) ;
    System . out . println ( "2 0" ) ;
  }
  else if ( k <= 50 ) {
    System . out . println ( k ) ;
    System . out . println ( Arrays . toString ( k ) ) ;
  }
  else {
    System . out . println ( 50 ) ;
    int div = k / 50 - 1 ;
    int mod = k % 50 ;
    int [ ] ans ;
    if ( mod == 0 ) {
      ans = new int [ 50 + div ] ;
      System . arraycopy ( 50 , 0 , ans , 0 , 50 ) ;
    }
    else {
      ans = new int [ 50 + div + 50 - ( mod - 1 ) ] ;
      System . arraycopy ( 50 + div , 0 , ans , 50 + div - mod , 50 - mod ) ;
      System . arraycopy ( 50 + div , 0 , ans , 50 + div - mod , 50 - mod ) ;
    }
  }
  return k ;
}
