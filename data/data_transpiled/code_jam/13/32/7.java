static String inputFileName = "B-large.in" ;
String outputFileName = inputFileName . substring ( 0 , inputFileName . length ( ) - 3 ) + ".out" ;
{
  int s = Math . abs ( X ) + Math . abs ( Y ) ;
  int n = ( int ) ( ( 2 * s + 0.25 ) * 0.5 - 0.5 ) ;
  int s2 = 0 ;
  String resStr ;
  {
    String line = inputFileName ;
    int X0 = Integer . parseInt ( line . split ( " " ) [ 0 ] ) ;
    int Y0 = Integer . parseInt ( line . split ( " " ) [ 1 ] ) ;
    boolean swap = ( Y == 0 ) ;
    if ( swap ) {
      X = Y ;
      Y = X ;
    }
    if ( swap ) {
      yList = xList ;
    }
    String resStr = "" ;
    int xt = 0 ;
    int yt = 0 ;
    for ( int i = 0 ;
    i < xrange ( 1 , n + 1 ) ;
    i ++ ) {
      if ( xList . contains ( i ) ) {
        xt += i ;
        resStr += 'E' ;
      }
      else if ( yList . contains ( i ) ) {
        yt += i ;
        resStr += 'N' ;
      }
      else {
        System . out . println ( "AAAAAAAAAA " + i ) ;
        throw new IllegalArgumentException ( "AAAAAAAAAA " + i ) ;
      }
    }
    {
      int res = calcSingleTest2 ( X , Y ) ;
      int testsCount = Integer . parseInt ( line . split ( " " ) [ 0 ] ) ;
      for ( int i = 0 ;
      i < testsCount ;
      i ++ ) {
        if ( xList . contains ( i ) ) {
          xt += i ;
          resStr += 'E' ;
        }
        else if ( yList . contains ( i ) ) {
          yt += i ;
          resStr += 'W' ;
        }
        else if ( yList . contains ( i ) ) {
          yt -= i ;
          resStr += 'S' ;
        }
        else {
          System . out . println ( "AAAAAAAAAA " + i ) ;
          throw new IllegalArgumentException ( "AAAAAAAAAA " + i ) ;
        }
      }
    }
  }
}
