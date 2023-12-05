static void main ( String ifn , String ofn ) throws Exception {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  try ( BufferedReader inf = new BufferedReader ( new FileReader ( ifn ) ) ;
  BufferedWriter ouf = new BufferedWriter ( new FileWriter ( ofn ) ) ) {
    int noc = Integer . parseInt ( inf . readLine ( ) ) ;
    for ( int tnoc : xrange ( 1 , noc + 1 ) ) {
      ouf . write ( "Case #" + tnoc + ": " ) ;
      System . out . println ( "Case #" + tnoc + ": " ) ;
      int n = Integer . parseInt ( inf . readLine ( ) ) ;
      List < Integer > a = map ( Integer . parseInt , inf . readLine ( ) . trim ( ) ) ;
      int answer = 0 ;
      while ( a . size ( ) > 0 ) {
        int target = Collections . min ( a ) ;
        int ind = a . indexOf ( target ) ;
        answer += Math . min ( ind , Math . abs ( ind - ( a . size ( ) - 1 ) ) ) ;
        a . remove ( target ) ;
      }
      ouf . write ( answer + "\n" ) ;
      System . out . println ( answer ) ;
    }
  }
}
