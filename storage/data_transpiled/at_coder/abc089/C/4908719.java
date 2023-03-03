public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String [ ] S = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] = input . substring ( 0 , i ) ;
  }
  String [ ] S_march = new String [ 5 ] ;
  String [ ] MARCH = {
    "M" , "A" , "R" , "C" , "H" }
    ;
    ArrayList < ArrayList < Boolean >> cmb = new ArrayList < ArrayList < Boolean >> ( ) ;
    int ans = 0 ;
    int [ ] N_march = new int [ 5 ] ;
    for ( int i = 0 ;
    i < S . length ;
    i ++ ) {
      String Si = S [ i ] ;
      for ( int j = 0 ;
      j < 5 ;
      j ++ ) {
        if ( Si . substring ( 0 , 1 ) . equals ( MARCH [ j ] ) ) {
          N_march [ j ] ++ ;
        }
      }
    }
    for ( int i = 0 ;
    i < 2 * 5 ;
    i ++ ) {
      ArrayList < Boolean > check = new ArrayList < Boolean > ( 5 ) ;
      for ( int j = 0 ;
      j < 5 ;
      j ++ ) {
        if ( ( i >> j ) & 1 ) {
          check . add ( true ) ;
        }
      }
      if ( check . stream ( ) . noneMatch ( Boolean :: parseBoolean ) ) {
        cmb . add ( check ) ;
      }
    }
    for ( ArrayList < Boolean > i : cmb ) {
      ArrayList < Integer > tmpList = new ArrayList < Integer > ( ) ;
      for ( int j = 0 ;
      j < 5 ;
      j ++ ) {
        if ( i . get ( j ) ) {
          tmpList . add ( N_march [ j ] ) ;
        }
      }
      ans += tmpList . get ( 0 ) * tmpList . get ( 1 ) * tmpList . get ( 2 ) ;
    }
    System . out . println ( ans ) ;
  }
  