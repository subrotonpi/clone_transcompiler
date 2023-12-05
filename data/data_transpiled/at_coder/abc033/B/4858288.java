public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String sMax = "" ;
  int pMax = - 1 ;
  int pSum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String S = input . substring ( 0 , i ) ;
    String P = input . substring ( i + 1 ) ;
    P = Integer . parseInt ( P ) ;
    if ( P > pMax ) {
      sMax = S ;
      pMax = P ;
    }
    pSum += P ;
  }
  if ( pMax > pSum / 2 ) {
    System . out . println ( sMax ) ;
  }
  else {
    System . out . println ( "atcoder" ) ;
  }
}
