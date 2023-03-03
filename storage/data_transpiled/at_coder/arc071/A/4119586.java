@ VisibleForTesting static String readString ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Counter > S = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String s = input . nextLine ( ) ;
    Counter C = new Counter ( s ) ;
    S . add ( C ) ;
  }
  double [ ] dp = new double [ 26 ] ;
  int uniA = Character . MIN_VALUE ;
  for ( Counter s : S ) {
    for ( int i = 0 ;
    i < 26 ;
    i ++ ) {
      dp [ i ] = Math . min ( dp [ i ] , s . get ( ( char ) ( uniA + i ) ) ) ;
    }
  }
  String ans = "" ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    ans += ( char ) ( uniA + i ) * dp [ i ] ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
