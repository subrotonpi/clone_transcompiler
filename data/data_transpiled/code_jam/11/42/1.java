@ VisibleForTesting static boolean solve ( int R , int C , String [ ] data ) {
  final int M = Math . min ( R , C ) ;
  final String buf = "" ;
  int curCase = 0 ;
  @ VisibleForTesting static String id = "IMPOSSIBLE" ;
  @ Override public String go ( ) {
    int t = gcj . token ( int ) ;
    for ( int i = 0 ;
    i < t ;
    i ++ ) {
      int R = gcj . tokens ( 3 , i ) ;
      int C = gcj . tokens ( R , s -> {
        String res ;
        int [ ] data = new int [ s ] ;
        System . arraycopy ( s , 0 , data , 0 , s ) ;
        print ( gcj . case ( ) , solve ( R , C , data ) ) ;
      }
      ) ;
      if ( res == null ) throw new EOFException ( ) ;
      return res ;
    }
    @ Override public String line ( ) {
      String line = readLine ( ) ;
      return conv ( line . replaceAll ( "\n" , "" ) ) ;
    }
    @ Override public String [ ] splitline ( ) {
      String line = readLine ( ) ;
      return Arrays . copyOfRange ( line . split ( " " ) , 1 , line . length ( ) ) ;
    }
    @ Override public String whitespace ( ) {
      String line = null ;
      while ( line == null ) line = readLine ( ) . intern ( ) ;
      buf = line ;
      String [ ] spl = line . split ( null , - 1 ) ;
      String res = spl [ 0 ] ;
      assert line . startsWith ( res ) ;
      buf = line . substring ( res . length ( ) ) ;
      return conv ( res ) ;
    }
    @ Override public String tokens ( int cnt , String conv ) {
      return Arrays . copyOfRange ( data , 0 , cnt ) ;
    }
    @ Override public String case ( ) {
      curCase ++ ;
      return "Case #" + curCase + ":" ;
    }
  }
}
