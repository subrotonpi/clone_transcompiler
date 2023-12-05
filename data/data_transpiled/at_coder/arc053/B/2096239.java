@ VisibleForTesting static int from ( ) {
  List < Character > S = list ( input ) ;
  int N = S . size ( ) ;
  Map < Character , Integer > cnt = new HashMap < > ( ) ;
  for ( char c : S ) cnt . put ( c , 1 ) ;
  int K = 0 ;
  for ( int value : cnt . values ( ) ) if ( value % 2 != 0 ) K ++ ;
  int res = 0 ;
  return res ;
}
