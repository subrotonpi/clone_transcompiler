public static final String getStrengthName ( ) throws IOException {
  BufferedReader iReader = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
  int size = Integer . parseInt ( iReader . readLine ( ) . trim ( ) ) ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    String [ ] line = iReader . readLine ( ) . trim ( ) . split ( " " ) ;
    int N = Integer . parseInt ( line [ 0 ] ) ;
    int M = Integer . parseInt ( line [ 1 ] ) ;
    int K = Integer . parseInt ( line [ 2 ] ) ;
    int stones = 0 ;
    if ( K <= 4 ) {
      stones = K ;
    }
    else if ( Math . min ( N , M ) <= 2 ) {
      stones = K ;
    }
    else if ( Math . min ( N , M ) == 3 ) {
      int enclosed = ( int ) ( ( K - 2 ) / 3 ) ;
      enclosed = Math . min ( enclosed , Math . max ( N , M ) - 2 ) ;
      stones = K - enclosed ;
    }
    else {
      int enclosed ;
      if ( K < 8 ) {
        enclosed = 1 ;
      }
      else if ( K < 10 ) {
        enclosed = 2 ;
      }
      else if ( K < 12 ) {
        enclosed = 3 ;
      }
      else if ( K < 14 || Math . max ( N , M ) == 4 ) {
        enclosed = 4 ;
      }
      else if ( K < 16 ) {
        enclosed = 5 ;
      }
      else {
        enclosed = 6 ;
      }
      stones = K - enclosed ;
    }
    String output = Integer . toString ( stones ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + output ) ;
  }
  return output ;
}
