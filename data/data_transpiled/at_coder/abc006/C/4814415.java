public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int rem = M % 4 ;
  switch ( rem ) {
    case 0 : if ( M / 4 <= N && N <= M / 2 ) {
      System . out . println ( M / 2 - ( M / 2 - N ) * 2 + 0 + M / 2 - N ) ;
    }
    else {
      System . out . println ( "-1 -1 -1" ) ;
    }
    break ;
    case 1 : if ( M / 4 + 1 <= N && N <= M / 2 ) {
      System . out . println ( M / 2 - ( M / 2 - N ) * 2 - 1 + 1 + M / 2 - N ) ;
    }
    else {
      System . out . println ( "-1 -1 -1" ) ;
    }
    break ;
    case 2 : if ( M / 4 + 1 <= N && N <= M / 2 ) {
      System . out . println ( M / 2 - ( M / 2 - N ) * 2 + 0 + M / 2 - N ) ;
    }
    else {
      System . out . println ( "-1 -1 -1" ) ;
    }
    break ;
    case 3 : if ( M / 4 + 1 <= N && N <= M / 2 ) {
      System . out . println ( M / 2 - ( M / 2 - N ) * 2 - 1 + 1 + M / 2 - N ) ;
    }
    else {
      System . out . println ( "-1 -1 -1" ) ;
    }
    break ;
  }
}
