public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] W = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    W [ i ] = input . charAt ( i ) ;
  }
  HashMap < String , Boolean > dic = new HashMap < String , Boolean > ( ) ;
  dic . put ( W [ 0 ] , true ) ;
  for ( int i = 1 ;
  i < W . length ;
  i ++ ) {
    if ( W [ i ] [ 0 ] != W [ i - 1 ] [ W . length - 1 ] || dic . containsKey ( W [ i ] ) ) {
      System . out . println ( i % 2 == 1 ? "WIN" : "LOSE" ) ;
      break ;
    }
    dic . put ( W [ i ] , true ) ;
  }
  else {
    System . out . println ( "DRAW" ) ;
  }
}
