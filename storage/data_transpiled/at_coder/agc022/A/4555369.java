public static void main ( String [ ] args ) {
  final String alp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
  /* Enter your code here */
  String s = input ( ) ;
  if ( s . length ( ) < 26 ) {
    for ( int i = 0 ;
    i < alp . length ( ) ;
    i ++ ) {
      if ( ! s . equals ( alp . charAt ( i ) ) ) {
        System . out . println ( s + alp . charAt ( i ) ) ;
        return ;
      }
    }
  }
  if ( s . equals ( alp . substring ( 0 , alp . length ( ) - 1 ) ) ) {
    System . out . println ( - 1 ) ;
    return ;
  }
  final int L = s . length ( ) ;
  final String [ ] tmp = new String [ L ] ;
  for ( int i = 0 , ss = s . length ( ) ;
  i < tmp . length ;
  i ++ ) {
    tmp [ i ] = s . substring ( i , ss ) ;
    if ( tmp [ i ] . compareTo ( tt ) > 0 ) {
      System . out . println ( ans + tmp [ i ] ) ;
      break ;
    }
  }
}
