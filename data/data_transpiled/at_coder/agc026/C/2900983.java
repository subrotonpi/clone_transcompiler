@ Function public static LinkedHashMap < String , Integer > map ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  String S = input ( ) ;
  String A = S . substring ( 0 , N ) ;
  String B = S . substring ( N ) ;
  Map < String , Integer > D = new LinkedHashMap < > ( ) ;
  int ans = 0 ;
  {
    String r = "" ;
    String b = "" ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      String k = format ( i , "b" ) . replaceAll ( "[^0-9]" , "" ) ;
      if ( k . equals ( "1" ) ) r += X . charAt ( j ) ;
      else b += X . charAt ( j ) ;
    }
  }
  for ( int i = 0 ;
  i < 2 * N ;
  i ++ ) {
    String r = A . substring ( i , i ) ;
    String b = B . substring ( i , i ) ;
    ans += D . put ( new Integer ( b . substring ( 0 , i ) ) , r . substring ( 0 , i ) ) ;
  }
  System . out . println ( ans ) ;
}
