static final String getFilePath ( ) {
  String currDir = System . getProperty ( "user.dir" ) ;
  String srcfilename = currDir + File . separator + "C-large.in" ;
  String dstfilename = currDir + File . separator + "output.txt" ;
  /* solve the numbers */
  List < Integer > numbers = new ArrayList < Integer > ( numbers_ ) ;
  Map < Integer , Integer > memory = Maps . newHashMap ( ) ;
  for ( int k : numbers ) {
    memory . put ( k , k ) ;
  }
  for ( int r : xrange ( 2 , numbers . size ( ) ) ) {
    Iterable < Integer > combinations = Ints . asList ( numbers . get ( r ) ) ;
    for ( Integer combination : combinations ) {
      int s = Integer . valueOf ( combination ) ;
      if ( memory . containsKey ( s ) ) {
        Integer r1 = memory . get ( s ) ;
        Integer r2 = combination ;
        return r1 + r2 ;
      }
      memory . put ( s , combination ) ;
    }
  }
  / * ▁ if ▁ ( Class . isAnnotationPresent ( Test . class ) ) ▁ {
    STRNEWLINE ▁ try ▁ {
      STRNEWLINE ▁ InputStream ▁ in ▁ = ▁ new ▁ FileInputStream ( srcfilename ) ;
      STRNEWLINE ▁ FileOutputStream ▁ outp ▁ = ▁ new ▁ FileOutputStream ( dstfilename ) ;
      STRNEWLINE ▁ BufferedReader ▁ br ▁ = ▁ new ▁ BufferedReader ( STRNEWLINE ▁ new ▁ InputStreamReader ( in ) ) ;
      STRNEWLINE ▁ int ▁ count ▁ = ▁ Integer . valueOf ( br . readLine ( ) ) ;
      STRNEWLINE ▁ StringBuilder ▁ sb ▁ = ▁ new ▁ StringBuilder ( ) ;
      STRNEWLINE ▁ for ▁ ( int ▁ i ▁ : ▁ xrange ( count ) ) ▁ {
        STRNEWLINE ▁ String ▁ line ▁ = ▁ br . readLine ( ) ;
        STRNEWLINE ▁ int ▁ numbers ▁ = ▁ Integer . valueOf ( line ) ;
        STRNEWLINE ▁ numbers . remove ( 0 ) ;
        STRNEWLINE ▁ int ▁ result ▁ = ▁ solve ( numbers ) ;
        STRNEWLINE ▁ if ▁ ( result ▁ = = ▁ 0 ) ▁ {
          STRNEWLINE ▁ sb . append ( "Case #" ) . append ( i + 1 ) . append ( ": Impossible\n" ) ;
          STRNEWLINE ▁ }
          STRNEWLINE ▁ int ▁ r1 ▁ = ▁ result ;
          STRNEWLINE ▁ int ▁ r2 ▁ = ▁ result ;
          STRNEWLINE ▁ sb . append ( "Case #" ) . append ( i + 1 ) . append ( ":\n" ) ;
          STRNEWLINE ▁ sb . append ( StringUtil . repeat ( r1 , ▁ r1 ) ) . append ( "\n" )