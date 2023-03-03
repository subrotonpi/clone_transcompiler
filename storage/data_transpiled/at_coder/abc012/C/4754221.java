public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int tar = 2025 - n ;
  ArrayList < ArrayList < Integer >> ans = new ArrayList < ArrayList < Integer >> ( ) ;
  for ( int i = 1 ;
  i <= 10 ;
  i ++ ) {
    for ( int j = 1 ;
    j <= 10 ;
    j ++ ) {
      if ( i * j == tar ) {
        ans . add ( new ArrayList < Integer > ( ) ) ;
      }
    }
  }
  for ( ArrayList < Integer > a : ans ) {
    System . out . println ( a . get ( 0 ) + "x" + a . get ( 1 ) ) ;
  }
}
