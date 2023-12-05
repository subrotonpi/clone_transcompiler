static final int N = Integer . parseInt ( input ) ;
if ( N == 0 ) System . out . println ( 0 + " " + input ) ;
String ans = "" ;
String [ ] dic = {
  "00" , "01" , "10" , "11" }
  ;
  int [ ] a = {
    0 , 1 , - 2 , - 1 }
    ;
    while ( N != 0 ) {
      int i = N % 4 ;
      ans = dic [ i ] + ans ;
      N -= a [ i ] ;
      N /= 4 ;
    }
    System . out . println ( ans . charAt ( 0 ) == '1' ? ans : ans . substring ( 1 ) ) ;
    return ans . length ( ) ;
  }
  