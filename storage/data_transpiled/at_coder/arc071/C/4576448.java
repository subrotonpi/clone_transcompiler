public static final String getAnswer ( ) {
  final BufferedReader F = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  String S = F . readLine ( ) . replace ( "A" , "1" ) . replace ( "B" , "2" ) . trim ( ) ;
  String T = F . readLine ( ) . replace ( "A" , "1" ) . replace ( "B" , "2" ) . trim ( ) ;
  int [ ] sSum = new int [ S . length ( ) + 1 ] ;
  int [ ] tSum = new int [ T . length ( ) + 1 ] ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) sSum [ i + 1 ] = sSum [ i ] + Integer . parseInt ( S . charAt ( i ) ) ;
  for ( int i = 0 ;
  i < T . length ( ) ;
  i ++ ) tSum [ i + 1 ] = tSum [ i ] + Integer . parseInt ( T . charAt ( i ) ) ;
  String Ans = "" ;
  int Q = Integer . parseInt ( F . readLine ( ) . trim ( ) ) ;
  for ( ;
  Q > 0 ;
  Q -- ) {
    int a = Integer . parseInt ( F . readLine ( ) . trim ( ) ) ;
    int b = Integer . parseInt ( F . readLine ( ) . trim ( ) ) ;
    int c = Integer . parseInt ( F . readLine ( ) . trim ( ) ) ;
    int d = Integer . parseInt ( F . readLine ( ) . trim ( ) ) ;
    if ( ( sSum [ b ] - sSum [ a - 1 ] ) % 3 == ( tSum [ d ] - tSum [ c - 1 ] ) % 3 ) Ans += "YES\n" ;
    else Ans += "NO\n" ;
  }
  System . out . println ( Ans ) ;
  return Ans ;
}
