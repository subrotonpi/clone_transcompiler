static final double norm ( double [ ] x ) throws IOException {
  double distance ;
  double closestPos ;
  double distance ;
  double [ ] dot = {
    x [ 0 ] * x [ 1 ] , y [ 0 ] * y [ 1 ] }
    ;
    distance = Math . sqrt ( distance ) ;
    distance = Math . abs ( distance ) ;
    closestPos = Math . abs ( distance ) ;
    distance = Math . abs ( distance ) ;
    distance = Math . abs ( distance ) ;
    distance = Math . abs ( distance ) ;
    distance = Math . abs ( distance ) ;
    distance = Math . abs ( distance ) ;
    distance = Math . abs ( distance ) ;
    distance = Math . abs ( distance ) ;
    String inname = "E:\B.in.txt" ;
    BufferedReader fin = new BufferedReader ( new FileReader ( inname ) ) ;
    PrintWriter fout = new PrintWriter ( new FileWriter ( "E:\B.out.txt" ) ) ;
    String lines = fin . readLine ( ) ;
    int cases = Integer . parseInt ( lines . substring ( 0 , 1 ) . trim ( ) ) ;
    int pointer = 1 ;
    for ( int testCase = 1 ;
    testCase <= cases ;
    testCase ++ ) {
      int fly_count = Integer . parseInt ( lines . substring ( pointer ) . trim ( ) ) ;
      int [ ] [ ] fly_info = new int [ fly_count ] [ 3 ] ;
      for ( int i = 0 ;
      i <= fly_count ;
      i ++ ) {
        pointer ++ ;
        fly_info [ i ] = Integer . parseInt ( lines . substring ( pointer , i + 1 ) . trim ( ) ) ;
      }
      double [ ] com_0 = {
        0 , 0 , 0 }
        ;
        for ( int fly = 0 ;
        fly <= fly_count ;
        fly ++ ) {
          com_0 = new double [ fly_info [ fly ] . length ] ;
          for ( int i = 0 ;
          i <= 3 ;
          i ++ ) {
            com_0 [ fly ] = com_0 [ i ] + fly_info [ fly ] [ i ] ;
          }
        }
        double [ ] com_speed = {
          0 , 0 , 0 }
          ;
          for ( int fly = 0 ;
          fly <= fly_count ;
          fly ++ ) {
            com_speed = new double [ fly_info [ fly ] . length + 3 ] ;
            for ( int i = 0 ;
            i <= 3 ;
            i ++ ) {
              com_speed [ fly ] = com_speed [ fly ] [ i + 3 ] ;
            }
          }
          distance = Math . max ( 0 , time )