@ VisibleForTesting static Iterable < String > product ( String input , String compress ) {
  int N = Integer . parseInt ( input ) ;
  String [ ] Ss = input . split ( " " ) ;
  String [ ] S1s = Arrays . copyOfRange ( Ss , 0 , N ) ;
  List < String > ptn1s = Arrays . stream ( S1s ) . map ( sels -> StringUtils . compress ( compress ( S1s , sels ) ) ) . collect ( toList ( ) ) ;
  Map < String , Integer > cnt1 = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < ptn1s . length ;
  i ++ ) {
    cnt1 . put ( ptn1s . get ( i ) , Integer . parseInt ( compress ( ptn1s , sels ) ) ) ;
  }
  String [ ] S2s = Arrays . copyOfRange ( Ss , N , S1s . length ) . toArray ( String [ ] :: new ) ;
  List < String > ptn2s = Arrays . stream ( S1s ) . map ( sels -> StringUtils . compress ( compress ( S2s , sels ) ) ) . collect ( toList ( ) ) ;
  Map < String , Integer > cnt2 = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < ptn2s . size ( ) ;
  i ++ ) {
    String ptn1 = ptn2s . get ( i ) ;
    int num1 = cnt1 . get ( i ) ;
    ans += num1 * cnt2 . get ( ptn1 ) ;
  }
  System . out . println ( ans ) ;
  return cnt1 ;
}
