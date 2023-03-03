public static void main ( int N ) {
  N = Integer . parseInt ( input ( ) ) ;
  A = [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = input ( ) ;
  }
  System . out . println ( A . length - Integer . numberOfLeadingZeros ( A ) ) ;
}
