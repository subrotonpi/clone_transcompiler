public static String tidy ( String N ) {
  return Collections . sort ( N ) . equals ( new TreeSet < > ( ) ) ;
  /*if (N.equals("0")) return "";
  if (tidy(N) || N.length() <= 1) return N;
  return solve(Integer.toString(Integer.parseInt(N.substring(0, N.length()-1))-1))+"9";*/
  int T = Integer . parseInt ( input ( ) ) ;
  for ( int caseNumber = 1 ;
  caseNumber <= T ;
  caseNumber ++ ) {
    N = input ( ) ;
    System . out . println ( "Case #" + caseNumber + ":" + solve ( N ) ) ;
  }
  return solve ( N ) ;
}
