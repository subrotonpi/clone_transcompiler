static final String [ ] args = new String [ args . length ] ;
String [ ] hand = new String [ args . length ] ;
String [ ] deck = new String [ args . length ] ;
int turns = 0 ;
int i ;
int maxScore = 0 ;
int keep = 0 ;
if ( args . length > 1 ) {
  String out = ( args . length > 2 ) ? args [ 2 ] : "test.out" ;
  BufferedReader fileIn = new BufferedReader ( new FileReader ( args [ 1 ] ) ) ;
  String line = fileIn . readLine ( ) ;
  int caseNum = 0 ;
  while ( line . length ( ) != 0 ) {
    hand [ i ] = line . substring ( 0 , line . length ( ) - 1 ) ;
  }
  int numDeck = fileIn . read ( ) ;
  for ( int j = 0 ;
  j < numDeck ;
  j ++ ) deck [ i ] = fileIn . readLine ( ) . substring ( 0 , line . length ( ) - 1 ) ;
  int answer = score ( hand , deck , 1 , 0 ) ;
  System . arraycopy ( hand , 0 , deck , 0 , hand . length ) ;
  String outstr = "Case #" + caseNum + ": " + Integer . toString ( answer ) ;
  System . arraycopy ( deck , 0 , outstr , hand . length , deck . length ) ;
  System . arraycopy ( deck , 0 , outstr , hand . length + 1 , deck . length ) ;
  String [ ] card = new String [ hand . length ] ;
  int c = Integer . parseInt ( card [ 0 ] ) ;
  int s = Integer . parseInt ( card [ 1 ] ) ;
  int t = Integer . parseInt ( card [ 2 ] ) ;
  for ( int j = 0 ;
  c <= s ;
  j ++ ) {
    if ( deck [ j ] > 0 ) {
      int drawCard = deck [ j ] ;
      hand [ i ] = drawCard ;
      deck [ j ] = drawCard ;
    }
  }
  System . arraycopy ( deck , 0 , deck , 0 , deck . length ) ;
  turns += t ;
}
if ( turns == 1 || deck . length == 0 ) {
  maxScore = 0 ;
  keep = 0 ;
  for ( i = 0 ;
  i < hand . length ;
  i ++ ) {
    String [ ] rHand = hand [ i ] . substring ( 0 , i ) . split ( " " ) ;
    String rDeck = deck [ i ] ;
    int tTurns