static final String getSolutionName ( ) {
  final String [ ] args = new String [ args . length ] ;
  Arrays . sort ( args , new Comparator < Pair < String , Integer >> ( ) {
    @ Override public int compare ( Pair < String , Integer > o1 , Pair < String , Integer > o2 ) {
      return 2 * Math . PI * o1 . x * o1 . y ;
    }
  }
  ) ;
  final List < Pair < String , Integer >> take = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < args . length ;
  i ++ ) {
    take . add ( o1 . getLeft ( ) ) ;
  }
  if ( take . size ( ) != 0 ) {
    final int maxRadius = Math . max ( take . get ( 0 ) , take . get ( 1 ) ) ;
    if ( maxRadius != 0 ) {
      final int outsides = Ints . checkedCast ( take . get ( 0 ) ) ;
      int best = 0 ;
      for ( int i = orderSize - 1 ;
      i < args . length ;
      i ++ ) {
        final Pair < String , Integer > n = take . get ( i ) ;
        final int radius = Math . max ( maxRadius , n . getLeft ( ) ) ;
        final int size = outsides + 2 * Math . PI * n . getLeft ( ) * n . getRight ( ) + Math . PI * radius * radius ;
        best = Math . max ( best , size ) ;
      }
      return best ;
    }
  }
  private String nextLine ( Scanner inputStream ) {
    String str = "" ;
    while ( ! str . isEmpty ( ) ) {
      str = inputStream . nextLine ( ) ;
    }
    return str . substring ( 0 , str . length ( ) - 1 ) ;
  }
  private int [ ] intSplit ( String s ) {
    return Arrays . stream ( s . split ( "\\s+" ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  }
  public static void main ( String [ ] args ) {
    String result = "" ;
    try {
      BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
      int number = Integer . parseInt ( nextLine ( in ) ) ;
      for ( int run = 0 ;
      run < number ;
      run ++ ) {
        String testCase = nextLine ( in ) ;
        int size = intSplit ( testCase ) ;
        int orderSize = intSplit ( orderSize ) ;
        List < String > pancakes = new ArrayList < > ( size ) ;
        for ( int i = 0 ;
        i <