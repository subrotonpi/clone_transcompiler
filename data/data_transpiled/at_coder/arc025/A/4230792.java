public static void main ( String input ) {
  double [ ] D = input . split ( " " ) ;
  double [ ] J = input . split ( " " ) ;
  double ans = 0 ;
  for ( int d = 0 ;
  d < D . length ;
  d ++ ) {
    ans += Math . max ( D [ d ] , J [ j ] ) ;
  }
  System . out . println ( ans ) ;
}
