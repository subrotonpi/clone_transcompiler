@ String ( filename = "A-large.in" ) public static void main ( String filename ) throws IOException {
  List < List < String >> data = Arrays . asList ( map ( line -> Integer . parseInt ( line . replaceAll ( " " , "" ) ) , map ( line -> line . replaceAll ( " " , "" ) ) ) ) ;
  int ll = 1 ;
  int qc = 1 ;
  while ( ll < data . size ( ) ) {
    int size = data . get ( ll ) . get ( 0 ) ;
    List < String > cells = data . subList ( ( ll + 1 ) , ( ll + 2 * size ) ) ;
    ll += 2 * size ;
    int center = size - 1 ;
    for ( int i = 0 ;
    i < cells . size ( ) ;
    i ++ ) {
      int k ;
      if ( i <= center ) k = i ;
      else k = - i + 2 * center ;
      for ( int j = 0 ;
      j < cells . get ( i ) . length ( ) - 1 ;
      j ++ ) cells . get ( i ) . add ( 2 * j + 1 , " " ) ;
      for ( int j = 0 ;
      j < size - k - 1 ;
      j ++ ) {
        cells . get ( i ) . add ( 0 , " " ) ;
        cells . get ( i ) . add ( " " ) ;
      }
    }
    int mx = 0 ;
    do {
      boolean flag = true ;
      for ( int j = 1 ;
      j <= center - mx ;
      j ++ ) {
        for ( int i = 0 ;
        i < 2 * size - 1 ;
        i ++ ) {
          if ( ( cells . get ( center - mx - j ) . get ( i ) != " " ) && ( cells . get ( center - mx - j ) . get ( i ) != cells . get ( center - mx + j ) . get ( i ) ) ) {
            flag = false ;
            break ;
          }
        }
        if ( flag == false ) break ;
      }
      if ( flag ) break ;
    }
    while ( mx != 0 ) ;
    if ( flag ) break ;
    mx ++ ;
  }
  int my = 0 ;
  do {
    boolean flag = true ;
    for ( int j = 1 ;
    j <= center - my ;
    j ++ ) {
      for ( int i = 0 ;
      i < 2 * size - 1 ;
      i ++ ) {
        if ( ( cells . get ( i ) . charAt ( center - my - j ) != " " ) && (