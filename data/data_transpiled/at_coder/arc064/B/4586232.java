public static void input ( ) {
  String s = input ( ) ;
  String [ ] players = {
    "First" , "Second" }
    ;
    int last = s . charAt ( 0 ) == s . charAt ( s . length ( ) - 1 ) ? 1 : 0 ;
    int cnt = ( s . length ( ) - 2 + 1 + last ) % 2 ;
    String ans = players [ cnt ] ;
    System . out . println ( ans ) ;
  }
  