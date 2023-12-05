public static String getLarge1 ( File f_in ) throws IOException {
  BufferedReader f_in = new BufferedReader ( new FileReader ( "../Downloads/B-large-1.in" ) ) ;
  int cases = Integer . parseInt ( f_in . readLine ( ) . replaceAll ( " " , "" ) ) ;
  for ( int test_case = 0 ;
  test_case < cases ;
  test_case ++ ) {
    int N = Integer . parseInt ( f_in . readLine ( ) . replaceAll ( " " , "" ) ) ;
    int [ ] flavours = new int [ N ] ;
    int M = Integer . parseInt ( f_in . readLine ( ) . replaceAll ( " " , "" ) ) ;
    String [ ] [ ] customers = new String [ M ] [ N ] ;
    for ( int ii = 0 ;
    ii < M ;
    ii ++ ) {
      customers [ ii ] = f_in . readLine ( ) . split ( "\\s+" ) ;
      if ( ! ( 2 * Integer . parseInt ( customers [ ii ] [ 0 ] ) + 1 == customers [ ii ] . length ) ) {
        System . out . println ( "*** NOT EQUAL LENS ***" ) ;
      }
      for ( int jj = 0 ;
      jj < customers [ ii ] . length ;
      jj ++ ) {
        customers [ ii ] [ jj ] = Integer . parseInt ( customers [ ii ] [ jj ] ) ;
      }
    }
    boolean change_made = true ;
    String output = "" ;
    while ( change_made == true ) {
      change_made = false ;
      for ( String [ ] customer : customers ) {
        boolean happy = false ;
        for ( int ii = 0 ;
        ii < customer [ 0 ] . length ;
        ii ++ ) {
          if ( customer [ 2 * ii + 2 ] == flavours [ customer [ 2 * ii + 1 ] - 1 ] ) {
            happy = true ;
            break ;
          }
        }
        if ( ! happy ) {
          change_made = true ;
          boolean made_happy = false ;
          for ( int ii = 0 ;
          ii < customer [ 0 ] . length ;
          ii ++ ) {
            if ( customer [ 2 * ii + 2 ] == 1 ) {
              made_happy = true ;
              flavours [ customer [ 2 * ii + 1 ] - 1 ] = 1 ;
              break ;
            }
          }
          if ( ! made_happy ) {
            output = "IMPOSSIBLE" ;
            break ;
          }
        }
      }
      if ( output . equals ( "IMPOSSIBLE" ) ) {
        break ;
      }
    }
    if ( output