public static String input ( ) {
  int s = 0 ;
  int e = 1 ;
  ArrayList < String > split_S = new ArrayList < String > ( ) ;
  for ( int i = 1 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i - 1 ) == S . charAt ( i ) ) {
      e ++ ;
    }
    else {
      split_S . add ( S . substring ( s , e ) ) ;
      s = e ;
      e = e + 1 ;
    }
  }
  split_S . add ( S . substring ( s , e ) ) ;
  StringBuffer ans = new StringBuffer ( ) ;
  for ( String s : split_S ) {
    ans . append ( s . charAt ( 0 ) + s . length ( ) ) ;
  }
  System . out . println ( ans ) ;
  return ans . toString ( ) ;
}
