public static List < String > data = Arrays . asList ( new String [ ] {
  "infile" , "outfile" }
  ) ;
  List < String > out = new ArrayList < String > ( ) ;
  try {
    BufferedReader br = new BufferedReader ( new FileReader ( "infile" ) ) ;
    out . add ( "" ) ;
    String line ;
    while ( ( line = br . readLine ( ) ) != null ) {
      out . add ( line . trim ( ) ) ;
    }
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
  finally {
    try {
      if ( out != null ) out . close ( ) ;
    }
    catch ( IOException e ) {
      e . printStackTrace ( ) ;
    }
  }
  int ncases = Integer . parseInt ( data . remove ( 0 ) ) ;
  for ( int case = 0 ;
  case < ncases ;
  case ++ ) {
    int numcandies = Integer . parseInt ( data . remove ( 0 ) ) ;
    int [ ] candies = new int [ numcandies ] ;
    for ( int i = 0 ;
    i < numcandies ;
    i ++ ) {
      candies [ i ] = Integer . parseInt ( data . remove ( 0 ) ) ;
    }
    int truesum = 0 ;
    int xorsum = 0 ;
    int minimum = candies [ 0 ] ;
    for ( int i = 0 ;
    i < candies . length ;
    i ++ ) {
      truesum += candies [ i ] ;
      xorsum ^= candies [ i ] ;
      if ( i < minimum ) minimum = candies [ i ] ;
    }
    String ans = "NO" ;
    if ( xorsum == 0 ) ans = String . valueOf ( truesum - minimum ) ;
    out . add ( "Case #" + ( case + 1 ) + ": " + ans ) ;
  }
  return out ;
}
