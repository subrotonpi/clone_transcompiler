static final String FILE_NAME = "A-large" ;
final String INPUT_FILE = FILE_NAME + ".in" ;
final String OUTPUT_FILE = FILE_NAME + ".out" ;
{
  int [ ] [ ] slots = new int [ k ] [ ] ;
  for ( int i = 0 ;
  i < k ;
  ++ i ) {
    slots [ i ] = new int [ k ] ;
  }
  Arrays . sort ( slots , Collections . reverseOrder ( ) ) ;
  int total = 0 ;
  for ( int i = 0 , cnt = slots . length ;
  i < cnt ;
  ++ i ) {
    total = total + slots [ i ] [ cnt ] * ( i / k + 1 ) ;
  }
  System . out . println ( "Case #" + testCase + ": " + total ) ;
}
