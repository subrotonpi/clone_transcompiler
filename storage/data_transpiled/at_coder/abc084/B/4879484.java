public static String input ( ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  String s = input . readLine ( ) ;
  String [ ] bango = {
    '0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9' }
    ;
    String answer = "No" ;
    int count = 0 ;
    if ( s . charAt ( a ) == '-' ) {
      s = s . substring ( 0 , a ) + s . substring ( a + 1 ) ;
      for ( int i = 0 ;
      i < s . length ( ) ;
      i ++ ) {
        if ( bango [ i ] . equals ( s . charAt ( i ) ) ) {
          count ++ ;
        }
      }
      if ( count == s . length ( ) ) {
        answer = "Yes" ;
      }
    }
    return answer ;
  }
  