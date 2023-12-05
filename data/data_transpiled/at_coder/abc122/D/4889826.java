static final int [ ] getMatchingPatterns ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  final int MOD = 10 * 9 + 7 ;
  final String [ ] ng_patterns3 = {
    "AGC" , "ACG" , "GAC" }
    ;
    final String [ ] ng_patterns4 = {
      "AAGC" , "AACG" , "ATGC" , "AGAC" , "AGTC" , "AGGC" , "AGCA" , "AGCT" , "AGCG" , "AGCC" , "ACGA" , "ACGT" , "ACGG" , "ACGC" , "TAGC" , "TACG" , "TGAC" , "GAGC" , "GACA" , "GACT" , "GACG" , "GACC" , "GGAC" , "CAGC" , "CACG" , "CGAC" }
      ;
      {
        final Map < String , Integer > counts = new HashMap < > ( ) ;
        for ( final String li : Splitter . on ( "ATGC" ) . split ( "," ) ) {
          final String s = StringUtils . trimToEmpty ( li ) ;
          if ( ! ng_patterns3 [ s ] . equals ( s ) ) {
            counts . put ( s , 1 ) ;
          }
        }
        for ( int i = 3 ;
        i < n ;
        i ++ ) {
          final Map < String , Integer > newCounts = new HashMap < > ( ) ;
          for ( final String s : counts . keySet ( ) ) {
            newCounts . put ( s , 0 ) ;
          }
          for ( final Map . Entry < String , Integer > s3 : counts . entrySet ( ) ) {
            for ( final String c : "ATGC" . split ( "," ) ) {
              final String s4 = s3 . getKey ( ) + c ;
              if ( ! ng_patterns4 [ s4 . length ( ) ] . equals ( s4 ) ) {
                newCounts . put ( s4 . substring ( s4 . length ( ) - 3 ) , s3 . getValue ( ) % MOD ) ;
              }
            }
          }
          counts = newCounts . entrySet ( ) . toArray ( new Integer [ newCounts . size ( ) ] ) ;
        }
        System . out . println ( Arrays . deepToString ( counts . values ( ) ) % MOD ) ;
      }
      if ( getClass ( ) . equals ( "java.util.Scanner" ) ) {
        