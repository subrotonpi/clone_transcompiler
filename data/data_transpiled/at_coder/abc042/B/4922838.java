public static void main ( String input ) {
  N = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  L = Integer . parseInt ( input ) ;
  s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    s . add ( input ) ;
  }
  s . sort ( ) ;
  String ans = "" ;
  for ( int i = 0 ;
  i < s . size ( ) ;
  i ++ ) {
    ans += s . get ( i ) ;
  }
  System . out . println ( ans ) ;
}
