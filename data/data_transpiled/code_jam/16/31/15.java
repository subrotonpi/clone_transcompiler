public static String print ( File F ) throws IOException {
  File O = new File ( "A-large.in" ) ;
  int T = Integer . parseInt ( F . getCanonicalPath ( ) ) ;
  System . out . println ( T ) ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    int n = Integer . parseInt ( F . getCanonicalPath ( ) ) ;
    int [ ] store = ArrayUtil . toIntArray ( F . getCanonicalPath ( ) . split ( " " ) ) ;
    int x = Arrays . stream ( store ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
    char [ ] ans = new char [ n ] ;
    int maxi = 0 ;
    for ( int i = 0 ;
    i < x ;
    i ++ ) {
      maxi = Collections . max ( store ) ;
      int findex = - 1 ;
      int sindex = - 1 ;
      int q = Arrays . binarySearch ( store , n ) ;
      switch ( q ) {
        case 4 : for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( findex == - 1 && store [ j ] == maxi ) findex = j ;
          else if ( sindex == - 1 && store [ j ] == maxi ) sindex = j ;
        }
        if ( sindex != - 1 ) {
          store [ sindex ] -- ;
          store [ findex ] -- ;
          ans [ findex ] = ( char ) ( 'A' + findex ) + ( char ) ( 'A' + sindex ) ;
        }
        else {
          store [ findex ] -- ;
          ans [ findex ] ++ ;
        }
        break ;
        case 3 : for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( findex == - 1 && store [ j ] == maxi ) findex = j ;
        }
        store [ findex ] -- ;
        ans [ findex ] ++ ;
        break ;
        case 2 : for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( findex == - 1 && store [ j ] == maxi ) findex = j ;
          else if ( sindex == - 1 && store [ j ] == maxi ) sindex = j ;
        }
        if ( sindex != - 1 ) {
          store [ sindex ] -- ;
          store [ findex ] -- ;
          ans [ findex ] ++ ;
        }
        break ;
        default : break ;
      }
    }
    System . out . println ( ans ) ;
  }
  F . delete ( ) ;
  O