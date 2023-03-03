@ Transactional public static String bDays ( int N , List < String > Observations ) {
  Map < String , Integer > weatherForecast = new HashMap < String , Integer > ( ) ;
  weatherForecast . put ( "mousho" , 0 ) ;
  weatherForecast . put ( "manatsu" , 0 ) ;
  weatherForecast . put ( "natsu" , 0 ) ;
  weatherForecast . put ( "nettaiya" , 0 ) ;
  weatherForecast . put ( "fuyu" , 0 ) ;
  weatherForecast . put ( "mafuyu" , 0 ) ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    String highestTemp = Observations . get ( j ) ;
    String lowestTemp = Observations . get ( j ) ;
    if ( highestTemp . contains ( "." ) ) highestTemp = Integer . parseInt ( highestTemp . replace ( "." , "" ) ) ;
    else highestTemp = Integer . parseInt ( highestTemp ) * 10 ;
    if ( lowestTemp . contains ( "." ) ) lowestTemp = Integer . parseInt ( lowestTemp . replace ( "." , "" ) ) ;
    else lowestTemp = Integer . parseInt ( lowestTemp ) * 10 ;
    if ( highestTemp >= 350 ) weatherForecast . put ( "mousho" , 1 ) ;
    else if ( 300 <= highestTemp && highestTemp < 350 ) weatherForecast . put ( "manatsu" , 1 ) ;
    else if ( 250 <= highestTemp && highestTemp < 300 ) weatherForecast . put ( "natsu" , 1 ) ;
    if ( lowestTemp >= 250 ) weatherForecast . put ( "nettaiya" , 1 ) ;
    if ( highestTemp >= 0 && lowestTemp < 0 ) weatherForecast . put ( "fuyu" , 1 ) ;
    if ( highestTemp < 0 ) weatherForecast . put ( "mafuyu" , 1 ) ;
  }
  String ans = StringUtils . join ( weatherForecast . values ( ) , " " ) ;
  return ans ;
}
