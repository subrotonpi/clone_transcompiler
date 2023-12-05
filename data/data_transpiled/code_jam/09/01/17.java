static private int [ ] solve ( String [ ] dic , String [ ] words ) throws IOException {
  final int [ ] ret = new int [ words . length ] ;
  for ( int i = 0 ;
  i < words . length ;
  i ++ ) {
    String modified = "" ;
    boolean paropen = false ;
    for ( int j = 0 ;
    j < words [ i ] . length ( ) ;
    j ++ ) {
      switch ( words [ i ] . charAt ( j ) ) {
        case ')' : paropen = false ;
        modified = modified . substring ( 0 , modified . length ( ) - 1 ) + words [ i ] . charAt ( j ) ;
        break ;
        case '(' : paropen = true ;
        modified += words [ i ] . charAt ( j ) ;
        break ;
        default : if ( paropen ) {
          modified += words [ i ] + "|" ;
        }
        else {
          modified += words [ i ] . charAt ( j ) ;
        }
      }
    }
    String word = modified ;
    final Pattern pattern = Pattern . compile ( word ) ;
    int cnt = 0 ;
    for ( String dicWord : dic ) {
      if ( pattern . matcher ( dicWord ) . matches ( ) ) {
        cnt ++ ;
      }
    }
    ret [ i ] = cnt ;
  }
  if ( className . equals ( "java.util.jar" ) ) {
    final BufferedReader in = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
    final PrintWriter out = new PrintWriter ( new FileWriter ( "resultA.txt" ) ) ;
    final int [ ] input = new int [ 4 ] ;
    for ( int i = 0 ;
    i < input . length ;
    i ++ ) {
      input [ i ] = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
    }
    final int L = input [ 0 ] ;
    final int D = input [ 1 ] ;
    final int N = input [ 2 ] ;
    final String [ ] dic = new String [ L ] ;
    for ( int i = 0 ;
    i < D ;
    i ++ ) {
      dic [ i ] = in . readLine ( ) . trim ( ) ;
    }
    final String [ ] words = new String [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      words [ i ] = in . readLine ( ) . trim ( ) ;
    }
    final int [ ] solution = solve ( dic , words ) ;
    for ( int i = 0 ;
    i < solution . length ;
    i ++ ) {
      out . println ( " Case ▁