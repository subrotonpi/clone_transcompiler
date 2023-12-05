static final String usage = "usage: java -jar file in class file" ;
if ( args . length != 2 ) {
  System . err . println ( "usage: java -jar file in class file" ) ;
  System . exit ( 0 ) ;
}
BufferedReader in = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
int maxsize = R + 1 ;
int debugprint = 0 ;
int i ;
int j ;
int maxcases = 0 ;
String line = in . readLine ( ) . trim ( ) ;
maxcases = Integer . parseInt ( line ) ;
while ( i ++ > maxcases ) {
  int casenum = casenum + 1 ;
  String [ ] line1 = in . readLine ( ) . split ( " " ) ;
  int result = handleonecase ( line1 ) ;
  System . out . println ( "Case #" + casenum + ": " + result ) ;
  wt = wt - weights [ x ] [ y ] - weights [ x + size - 1 ] [ y ] - weights [ x ] [ y + size - 1 ] - weights [ x + size - 1 ] [ y + size - 1 ] ;
  xwt = xwt - ( size - 1 ) * weights [ x + size - 1 ] [ y ] - ( size - 1 ) * weights [ x ] [ y + size - 1 ] - weights [ x + size - 1 ] [ y + size - 1 ] ;
  ywt = ywt - ( size - 1 ) * weights [ x ] [ y + size - 1 ] - ( size - 1 ) * weights [ x ] [ y + size - 1 ] - ( size - 1 ) * weights [ x ] [ y + size - 1 ] - weights [ x ] [ y + size - 1 ] - weights [ x ] [ y + size - 1 ] - weights [ x ] [ y + size - 1 ] - weights [ x ] [ y + size - 1 ] - weights [ x ] [ y + size - 1 ] - weights [ x ] [ y + size - 1 ] - weights [ x ] [ y + size - 1 ] - weights [ x ] [ y + size - 1 ] ) ;
  if ( 2 * xwt - wt * ( size - 1 ) != 0 ) return false ;
  if ( 2 * ywt - wt * ( size - 1 ) != 0 ) return false ;
}
