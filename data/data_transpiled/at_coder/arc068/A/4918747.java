@ MoreRequires public static void main ( String [ ] args ) {
  final int x = Integer . parseInt ( input ( args ) . replaceAll ( " " , "" ) ) ;
  final int ans ;
  if ( x <= 6 ) {
    ans = 1 ;
  }
  else if ( x <= 11 ) {
    ans = 2 ;
  }
  else {
    if ( ( x % 11 ) == 0 ) {
      ans = ( x / 11 ) * 2 ;
    }
    else if ( ( x % 11 ) <= 6 ) {
      ans = ( x / 11 ) * 2 + 1 ;
    }
    else {
      ans = ( x / 11 ) * 2 + 2 ;
    }
  }
  System . out . println ( ans ) ;
}
