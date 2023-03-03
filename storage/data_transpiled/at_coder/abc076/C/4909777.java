public static void main ( String className ) {
  if ( className . equals ( "org.apache.hadoop.hbase.util.Scanner" ) ) {
    String hiddenKey = input . nextLine ( ) ;
    String flagString = input . nextLine ( ) ;
    int keyLength = hiddenKey . length ( ) ;
    int flagLength = flagString . length ( ) ;
    if ( keyLength < flagLength ) {
      System . out . println ( "UNRESTORABLE" ) ;
      exit ( ) ;
    }
    StringBuilder keyBuilder = new StringBuilder ( hiddenKey . replace ( '?' , 'a' ) ) ;
    for ( int i = 0 ;
    i < keyLength - flagLength + 1 ;
    i ++ ) {
      String partKey = hiddenKey . substring ( i , i + flagLength ) ;
      boolean isMatch = true ;
      for ( int j = 0 ;
      j < flagLength ;
      j ++ ) {
        if ( partKey . charAt ( j ) != '?' && partKey . charAt ( j ) != flagString . charAt ( j ) ) {
          isMatch = false ;
          break ;
        }
      }
      if ( isMatch ) {
        for ( int k = 0 ;
        k < flagLength ;
        k ++ ) {
          keyBuilder . append ( flagString . charAt ( k ) ) ;
        }
        System . out . println ( keyBuilder . toString ( ) ) ;
        break ;
      }
    }
    if ( ! isMatch ) {
      System . out . println ( "UNRESTORABLE" ) ;
    }
  }
}
