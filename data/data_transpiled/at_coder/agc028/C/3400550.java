public static int [ ] [ ] c ( ) {
  int [ ] [ ] not_c = new int [ n ] [ n ] ;
  Set < String > chosen = new HashSet < String > ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    not_c [ i ] = new int [ ] {
      Math . max ( a , b ) , i }
      ;
      c [ i ] [ 0 ] = Math . min ( a , b ) ;
      ans += Math . min ( a , b ) ;
      if ( a < b ) {
        chosen . add ( "a" ) ;
      }
      else if ( a > b ) {
        chosen . add ( "b" ) ;
      }
    }
    if ( chosen . size ( ) < 2 ) {
      System . out . println ( ans ) ;
    }
    else {
      Arrays . sort ( c ) ;
      Arrays . sort ( not_c ) ;
      int cCur = 1 ;
      int notCur = 1 ;
      if ( c [ 0 ] [ 1 ] != not_c [ 0 ] [ 1 ] ) {
        ans = ans - c [ 0 ] [ 0 ] + not_c [ 0 ] [ 0 ] ;
        cCur = 1 ;
        notCur = 1 ;
      }
      else {
        ans = Math . min ( ans - c [ 1 ] [ 0 ] + notc [ 0 ] [ 0 ] , ans - c [ 0 ] [ 0 ] + notc [ 1 ] [ 0 ] ) ;
        if ( ans - c [ 1 ] [ 0 ] + notc [ 0 ] [ 0 ] <= ans - c [ 0 ] [ 0 ] + notc [ 1 ] [ 0 ] ) {
          cCur = 2 ;
          notCur = 1 ;
        }
        else {
          cCur = 1 ;
          notCur = 2 ;
        }
      }
      if ( cCur < n && notCur < n ) {
        while ( c [ cCur ] [ 0 ] > notc [ notCur ] [ 0 ] ) {
          if ( c [ cCur ] [ 1 ] != notc [ notCur ] [ 1 ] ) {
            ans = ans - c [ cCur ] [ 0 ] + notc [ notCur ] [ 0 ] ;
            cCur ++ ;
            notCur ++ ;
          }
          else if ( cCur == n - 1 || notCur == n - 1 ) {
            break ;
          }
          else {
            ans = Math . min (