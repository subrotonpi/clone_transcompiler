public static void input ( ) {
  String s = input . nextLine ( ) ;
  int n = s . length ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = i ;
    j < n ;
    j ++ ) {
      if ( Arrays . binarySearch ( "AGCT" , s . substring ( i , j + 1 ) ) >= 0 ) {
        ans = Math . max ( ans , j - i + 1 ) ;
      }
    }
  }
  System . out . println ( ans ) ;
}
