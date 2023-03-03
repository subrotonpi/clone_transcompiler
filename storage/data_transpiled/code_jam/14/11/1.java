public static String xor ( String a , String b ) {
  String c = "" ;
  for ( int i : xrange ( a . length ( ) ) ) {
    c += "01" . charAt ( ( int ) a . charAt ( i ) ^ ( int ) b . charAt ( i ) ) ;
  }
  return c ;
  int T = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  for ( int tc : xrange ( 1 , T + 1 ) ) {
    System . out . println ( "Case #" + tc + ":" ) ;
    int n = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    int l = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    String flow [ ] = readLine ( ) . trim ( ) . split ( " " ) ;
    String devices [ ] = readLine ( ) . trim ( ) . split ( " " ) ;
    int minAnswer = 9999 ;
    for ( int socket = 0 ;
    socket < n ;
    socket ++ ) {
      String flips [ ] = xor ( flow [ socket ] , devices [ 0 ] ) ;
      List < String > modflows = new ArrayList < String > ( ) ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        modflows . add ( xor ( flow [ i ] , flips ) ) ;
      }
      boolean good = true ;
      for ( int i = 1 ;
      i < n ;
      i ++ ) {
        if ( ! modflows . contains ( devices [ i ] ) ) {
          good = false ;
          break ;
        }
      }
      if ( good ) {
        minAnswer = Math . min ( minAnswer , Splitter . on ( "," ) . splitToList ( flips ) . size ( ) ) ;
      }
    }
    String answer = minAnswer >= 9999 ? "NOT POSSIBLE" : Integer . toString ( minAnswer ) ;
    System . out . println ( answer ) ;
  }
  return null ;
}
