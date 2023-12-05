@ MoreRequires public static void main ( String [ ] args ) {
  final int a , b ;
  int ans ;
  a = ( Integer ) input . nextInt ( ) ;
  b = ( Integer ) input . nextInt ( ) ;
  if ( a == 1 ) {
    a = 14 ;
  }
  if ( b == 1 ) {
    b = 14 ;
  }
  if ( a > b ) {
    ans = "Alice" ;
  }
  else if ( a == b ) {
    ans = "Draw" ;
  }
  else {
    ans = "Bob" ;
  }
  System . out . println ( ans ) ;
}
