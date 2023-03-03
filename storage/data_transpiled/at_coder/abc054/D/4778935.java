public static int N ( int N , int Ma , int Mb ) {
  List < Integer > abc = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) abc . add ( Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ) ;
  int maxW = N * 10 ;
  Map < Integer , Integer > [ ] dp = new HashMap [ N + 1 ] ;
  for ( int __ = 0 ;
  __ < N + 1 ;
  __ ++ ) dp [ __ ] = new HashMap < > ( ) ;
  dp [ 0 ] . put ( new Integer ( 0 ) , 0 ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = abc . get ( i ) ;
    int b = abc . get ( i ) ;
    int c = abc . get ( i + 1 ) ;
    for ( Map . Entry < Integer , Integer > e : dp [ i ] . entrySet ( ) ) {
      dp [ i + 1 ] . put ( e . getKey ( ) , Math . min ( dp [ i ] . get ( e . getKey ( ) ) , dp [ i + 1 ] . containsKey ( e . getKey ( ) ) ? e . getValue ( ) : Double . MAX_VALUE ) ) ;
      dp [ i + 1 ] . put ( e . getKey ( ) + a , e . getValue ( ) + b ) ;
      dp [ i + 1 ] . put ( e . getKey ( ) + c , Math . min ( dp [ i ] . get ( e . getKey ( ) ) + c , dp [ i + 1 ] . containsKey ( e . getKey ( ) ) ? e . getValue ( ) + c : Double . MAX_VALUE ) ) ;
    }
  }
  double cost = Double . MAX_VALUE ;
  int Mad = Ma ;
  int Mbd = Mb ;
  while ( Ma <= maxW && Mb <= maxW ) {
    if ( ( Mad = dp [ i ] . get ( Ma ) ) != null ) cost = Math . min ( dp [ i ] . get ( Ma ) , Mb ) ;
    Ma += Mad ;
    Mb += Mbd ;
  }
  System . out . println ( cost == Double . MAX_VALUE ? - 1 : cost ) ;
  return N ;
}
