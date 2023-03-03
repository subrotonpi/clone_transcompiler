public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  for ( int caseNo = 1 ;
  caseNo <= n ;
  caseNo ++ ) {
    n = Integer . parseInt ( input ) ;
    String [ ] words = new String [ n ] ;
    for ( int i = 0 ;
    i < words . length ;
    i ++ ) words [ i ] = input . trim ( ) ;
    List < List < Integer >> accs = new ArrayList < > ( ) ;
    for ( String word : words ) {
      List < Integer > acc = new ArrayList < > ( ) ;
      for ( int i = 0 ;
      i < word . length ( ) ;
      i ++ ) {
        if ( i > 0 && word . charAt ( i ) == word . charAt ( i - 1 ) ) acc . get ( acc . size ( ) - 1 ) . add ( 1 ) ;
        else acc . add ( new Integer ( word . charAt ( i ) ) ) ;
        acc . add ( new Integer ( word . charAt ( i ) ) ) ;
        acc . add ( new Integer ( 1 ) ) ;
      }
      accs . add ( acc ) ;
    }
    int [ ] acclens = new Integer [ accs . size ( ) ] ;
    for ( int i = 0 ;
    i < acclens . length ;
    i ++ ) acclens [ i ] = accs . get ( i ) . size ( ) ;
    boolean fail = CollectionUtils . isNegativeArrayZero ( acclens ) ;
    int answer = 0 ;
    if ( ! fail ) {
      for ( int i = 0 ;
      i < acclens . length ;
      i ++ ) {
        if ( CollectionUtils . isNegativeArrayZero ( acclens [ i ] ) ) {
          fail = true ;
          break ;
        }
        List < Integer > nums = new ArrayList < > ( ) ;
        for ( List < Integer > acc : accs ) nums . add ( acc . get ( i ) . intValue ( ) ) ;
        Collections . sort ( nums ) ;
        int total = 0 ;
        for ( int num : nums ) total += Math . abs ( num - nums . get ( nums . size ( ) / 2 ) ) ;
        answer += total ;
      }
    }
    if ( fail ) System . out . println ( "Case #" + caseNo + ": Fegla Won" ) ;
    else System . out . println ( "Case #" + caseNo + ": " + answer ) ;
  }
}
