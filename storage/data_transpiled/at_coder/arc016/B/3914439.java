static final int [ ] getSequenceOfDigits ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] array = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    array [ i ] = input . nextLine ( ) ;
  }
  int ans = Integer . parseInt ( array [ 0 ] ) ;
  array = new String [ 9 ] ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    String seq = list ( array [ i ] ) ;
    ans += seq . length ( ) ;
  }
  System . out . println ( ans ) ;
}
