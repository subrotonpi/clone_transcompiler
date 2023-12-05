@ Sys public static void main ( String [ ] args ) throws IOException {
  BufferedReader in = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
  int cases = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int i = 0 ;
  i < cases ;
  i ++ ) {
    int n = Integer . parseInt ( in . readLine ( ) ) ;
    List < Integer > [ ] needed = new List [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      needed [ j ] = new List < Integer > ( Integer . parseInt ( in . readLine ( ) ) ) ;
    }
    int games = 0 ;
    int stars = 0 ;
    int [ ] earned = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      earned [ j ] = new Integer ( in . readLine ( ) ) ;
    }
    boolean toobad = false ;
    games = 0 ;
    while ( stars < 2 * n ) {
      int level = 0 ;
      int earn = 0 ;
      int mostNeeded = - 1 ;
      boolean spam = true ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( stars >= needed [ j ] . intValue ( ) && earned [ j ] == 0 ) {
          level = j ;
          earn = 2 ;
          break ;
        }
        else if ( stars >= needed [ j ] . intValue ( ) && earned [ j ] == 1 ) {
          level = j ;
          earn = 1 ;
          spam = false ;
        }
        else if ( spam && stars >= needed [ j ] . intValue ( ) && earned [ j ] == 0 && needed [ j ] . intValue ( ) > mostNeeded ) {
          level = j ;
          earn = 1 ;
          mostNeeded = needed [ j ] . intValue ( ) ;
        }
      }
      if ( earn == 2 ) {
        earned [ level ] = 2 ;
        stars += 2 ;
      }
      else if ( earn == 1 ) {
        earned [ level ] ++ ;
        stars ++ ;
      }
      else {
        toobad = true ;
        break ;
      }
      games ++ ;
    }
    if ( toobad ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": Too Bad" ) ;
    }
    else {
      System . out . println ( "Case #" + ( i + 1 ) + ": " + games ) ;
    }
  }
}
