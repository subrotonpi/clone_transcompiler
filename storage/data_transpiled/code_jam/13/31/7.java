public static String calcSingleTest ( String inputFileName ) {
  String outputFileName = inputFileName . substring ( 0 , inputFileName . length ( ) - 3 ) + ".out" ;
  String vowels = "aeiou" ;
  BufferedReader inpF = new BufferedReader ( new FileReader ( inputFileName ) ) ;
  PrintWriter outF = new PrintWriter ( outputFileName ) ;
  String line = inpF . readLine ( ) ;
  String name = line . split ( " " ) [ 0 ] ;
  int n = Integer . parseInt ( line . split ( " " ) [ 1 ] ) ;
  int l = name . length ( ) ;
  if ( ( l < n ) || ( n == 0 ) ) {
    return 0 ;
  }
  int curCons = 0 ;
  int sum = 0 ;
  int startPoints = 0 ;
  for ( int pos = 0 ;
  pos < l ;
  pos ++ ) {
    char ch = name . charAt ( pos ) ;
    if ( vowels . indexOf ( ch ) >= 0 ) {
      curCons = 0 ;
    }
    else {
      curCons ++ ;
    }
    if ( curCons >= n ) {
      startPoints = pos - n + 2 ;
      sum += pos - n + 2 ;
    }
    else {
      sum += startPoints ;
    }
  }
  inpF . close ( ) ;
  outF . close ( ) ;
  line = inpF . readLine ( ) ;
  int testsCount = Integer . parseInt ( line ) ;
  for ( int i = xrange ( 1 , testsCount + 1 ) ;
  i < testsCount ;
  i ++ ) {
    System . out . println ( " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -