private static final HashMap < Character , String > dictionary = new HashMap < Character , String > ( ) {
  {
    put ( 'a' , 'y' ) ;
    put ( 'b' , 'h' ) ;
    put ( 'c' , 'e' ) ;
    put ( 'd' , 's' ) ;
    put ( 'e' , 'o' ) ;
    put ( 'f' , 'c' ) ;
    put ( 'g' , 'v' ) ;
    put ( 'h' , 'x' ) ;
    put ( 'i' , 'd' ) ;
    put ( 'j' , 'u' ) ;
    put ( 'k' , 'i' ) ;
    put ( 'l' , 'g' ) ;
    put ( 'm' , 'l' ) ;
    put ( 'n' , 'b' ) ;
    put ( 'o' , 'k' ) ;
    put ( 'p' , 'r' ) ;
    put ( 'q' , 'z' ) ;
    put ( 'r' , 't' ) ;
    put ( 's' , 'n' ) ;
    put ( 't' , 'w' ) ;
    put ( 'u' , 'j' ) ;
    put ( 'v' , 'p' ) ;
    put ( 'w' , 'f' ) ;
    put ( 'x' , 'm' ) ;
    put ( 'y' , 'a' ) ;
    put ( 'z' , 'q' ) ;
  }
  private String [ ] processFile ( File file ) throws IOException {
    FileReader freader = new FileReader ( file ) ;
    String text = freader . readLine ( ) ;
    freader . close ( ) ;
    String [ ] lines = text . split ( "\n" ) ;
    return lines ;
  }
  private List < String > processLines ( String lines ) throws IOException {
    List < String > ans = new ArrayList < String > ( ) ;
    boolean first = true ;
    for ( String line : lines ) {
      if ( first == true ) {
        first = false ;
      }
      else {
        String trans = "" ;
        for ( int i = 0 ;
        i < line . length ( ) ;
        i ++ ) {
          if ( dictionary . containsKey ( line . charAt ( i ) ) ) {
            trans += dictionary . get ( line . charAt ( i ) ) ;
          }
          else {
            trans += line . charAt ( i ) ;
          }
        }
        if ( trans . length ( ) != 0 ) {
          ans . add ( trans ) ;
        }
      }
      