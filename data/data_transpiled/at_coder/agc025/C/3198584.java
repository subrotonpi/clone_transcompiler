@ System public static void main ( String [ ] args ) {
  String [ ] inStrings = new String [ args . length ] ;
  int inInt = 0 ;
  int inIntList = 0 ;
  for ( int i = 0 ;
  i < args . length ;
  i ++ ) {
    inStrings [ i ] = args [ i ] . substring ( 0 , args [ i ] . length ( ) - 1 ) ;
  }
  int N = inInt ;
  int [ ] L_list = new int [ N ] ;
  int [ ] R_list = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] temp = inIntList . get ( i ) ;
    L_list [ i ] = temp [ 0 ] ;
    R_list [ i ] = temp [ 1 ] ;
  }
  Arrays . sort ( L_list , Collections . reverseOrder ( ) ) ;
  Arrays . sort ( R_list ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ( L_list [ i ] - R_list [ i ] ) > 0 ) {
      ans += 2 * ( L_list [ i ] - R_list [ i ] ) ;
    }
    else {
      if ( ( L_list [ i ] <= 0 ) && ( R_list [ i ] >= 0 ) ) {
      }
      else if ( L_list [ i ] > 0 ) {
        if ( ( i > 0 ) && ( L_list [ i ] < R_list [ i - 1 ] ) ) {
          ans += 2 * R_list [ i - 1 ] ;
        }
        else {
          ans += 2 * L_list [ i ] ;
        }
      }
      else {
        if ( ( i > 0 ) && ( R_list [ i ] > L_list [ i - 1 ] ) ) {
          ans -= 2 * L_list [ i - 1 ] ;
        }
        else {
          ans -= 2 * R_list [ i ] ;
        }
      }
      break ;
    }
  }
  System . out . println ( ans ) ;
}
