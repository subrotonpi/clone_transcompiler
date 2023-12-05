@ GwtIncompatible ( "java.util.logging.Logger" ) public static int [ ] solve ( int N ) throws IOException {
  final String filename = "test.txt" ;
  final String output = "" ;
  final long TIC = System . currentTimeMillis ( ) ;
  final List < String > inputLines = Files . readAllLines ( filename ) ;
  final List < Integer > correctLines = Arrays . asList ( inputLines . remove ( 0 ) . split ( "\n" ) ) ;
  final List < Float > unfilteredCorrectLines = Arrays . asList ( Float . parseFloat ( inputLines . get ( 0 ) ) ) ;
  final int [ ] expectedLines = new int [ ] {
    1 , 2 , 3 , 9 }
    ;
    final int [ ] expectedLines = new int [ ] {
      1 , 2 , 3 , 9 }
      ;
      final String [ ] expectedLines = new String [ ] {
        expectedLines [ 0 ] , expectedLines [ 1 ] , expectedLines [ 2 ] , expectedLines [ 3 ] , expectedLines [ 4 ] , expectedLines [ 5 ] , expectedLines [ 6 ] , expectedLines [ 7 ] , expectedLines [ 8 ] , expectedLines [ 9 ] , expectedLines [ 10 ] , expectedLines [ 11 ] , expectedLines [ 12 ] , expectedLines [ 13 ] , expectedLines [ 14 ] , expectedLines [ 15 ] , expectedLines [ 15 ] , expectedLines [ 16 ] , expectedLines [ 15 ] , expectedLines [ 16 ] , expectedLines [ 17 ] , expectedLines [ 18 ] , expectedLines [ 19 ] , expectedLines [ 19 ] , expectedLines [ 19 ] , expectedLines [ 20 ] , expectedLines [ 21 ] , expectedLines [ 21 ] , expectedLines [ 23 ] , expectedLines [ 24 ] , expectedLines [ 25 ] , expectedLines [ 26 ] , expectedLines [ 27 ] , expectedLines [ 27 ] , expectedLines [ 28 ] , expectedLines [ 28 ] , expectedLines [ 29 ] , expectedLines [ 30 ] , expectedLines [ 31 ] , expectedLines [ 30 ] , expectedLines [ 31 ] , expectedLines [ 30 ] , expectedLines [ 31 ] , expectedLines [ 30 ] , expectedLines [ 31 ] , expectedLines [ 32 ] , expectedLines [ 33 ] , expectedLines [ 33 ] , expectedLines [ 33 ] , expectedLines [ 33 ] , expectedLines [ 34 ] , expectedLines [ 33 ] , expectedLines [ 33 ] , expectedLines [ 34 ] , expectedLines [ 33 ] ,