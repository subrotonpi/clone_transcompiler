public static int input ( ) {
  String n = input . nextLine ( ) . trim ( ) ;
  int ans = 0 ;
  if ( n . length ( ) == 1 ) {
    System . out . println ( 1 ) ;
  }
  else {
    for ( int i = 0 ;
    i < n . length ( ) ;
    i ++ ) {
      final String _n = n . substring ( i , i + 1 ) ;
      if ( i == 0 ) {
        if ( _n != "1" ) {
          ans += Math . pow ( 10 , n . length ( ) - 1 ) ;
        }
        else {
          ans += Integer . parseInt ( n . substring ( i + 1 ) ) + 1 ;
        }
      }
      else if ( _n . equals ( "1" ) ) {
        ans += Integer . parseInt ( n . substring ( 0 , i ) ) * Math . pow ( 10 , n . length ( ) - i - 1 ) + Integer . parseInt ( n . substring ( i + 1 ) ) + 1 ;
      }
      else {
        if ( _n . equals ( "0" ) ) {
          ans += Math . pow ( 10 , n . length ( ) - i - 1 ) * ( Integer . parseInt ( n . substring ( 0 , i ) ) ) ;
        }
        else {
          ans += Math . pow ( 10 , n . length ( ) - i - 1 ) * ( Integer . parseInt ( n . substring ( 0 , i ) ) + 1 ) ;
        }
      }
    }
    ans += n . charAt ( n . length ( ) - 1 ) != '0' ? Integer . parseInt ( n . substring ( n . length ( ) - 1 ) ) / 10 + 1 : Integer . parseInt ( n ) / 10 ;
    System . out . println ( ans ) ;
  }
  return ans ;
}
