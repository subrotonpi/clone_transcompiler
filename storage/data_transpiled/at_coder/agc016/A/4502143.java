@ VisibleForTesting static void input ( ) {
  String S = input ( ) ;
  List < String > A = new ArrayList < > ( Collections . nCopies ( S , "" ) ) ;
  double ans = Double . POSITIVE_INFINITY ;
  for ( String a : A ) {
    int posi = - 1 ;
    double interval = 0 ;
    for ( int i = 0 ;
    i < S . length ( ) ;
    i ++ ) {
      if ( S . charAt ( i ) == a . charAt ( 0 ) ) {
        interval = Math . max ( interval , i - posi - 1 ) ;
        posi = i ;
      }
      if ( i == S . length ( ) - 1 ) {
        interval = Math . max ( interval , i - posi ) ;
        posi = i ;
      }
    }
    ans = Math . min ( ans , interval ) ;
  }
  System . out . println ( ans ) ;
}
