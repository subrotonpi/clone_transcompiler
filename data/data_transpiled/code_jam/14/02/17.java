public static File inputFile = new File ( "B-large.in" ) ;
BufferedReader reader = new BufferedReader ( new FileReader ( inputFile ) ) ;
String line = null ;
File outputFile = new File ( "B-large.out" ) ;
int numTests = Integer . parseInt ( line ) ;
{
  double accumTime = 0 ;
  double farmRate = 0 ;
  do {
    double timeToWait = line . length ( ) / ( 2.0 + farmRate ) ;
    double timeIfBuyFarm = ( c / ( 2.0 + farmRate ) + line . length ( ) / ( 2.0 + farmRate + f ) ) ;
    if ( timeToWait <= timeIfBuyFarm ) {
      return accumTime + timeToWait ;
    }
    else {
      accumTime += c / ( 2.0 + farmRate ) ;
      farmRate += f ;
    }
  }
  while ( line . length ( ) > 0 ) ;
}
