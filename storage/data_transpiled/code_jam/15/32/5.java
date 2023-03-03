static final String getProblemId ( ) throws IOException {
  final String problemId = "B" ;
  System . setProperty ( "problemId" , problemId ) ;
  final String inputPath = problemId + ".in" ;
  final String outputPath = problemId + ".out" ;
  {
    String line = "" ;
    while ( line . length ( ) == 0 ) {
      line = inputFile . readLine ( ) . trim ( ) ;
    }
    return line ;
  }
  {
    System . out . println ( line ) ;
    return outputFile . write ( line + System . getProperty ( "line.separator" ) ) ;
  }
  private static final int [ ] computeShifts ( final String pattern ) {
    final int [ ] shifts = new int [ pattern . length ( ) + 1 ] ;
    Arrays . fill ( shifts , - 1 ) ;
    int shift = 1 ;
    for ( int pos = 0 ;
    pos < pattern . length ( ) + 1 ;
    pos ++ ) {
      while ( shift < pos && pattern . charAt ( pos - 1 ) != pattern . charAt ( pos - shift - 1 ) ) {
        shift += shifts [ pos - shift - 1 ] ;
      }
      shifts [ pos ] = shift ;
    }
    return shifts ;
  }
  private static double solve ( ) {
    final int k = Integer . parseInt ( inputFile . readLine ( ) ) ;
    final int l = Integer . parseInt ( inputFile . readLine ( ) ) ;
    final int s = Integer . parseInt ( inputFile . readLine ( ) ) ;
    final String keyboard = inputFile . readLine ( ) ;
    final String target = inputFile . readLine ( ) ;
    final Map < Integer , Integer > letter = new TreeMap < Integer , Integer > ( ) ;
    for ( final Integer key : keyboard ) {
      letter . put ( key , 1 ) ;
    }
    int numerator = 1 ;
    for ( final Integer key : target ) {
      letter . put ( key , letter . get ( key ) ) ;
    }
    return 1.0 ;
  }
}
