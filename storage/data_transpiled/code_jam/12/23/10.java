static final String [ ] [ ] getSums ( ) throws IOException {
  final Scanner in = new Scanner ( System . in ) ;
  final Map < Integer , String > sums = new HashMap < > ( ) ;
  for ( int n = 1 ;
  n < line . length ( ) ;
  n ++ ) {
    System . out . println ( n ) ;
    for ( String c : new String [ ] {
      line . substring ( n ) }
      ) {
        if ( sums . containsKey ( new Integer ( n ) ) ) {
          return new String [ ] [ ] {
            c , sums . get ( new Integer ( n ) ) }
            ;
          }
          else {
            sums . put ( new Integer ( n ) , c ) ;
          }
        }
      }
      if ( className . equals ( "org.apache.commons.math.analysis.Sums" ) ) {
        final BufferedReader in = new BufferedReader ( new FileReader ( new File ( "src/main/resources/Sums.in" ) ) ) ;
        final List < List < Integer >> lines = new ArrayList < > ( ) ;
        final List < String > output = new ArrayList < > ( ) ;
        in . readLine ( ) ;
        while ( in . ready ( ) ) {
          lines . add ( Arrays . asList ( in . readLine ( ) . split ( " " ) ) ) ;
        }
        int caseNum = 1 ;
        for ( List < Integer > line : lines ) {
          output . add ( "Case #" + caseNum + ":" ) ;
          sums = lowest ( line ) ;
          if ( sums . equals ( "Impossible" ) ) {
            output . add ( "Impossible" ) ;
          }
          else {
            output . add ( StringUtils . leftPad ( sums . get ( 0 ) , 2 , '0' ) ) ;
            output . add ( StringUtils . leftPad ( sums . get ( 1 ) , 2 , '0' ) ) ;
          }
          caseNum ++ ;
        }
        final BufferedWriter out = new BufferedWriter ( new FileWriter ( "out.out" ) ) ;
        for ( String line : output ) {
          out . write ( line + "\n" ) ;
        }
      }
      return null ;
    }
    