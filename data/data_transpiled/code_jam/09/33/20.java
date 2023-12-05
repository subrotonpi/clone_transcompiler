static final void solve ( ) throws IOException {
  psyco . full ( ) ;
  class Memoize {
    private Memoize ( Function function ) {
      private Memoize ( Function function ) {
        this . function = function ;
        this . memoized = new Memoize ( ) {
          @ Override public Memoize ( Object ... args ) {
            if ( ! memoized . containsKey ( args [ 0 ] ) ) {
              memoized . put ( args [ 0 ] , function . apply ( args [ 1 ] ) ) ;
            }
            return function . memoized ;
          }
        }
        ;
      }
      private List < String > allPerms ( String str ) {
        if ( str . length ( ) <= 1 ) {
          List < String > list = new ArrayList < > ( ) ;
          for ( List < String > perm : allPerms ( str . substring ( 1 ) ) ) {
            for ( int i = 0 ;
            i < perm . size ( ) + 1 ;
            i ++ ) {
              list . add ( perm . subList ( 0 , i ) + str . substring ( 0 , 1 ) + perm . subList ( i , perm . size ( ) ) ) ;
            }
          }
          return list ;
        }
      }
      private int solve ( int P , int Q ) {
        int min = P * Q ;
        for ( List < String > perm : allPerms ( Q ) ) {
          boolean [ ] prisons = new boolean [ P + 1 ] ;
          Arrays . fill ( prisons , true ) ;
          int sum = 0 ;
          for ( int rel : perm ) {
            prisons [ rel ] = false ;
            int i = rel + 1 ;
            while ( i <= P && prisons [ i ] ) {
              sum ++ ;
              i ++ ;
            }
            i = rel - 1 ;
            while ( i > 0 && prisons [ i ] ) {
              sum ++ ;
              i -- ;
            }
          }
          if ( sum < min ) {
            min = sum ;
          }
        }
        return min ;
      }
    }
    @ SuppressWarnings ( "unused" ) int [ ] result = new int [ ] {
      min }
      ;
      long startTime = System . currentTimeMillis ( ) ;
      PrintStream output = new PrintStream ( "d:/gcj/output" ) ;
      BufferedReader data = new BufferedReader ( new FileReader ( "d:/gcj/in" ) ) ;
      int Cases = Integer . parseInt ( data . readLine ( ) ) ;
      for ( int testCase = 1 ;
      testCase <= Cases ;
      testCase ++ ) {
        int P = data . getInt ( testCase ) ;
        String s = "Case #" + testCase + ": "