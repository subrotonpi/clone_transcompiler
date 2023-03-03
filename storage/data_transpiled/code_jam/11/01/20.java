public static void readFile ( String input1 , String input2 ) {
  try {
    BufferedReader fin = new BufferedReader ( new FileReader ( input1 ) ) ;
    BufferedWriter fout = new BufferedWriter ( new FileWriter ( input2 ) ) ;
    int numcases = Integer . parseInt ( fin . readLine ( ) ) ;
    for ( int i = 1 ;
    i <= numcases ;
    i ++ ) {
      float [ ] orange = {
        1 , 0 }
        ;
        float [ ] blue = {
          1 , 0 }
          ;
          HashMap < String , Float > robotmap = new HashMap < String , Float > ( ) ;
          robotmap . put ( "O" , orange ) ;
          robotmap . put ( "B" , blue ) ;
          HashMap < String , Float > notrobotmap = new HashMap < String , Float > ( ) ;
          notrobotmap . put ( "O" , blue ) ;
          notrobotmap . put ( "B" , orange ) ;
          String [ ] line = fin . readLine ( ) . split ( " " ) ;
          for ( int j = 1 ;
          j < line . length ;
          j += 2 ) {
            float [ ] r = robotmap . get ( line [ j ] ) ;
            float [ ] notr = notrobotmap . get ( line [ j ] ) ;
            int target = Integer . parseInt ( line [ j + 1 ] ) ;
            r [ 1 ] += Math . abs ( target - r [ 0 ] ) + 1 ;
            if ( ( r [ 1 ] <= notr [ 1 ] ) && ( r [ 1 ] <= notr [ 1 ] ) ) {
              r [ 1 ] = notr [ 1 ] + 1 ;
            }
            r [ 0 ] = target ;
          }
          fout . write ( "Case #" + i + ": " + Math . max ( ( orange [ 1 ] ) , ( blue [ 1 ] ) ) + '\n' ) ;
        }
        fin . close ( ) ;
        fout . close ( ) ;
      }
      catch ( Exception e ) {
        e . printStackTrace ( ) ;
      }
    }
    