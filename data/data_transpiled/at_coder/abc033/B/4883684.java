public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int max = 0 ;
  int sum = 0 ;
  String ans = "" ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String [ ] tmp = input . split ( " " ) ;
    sum += Integer . parseInt ( tmp [ 1 ] ) ;
    if ( Integer . parseInt ( tmp [ 1 ] ) > max ) {
      ans = tmp [ 0 ] ;
      max = Integer . parseInt ( tmp [ 1 ] ) ;
    }
  }
  if ( max > sum / 2 ) {
    System . out . println ( ans ) ;
  }
  else {
    System . out . println ( "atcoder" ) ;
  }
}
