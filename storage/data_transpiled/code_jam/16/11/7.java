static final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int testcase = 0 ;
testcase < T ;
testcase ++ ) {
  System . out . println ( "Case #" + ( testcase + 1 ) + ":" ) ;
  String word = System . console ( ) . readLine ( ) ;
  int n = word . length ( ) ;
  String newword = "" ;
  boolean [ ] used = new boolean [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    used [ i ] = false ;
  }
  int end = n ;
  while ( end > 0 ) {
    String letter = "-" ;
    int pos = end ;
    for ( int i = 0 ;
    i < end ;
    i ++ ) {
      if ( word . charAt ( end - 1 - i ) > letter ) {
        letter = word . charAt ( end - 1 - i ) ;
        pos = end - 1 - i ;
      }
    }
    newword = newword + letter ;
    end = pos ;
    used [ pos ] = true ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ! used [ i ] ) {
      newword = newword + word . charAt ( i ) ;
    }
  }
  System . out . println ( newword ) ;
}
