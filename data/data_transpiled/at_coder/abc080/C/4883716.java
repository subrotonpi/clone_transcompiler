public static int [ ] [ ] parse ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] bits = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int bit = Integer . parseInt ( input . replace ( " " , "" ) , 2 ) ;
    bits [ i ] = bit ;
  }
  int [ ] [ ] p = new int [ n ] [ n ] ;
  for ( String item : input . split ( " " ) ) {
    p [ 0 ] = Integer . parseInt ( item ) ;
  }
  int ans = - 10 * 9 ;
  for ( int i = 1 ;
  i <= 2 * 10 ;
  i ++ ) {
    int val = 0 ;
    for ( int j = 0 ;
    j < p . length ;
    j ++ ) {
      val += p [ j ] [ Integer . parseInt ( i & bits [ j ] ) ] . indexOf ( "1" ) ;
    }
    ans = Math . max ( ans , val ) ;
  }
  System . out . println ( ans ) ;
  return bits ;
}
