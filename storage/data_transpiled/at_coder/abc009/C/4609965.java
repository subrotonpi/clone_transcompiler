public static String replace ( @ Nonnull String s , char a ) {
  StringBuilder sb = new StringBuilder ( s ) ;
  int i = sb . indexOf ( a ) ;
  sb . setCharAt ( 0 , sb . charAt ( i ) ) ;
  sb . setCharAt ( i , sb . charAt ( i ) ) ;
  return sb . toString ( ) ;
}
private void adopt ( @ Nonnull String s , @ Nonnull String s0 ) {
  int res = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . contains ( s0 . charAt ( i ) ) ) {
      res += s0 . charAt ( i ) ;
      s . charAt ( s . indexOf ( s0 . charAt ( i ) ) ) ;
    }
  }
  final StringBuilder rest = new StringBuilder ( s ) ;
  for ( int i = 0 ;
  i != res ;
  i ++ ) {
    if ( res . charAt ( i ) == 0 ) {
      res += rest . toString ( ) ;
    }
  }
}
public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  StringBuilder sb = new StringBuilder ( input ( ) ) ;
  final String s0 = sb . toString ( ) ;
  for ( int pos = 0 ;
  pos < s . length ( ) ;
  pos ++ ) {
    TreeSet < String > pq = new TreeSet < String > ( s . substring ( pos ) ) ;
    for ( String a : pq ) {
      String t = replace ( sb . toString ( ) , a ) . substring ( 1 ) ;
      t = adopt ( t , s0 . substring ( pos + 1 ) ) ;
      String ss = sb . toString ( ) . substring ( 0 , pos ) + a + t ;
      int kk = Integer . parseInt ( ss . substring ( pos + 1 ) ) ;
      if ( kk > K ) {
        continue ;
      }
      if ( t . length ( ) != 0 ) {
        sb . append ( ss ) ;
        break ;
      }
    }
  }
  System . out . println ( sb . toString ( ) ) ;
}
