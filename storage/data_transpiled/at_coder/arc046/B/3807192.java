public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  boolean ans = true ;
  if ( N > A ) {
    if ( A == B ) ans = N % ( A + 1 ) != 0 ;
    else ans = A > B ;
  }
  System . out . println ( new String [ ] {
    "Aoki" , "Takahashi" }
    [ ans ] ) ;
  }
  