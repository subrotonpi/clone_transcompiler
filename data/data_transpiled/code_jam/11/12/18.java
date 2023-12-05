public static final void main ( String [ ] args ) throws IOException {
  FileWriter output = null ;
  if ( args . length == 3 ) {
    output = new FileWriter ( args [ 2 ] ) ;
  }
  BufferedReader input = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
  for ( int n = 0 ;
  n < Integer . parseInt ( input . readLine ( ) ) ;
  n ++ ) {
    int nWords = Integer . parseInt ( input . readLine ( ) ) ;
    int nLists = Integer . parseInt ( input . readLine ( ) ) ;
    List < String > words = new ArrayList < String > ( nWords ) ;
    for ( int i = 0 ;
    i < nWords ;
    i ++ ) {
      words . add ( input . readLine ( ) ) ;
    }
    List < String > result = new ArrayList < String > ( nLists ) ;
    for ( int i = 0 ;
    i < nLists ;
    i ++ ) {
      List < String > llist = input . readLine ( ) . split ( " " ) ;
      int bestScore = - 1 ;
      String bestWord = "" ;
      for ( String w : words ) {
        StringBuilder template = new StringBuilder ( w . length ( ) ) ;
        int score = 0 ;
        for ( char ch : llist ) {
          if ( ! template . toString ( ) . contains ( "_" ) ) {
            break ;
          }
          boolean matches = false ;
          for ( String w2 : words ) {
            if ( w2 . length ( ) != template . length ( ) ) {
              continue ;
            }
            boolean flag = true ;
            try {
              w2 . indexOf ( ch ) ;
            }
            catch ( Exception e ) {
              flag = false ;
            }
            if ( ! flag ) {
              continue ;
            }
            for ( int i2 = 0 ;
            i2 < w2 . length ( ) ;
            i2 ++ ) {
              if ( ( template . charAt ( i2 ) != '_' && template . charAt ( i2 ) != '_' ) || ( template . charAt ( i2 ) == '_' && llist . indexOf ( w2 . charAt ( i2 ) ) != - 1 ) ) {
                flag = false ;
                break ;
              }
            }
            if ( ! flag ) {
              continue ;
            }
            matches = true ;
            break ;
          }
          if ( matches ) {
            try {
              w . indexOf ( ch ) ;
              for ( int i2 = 0 ;
              i2 < w . length ( ) ;
              i2 ++ ) {
                if ( w . charAt ( i2 ) == ch ) {
                  template . setCharAt ( i2 , ch ) ;
                }
              }
            }
            catch ( Exception e ) {
              score ++ ;
            }
          }
          