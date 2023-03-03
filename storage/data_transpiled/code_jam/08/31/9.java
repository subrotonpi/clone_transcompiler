@ org . python . Method ( __doc__ = "Case #" + ( case + 1 ) + ": " + r ) ;
int ncases = Integer . parseInt ( stdin . readLine ( ) ) ;
for ( int testCase = 0 ;
testCase < ncases ;
testCase ++ ) {
  final int p = Integer . parseInt ( stdin . readLine ( ) ) ;
  final int k = Integer . parseInt ( stdin . readLine ( ) ) ;
  final int l = Integer . parseInt ( stdin . readLine ( ) ) ;
  final int [ ] freq = new int [ p ] ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    freq [ i ] = Integer . parseInt ( stdin . readLine ( ) ) ;
  }
  Arrays . sort ( freq ) ;
  Arrays . reverse ( freq ) ;
  int r = 0 ;
  for ( int i : xrange ( freq . length ) ) {
    r += freq [ i ] * ( i / k + 1 ) ;
  }
  System . out . println ( "Case #" + ( testCase + 1 ) + ": " + r ) ;
}
