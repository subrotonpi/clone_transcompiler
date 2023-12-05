public static void main ( String [ ] args ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = N ;
  i < 1000 ;
  i ++ ) {
    int tmp = i % 10 ;
    String ans = "" ;
    int tugi = 0 ;
    boolean isOK = true ;
    for ( int j = 0 ;
    j < Integer . toString ( i ) . length ( ) ;
    j ++ ) {
      if ( j == 0 ) tugi = i ;
      int tmp2 = tugi % 10 ;
      tugi = tugi / 10 ;
      ans += Integer . toString ( tmp ) ;
      if ( tmp != tmp2 ) {
        isOK = false ;
        break ;
      }
    }
    if ( isOK == true ) {
      System . out . println ( ans ) ;
      System . exit ( 0 ) ;
    }
  }
}
