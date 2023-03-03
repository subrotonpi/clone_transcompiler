public static void dfs ( String x , int len_x , int i ) {
  if ( i < len_x ) {
    dfs ( x , len_x , i + 1 ) ;
  }
  if ( i < len_x ) {
    x = x . substring ( 0 , i + 1 ) + "+" + x . substring ( i + 1 ) ;
    dfs ( x , len_x + 1 , i + 2 ) ;
    ans += Integer . parseInt ( x ) ;
  }
  String s = input . nextLine ( ) ;
  dfs ( s , s . length ( ) - 1 ) ;
  System . out . println ( ans + Integer . parseInt ( s ) ) ;
}
