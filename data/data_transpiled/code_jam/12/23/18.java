static final Scanner fin = new Scanner ( System . in ) {
  private int T = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int [ ] line = ArrayUtil . splitByLines ( fin . nextLine ( ) . split ( " " ) ) ;
    int N = line [ 0 ] ;
    int [ ] points = line [ 1 ] ;
    Arrays . sort ( points ) ;
    Map < Integer , List < Integer >> numbers = new HashMap < > ( ) ;
    numbers . put ( 0 , new ArrayList < > ( ) ) ;
    Tuple2 < List < Integer > , List < Integer >> result = null ;
    for ( int n : points ) {
      for ( Map . Entry < Integer , List < Integer >> entry : numbers . entrySet ( ) ) {
        int a = entry . getKey ( ) ;
        List < Integer > prefix = entry . getValue ( ) ;
        int b = a + n ;
        List < Integer > list = prefix . stream ( ) . map ( n -> n + n ) . collect ( Collectors . toList ( ) ) ;
        if ( numbers . containsKey ( b ) ) {
          List < Integer > line2 = numbers . get ( b ) ;
          result = new Tuple2 < > ( list , line2 ) ;
          break ;
        }
        else {
          numbers . put ( b , list ) ;
        }
      }
      if ( result != null ) {
        break ;
      }
    }
    System . out . println ( "Case #" + testCase + ":" ) ;
    if ( result != null ) {
      System . out . println ( Arrays . toString ( result . second ) ) ;
      System . out . println ( Arrays . toString ( result . first ) ) ;
    }
    else {
      System . out . println ( "Impossible" ) ;
    }
  }
}
