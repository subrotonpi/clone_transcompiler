@ VisibleForTesting static int [ ] [ ] run ( String TEST ) {
  final String IN = "C-" + TEST + ".in" ;
  final String OUT = "C-" + TEST + ".out" ;
  int cnt [ ] [ ] = new int [ ] [ ] {
    {
      TEST , TEST , TEST }
      , {
        IN , TEST , TEST }
        , {
          OUT , TEST , TEST }
        }
        ;
        try ( BufferedReader fin = new BufferedReader ( new FileReader ( OUT ) ) ;
        BufferedWriter fout = new BufferedWriter ( new OutputStreamWriter ( fout ) ) ) {
          int t = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
          for ( int i = 0 ;
          i < t ;
          i ++ ) {
            int n = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
            String [ ] topics = new String [ n ] ;
            for ( int j = 0 ;
            j < n ;
            j ++ ) {
              topics [ j ] = null ;
            }
            for ( int j = 0 ;
            j < n ;
            j ++ ) {
              String s = fin . readLine ( ) . trim ( ) ;
              int res = run ( topics ) ;
              System . out . println ( "Case #" + i + 1 + ": " + res ) ;
              System . out . println ( "Case #" + i + 1 + ": " + res ) ;
            }
          }
        }
        catch ( Exception e ) {
          e . printStackTrace ( ) ;
        }
        if ( args . length == 0 ) {
          main ( ) ;
        }
        else {
          List < String > path = new ArrayList < String > ( ) ;
          path . add ( "" ) ;
          String s = "" ;
          int x = dst ;
          while ( x != src ) {
            s = par . get ( x ) ;
            path . add ( s ) ;
          }
          return Collections . reverse ( path ) ;
        }
      }
      