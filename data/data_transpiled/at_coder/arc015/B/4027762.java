public static String bDays ( int N , String [ ] [ ] Observations ) {
  int dayMousho = 0 , dayManatsu = 0 , dayNatsu = 0 , daynettai = 0 , dayFuyu = 0 , dayMafuyu = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String highestTemp = Observations [ i ] [ 0 ] ;
    String lowestTemp = Observations [ i ] [ 1 ] ;
    if ( highestTemp . contains ( "." ) ) highestTemp = Integer . parseInt ( highestTemp . replace ( "." , "" ) ) ;
    else highestTemp = Integer . parseInt ( highestTemp ) * 10 ;
    if ( lowestTemp . contains ( "." ) ) lowestTemp = Integer . parseInt ( lowestTemp . replace ( "." , "" ) ) ;
    else lowestTemp = Integer . parseInt ( lowestTemp ) * 10 ;
    if ( highestTemp >= 350 ) dayMousho ++ ;
    else if ( 300 <= highestTemp && highestTemp < 350 ) dayManatsu ++ ;
    else if ( 250 <= highestTemp && highestTemp < 300 ) dayNatsu ++ ;
    if ( lowestTemp >= 250 ) daynettai ++ ;
    if ( lowestTemp < 0 && highestTemp >= 0 ) dayFuyu ++ ;
    if ( highestTemp < 0 ) dayMafuyu ++ ;
  }
  String ans = StringUtils . leftPad ( Integer . toString ( dayMousho ) , N , "0" ) ;
  Arrays . fill ( Observations , Integer . toString ( dayManatsu ) , Integer . toString ( dayNatsu ) , Integer . toString ( daynettai ) , Integer . toString ( dayFuyu ) , Integer . toString ( dayMafuyu ) ) ;
  return ans ;
}
