public static int keys ( int numPerKey , int numKeys , int numLetters , List < Integer > frequencies ) {
  Collections . sort ( frequencies ) ;
  int iterations = 0 ;
  int answer = 0 ;
  while ( frequencies . size ( ) > 0 && iterations < numPerKey ) {
    iterations ++ ;
    for ( int i = 0 ;
    i <= Math . min ( frequencies . size ( ) , numKeys ) ;
    i ++ ) {
      answer += frequencies . remove ( frequencies . size ( ) - i ) * iterations ;
    }
  }
  if ( frequencies . size ( ) > 0 ) {
    return - 1 ;
  }
  else {
    return answer ;
  }
}
int N = Integer . parseInt ( readLine ( ) ) ;
for ( int i = 1 ;
i <= N ;
i ++ ) {
  String per = readLine ( ) ;
  String key = readLine ( ) ;
  String let = readLine ( ) ;
  int freq = Integer . parseInt ( readLine ( ) ) ;
  freq = map . get ( freq ) ;
  System . out . println ( "Case #" + i + ": " + keys ( Integer . parseInt ( per ) , Integer . parseInt ( key ) , Integer . parseInt ( let ) , freq ) ) ;
}
