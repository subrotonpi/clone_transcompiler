public static int [ ] convert ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input ) ;
  }
  /* base the number of digits in the string */
  long X_dumy = input ;
  String out = "" ;
  while ( X_dumy > 0 ) {
    out = Long . toString ( X_dumy % n ) + out ;
    X_dumy = ( int ) ( X_dumy / n ) ;
  }
  int ans = 1000000000 ;
  for ( int i = 0 ;
  i < 2 * n ;
  i ++ ) {
    int x = 0 ;
    int y = 0 ;
    String b = base ( i , 2 ) . replaceAll ( " " , "0" ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( b . charAt ( j ) == '0' ) x += t [ j ] ;
      else y += t [ j ] ;
    }
    ans = Math . min ( ans , Math . max ( x , y ) ) ;
  }
  System . out . println ( ans ) ;
  return t ;
}
