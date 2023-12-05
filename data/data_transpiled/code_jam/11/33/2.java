public static void readFile ( File f ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( f ) ) ;
  String line = br . readLine ( ) ;
  String [ ] array = line . split ( " " ) ;
  for ( int i = 0 ;
  i < array . length / 2 ;
  i ++ ) {
    int a = 2 * i ;
    array [ a ] = array [ a ] . trim ( ) . split ( " " ) ;
    array [ a + 1 ] = array [ a + 1 ] . trim ( ) . split ( " " ) ;
    String n = array [ a ] . substring ( 0 , 1 ) ;
    int l = Integer . parseInt ( array [ a ] . substring ( 1 , 2 ) ) ;
    int h = Integer . parseInt ( array [ a ] . substring ( 2 , n ) ) ;
    int ans = 0 ;
    for ( int z = l ;
    z <= h ;
    z ++ ) {
      int cou = 0 ;
      for ( int i = a + 1 ;
      i < n ;
      i ++ ) {
        char c = array [ a + 1 ] . charAt ( i ) ;
        if ( z % Integer . parseInt ( c ) == 0 || ( int ) c % z == 0 ) {
          cou ++ ;
        }
      }
      if ( cou == array [ a + 1 ] . length ( ) ) {
        ans = z ;
        break ;
      }
    }
    if ( ans == 0 ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": NO" ) ;
    }
    else {
      System . out . println ( "Case #" + ( i + 1 ) + ": " + ans ) ;
    }
  }
}
