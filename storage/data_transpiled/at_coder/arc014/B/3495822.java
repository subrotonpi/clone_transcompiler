public static String bShiritori ( int N , String [ ] [ ] W ) {
  ArrayList < String > wordAed = new ArrayList < String > ( ) ;
  String lastWord = W [ 0 ] [ 0 ] ;
  String ans = "DRAW" ;
  for ( int turn = 0 ;
  turn < N ;
  turn ++ ) {
    String word = W [ turn ] [ 0 ] ;
    if ( lastWord . charAt ( lastWord . length ( ) - 1 ) != word . charAt ( 0 ) || wordAed . contains ( word ) ) {
      ans = turn % 2 == 1 ? "WIN" : "LOSE" ;
      break ;
    }
    lastWord = word ;
    wordAed . add ( word ) ;
  }
  return ans ;
}
