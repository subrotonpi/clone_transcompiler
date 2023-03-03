static final Scanner getScanner ( ) {
  final Scanner in = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( in . nextLine ( ) ) ;
  final int K = Integer . parseInt ( in . nextLine ( ) ) ;
  final String S = in . nextLine ( ) . replace ( "\n" , "" ) ;
  final List < String > sortS = new ArrayList < > ( S ) ;
  Collections . sort ( sortS ) ;
  String T = "" ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final Map < String , Integer > count = new HashMap < > ( S . subList ( 0 , i + 1 ) ) ;
    count . put ( S , 0 , count . get ( T ) ) ;
    final int sum_ = Integer . valueOf ( count . values ( ) . iterator ( ) . next ( ) ) ;
    for ( String ss : sortS ) {
      int miss ;
      if ( ( ss != null ) && ( ss . length ( ) > 0 ) ) {
        miss = cnt + 1 ;
      }
      else {
        miss = cnt ;
      }
      if ( ( count . get ( ss ) > 0 ) && ( count . get ( ss ) > 0 ) ) {
        final int dif = sum_ - 1 ;
        if ( dif <= K ) {
          dif = sum_ ;
        }
        if ( ( miss + dif ) <= K ) {
          T += ss ;
          sortS . remove ( ss ) ;
          cnt = miss ;
          break ;
        }
      }
    }
  }
  System . out . println ( T ) ;
  return in ;
}
