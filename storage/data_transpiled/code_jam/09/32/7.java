@ Sys public static double [ ] [ ] solve ( ) {
  final int cases = Integer . parseInt ( stdin . readLine ( ) ) ;
  for ( int caseNo = 1 ;
  caseNo <= cases ;
  caseNo ++ ) {
    final int flyCount = Integer . parseInt ( stdin . readLine ( ) ) ;
    final int [ ] flies = new int [ flyCount ] ;
    for ( int flyNo = 0 ;
    flyNo <= flyCount ;
    flyNo ++ ) {
      flies [ flyNo ] = Integer . parseInt ( stdin . readLine ( ) ) ;
    }
    final double [ ] [ ] vecSub = new int [ flyCount ] [ ] ;
    for ( int flyNo = 0 ;
    flyNo <= flyCount ;
    flyNo ++ ) {
      flies [ flyNo ] = Integer . parseInt ( stdin . readLine ( ) ) ;
    }
    final double [ ] vecDot = new double [ flyCount ] [ ] ;
    for ( int flyNo = 0 ;
    flyNo <= flyCount ;
    flyNo ++ ) {
      flies [ flyNo ] = Integer . parseInt ( stdin . readLine ( ) ) ;
    }
    final double [ ] [ ] vecScale = new double [ flyCount ] [ ] ;
    for ( int flyNo = 0 ;
    flyNo <= flyCount ;
    flyNo ++ ) {
      flies [ flyNo ] = Integer . parseInt ( stdin . readLine ( ) ) ;
    }
    final double [ ] [ ] result = new double [ cases ] [ ] ;
    for ( int flyNo = 0 ;
    flyNo <= flyCount ;
    flyNo ++ ) {
      result [ flyNo ] = Integer . parseInt ( stdin . readLine ( ) ) ;
    }
    return result ;
  }
  return null ;
}
