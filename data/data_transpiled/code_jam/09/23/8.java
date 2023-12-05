public static final String getSolutionName ( ) throws IOException {
  final BufferedReader fin = new BufferedReader ( new FileReader ( "squaret.in" ) ) ;
  final int T = Integer . parseInt ( fin . readLine ( ) . substring ( 0 , fin . readLine ( ) . length ( ) - 1 ) ) ;
  for ( int tttt = 0 ;
  tttt < T ;
  tttt ++ ) {
    final int W = Integer . parseInt ( fin . readLine ( ) . substring ( 0 , fin . readLine ( ) . length ( ) - 1 ) ) ;
    final int Q = Integer . parseInt ( fin . readLine ( ) . substring ( 0 , fin . readLine ( ) . length ( ) - 1 ) ) ;
    final List < List < Integer >> data = new ArrayList < > ( ) ;
    final List < Integer > goal = new ArrayList < > ( ) ;
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      data . add ( Integer . parseInt ( fin . readLine ( ) . substring ( 0 , fin . readLine ( ) . length ( ) - 1 ) ) ) ;
    }
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      data . add ( new ArrayList < > ( ) ) ;
    }
    final List < Integer > result = new ArrayList < > ( ) ;
    for ( int g : goal ) {
      result . add ( "" ) ;
    }
    final List < List < Integer >> table = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      for ( int i = 0 ;
      i < W ;
      i ++ ) {
        for ( int j = 0 ;
        j < W ;
        j ++ ) {
          if ( '0' <= data . get ( i ) . get ( j ) && data . get ( i + j ) . get ( j ) <= '9' ) {
            table . get ( i , j , new ArrayList < > ( ) ) ;
          }
        }
      }
    }
    / * ▁ check ▁ for ▁ first ▁ case ▁ for ▁ second ▁ case ▁ for ▁ first ▁ case ▁ for ▁ second ▁ case ▁ for ▁ second ▁ case ▁ for ▁ first ▁ case ▁ for ▁ second ▁ case ▁ for ▁ second ▁ case ▁ for ▁ second ▁ case ▁ for ▁ second ▁ case ▁ for ▁ second ▁ case ▁ for ▁ second ▁ case ▁ for ▁ second ▁ case ▁ for ▁ second ▁ case ▁ for ▁ second ▁ case ▁ for ▁ second ▁ case ▁ for ▁ second ▁ case ▁ for ▁ second ▁ case