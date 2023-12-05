public static int getInt ( String input ) {
  int A = Integer . parseInt ( input ) ;
  int A2 = A * A ;
  int B = A + 1 ;
  int B2 = B * B ;
  String A0 = Integer . toString ( A2 ) ;
  String B0 = Integer . toString ( B2 ) ;
  int L = B0 . length ( ) ;
  assert A0 . length ( ) + 1 >= L ;
  if ( A0 . length ( ) < L ) {
    A0 = "0" + A0 ;
  }
  if ( L % 2 != 0 ) {
    A0 = "0" + A0 ;
    B0 = "0" + B0 ;
  }
  L = A0 . length ( ) ;
  int ans = Integer . MIN_VALUE ;
  for ( int i = 1 ;
  i < L ;
  i += 2 ) {
    int a = Integer . parseInt ( A0 . substring ( 0 , i + 1 ) ) ;
    int b = Integer . parseInt ( B0 . substring ( 0 , i + 1 ) ) ;
    if ( Integer . parseInt ( A0 . substring ( i + 1 ) ) > 0 ) {
      if ( a + 1 <= b ) {
        ans = a + 1 ;
        break ;
      }
    }
    else {
      if ( a + 1 < b ) {
        ans = a + 1 ;
        break ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
