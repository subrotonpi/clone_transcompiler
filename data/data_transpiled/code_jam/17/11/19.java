private static String fillRow ( String r ) {
  int i = 0 ;
  while ( r . charAt ( i ) == '?' ) {
    i ++ ;
    if ( i == r . length ( ) ) {
      return "" ;
    }
  }
  char c = r . charAt ( i ) ;
  char [ ] newR = new char [ r . length ( ) ] ;
  for ( int j = 0 ;
  j < r . length ( ) ;
  j ++ ) {
    char l = r . charAt ( j ) ;
    if ( l == c || l == '?' ) {
      newR [ j ] = c ;
    }
    else {
      c = l ;
      newR [ j ] = c ;
    }
  }
  return new String ( newR ) ;
}
static void solve ( String in ) {
  String [ ] Ans = new String [ in . length ( ) ] ;
  int rowi = 0 ;
  int [ ] empty = new int [ in . length ( ) ] ;
  for ( int i = 0 ;
  i < in . length ( ) ;
  i ++ ) {
    Ans [ i ] = fillRow ( in . charAt ( i ) ) ;
    if ( ( Ans [ i ] == "" ) || ( ( empty [ i ] = empty [ i - 1 ] ) == "" ) ) {
      if ( ( ( rowi - 1 ) == 0 ) || ( rowi == 0 ) ) {
        empty [ i ] = rowi ;
      }
      else {
        Ans [ i ] = Ans [ i - 2 ] ;
      }
    }
    rowi ++ ;
  }
  for ( int index : empty ) {
    Ans [ index ] = Ans [ Math . max ( empty . length + 1 , rowi ) ] ;
  }
  for ( String row : Ans ) {
    print ( row ) ;
  }
  int T = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int q = 0 ;
  q < T ;
  q ++ ) {
    Arrays . stream ( in . split ( " " ) ) . forEach ( i ++ ) ;
    List < List < String >> list = new ArrayList < List < String >> ( ) ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      list . add ( Collections . singleton ( in . substring ( i , i + 1 ) ) ) ;
    }
    print ( "Case #" + ( q + 1 ) + ":" ) ;
    solve ( list ) ;
  }
}
