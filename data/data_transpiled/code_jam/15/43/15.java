static void place ( int english_bag , int french_bag , Set < Integer > [ ] ambi , int i ) {
  final Integer [ ] mi = {
    null }
    ;
    {
      if ( i < ambi . length ) {
        if ( mi [ 0 ] != null && mi [ 0 ] < english_bag & french_bag . length ) {
          return ;
        }
        a = place ( english_bag | ambi [ i ] , french_bag , ambi , i + 1 ) ;
        b = place ( english_bag , french_bag | ambi [ i ] , ambi , i + 1 ) ;
      }
      else {
        final int conf = english_bag & french_bag . length ;
        if ( mi [ 0 ] == null || conf < mi [ 0 ] ) {
          mi [ 0 ] = conf ;
        }
      }
    }
    if ( Class . isEnum ( "java.util.EnumSet" ) ) {
      for ( int test_case = 0 ;
      test_case < Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      test_case ++ ) {
        System . console ( ) . print ( "Case #" + ( test_case + 1 ) + ": " ) ;
        final int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
        final Set < Integer > english = new HashSet < Integer > ( ) ;
        final Set < Integer > french = new HashSet < Integer > ( ) ;
        ambi = new HashSet < Integer > ( ) ;
        mi [ 0 ] = null ;
        for ( int j = 0 ;
        j < n - 2 ;
        j ++ ) {
          ambi . add ( new HashSet < Integer > ( ) ) ;
        }
        place ( english , french , ambi , 0 ) ;
        System . out . println ( mi [ 0 ] ) ;
      }
    }
  }
  