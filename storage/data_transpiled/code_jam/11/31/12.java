public static final String getUppercaseString ( ) throws IOException {
  BufferedReader is = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int num_cases = Integer . parseInt ( is . readLine ( ) ) ;
  for ( int i = 0 ;
  i <= num_cases ;
  i ++ ) {
    String [ ] words = is . readLine ( ) . split ( " " ) ;
    int R = Integer . parseInt ( words [ 0 ] ) , C = Integer . parseInt ( words [ 1 ] ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
    char [ ] [ ] grid = new char [ R ] [ C ] ;
    for ( int j = 0 ;
    j <= R ;
    j ++ ) {
      grid [ j ] = new char [ C ] ;
    }
    for ( int j = 0 ;
    j <= R ;
    j ++ ) {
      String line = is . readLine ( ) ;
      for ( int k = 0 ;
      k <= C ;
      k ++ ) {
        grid [ j ] [ k ] = line . charAt ( k ) ;
      }
    }
    if ( R < 2 || C < 2 ) {
      if ( grid [ 0 ] [ 0 ] == '.' ) {
        System . out . println ( '.' ) ;
        continue ;
      }
      else {
        System . out . println ( "Impossible" ) ;
        continue ;
      }
    }
    boolean flag = false ;
    for ( int j = 0 ;
    j <= R ;
    j ++ ) {
      for ( int k = 0 ;
      k <= C ;
      k ++ ) {
        if ( grid [ j ] [ k ] == '#' ) {
          grid [ j ] [ k ] = '/' ;
          if ( j + 1 == R ) {
            flag = true ;
            break ;
          }
          else {
            if ( grid [ j + 1 ] [ k ] == '#' ) {
              grid [ j + 1 ] [ k ] = '\\' ;
            }
            else {
              flag = true ;
              break ;
            }
          }
          if ( k + 1 == C ) {
            flag = true ;
            break ;
          }
          else {
            if ( grid [ j ] [ k + 1 ] == '#' ) {
              grid [ j ] [ k + 1 ] = '\\' ;
            }
            else {
              flag = true ;
              break ;
            }
            if ( grid [ j + 1 ] [ k + 1 ] == '#' ) {
              grid [ j + 1 ] [ k + 1 ] = '/' ;
            }
            else {
              flag = true ;
              break ;
            }
          }
        }
        