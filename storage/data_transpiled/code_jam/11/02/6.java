@ VisibleForTesting static LinkedHashMap < String , Integer > rins ( ) {
  return new LinkedHashMap < > ( ) {
    private final String [ ] values ;
    private final String [ ] combinations ;
    private final String [ ] combinationStrings ;
    private final String [ ] opposites ;
    private final String [ ] oppositeStrings ;
    private final String [ ] oppositeStrings ;
    {
      combinations = rins ( ) . split ( " " ) ;
      combinations = Integer . parseInt ( values [ 0 ] ) ;
      values = Arrays . copyOfRange ( values , 1 , combinations . length ) ;
      combinationStrings = Arrays . copyOfRange ( values , 0 , combinations . length ) ;
      values = Arrays . copyOfRange ( values , combinations . length ) ;
      opposites = Integer . parseInt ( values [ 0 ] ) ;
      values = Arrays . copyOfRange ( values , 1 , opposites . length ) ;
      oppositeStrings = Arrays . copyOfRange ( values , 0 , opposites . length ) ;
      values = Arrays . copyOfRange ( values , opposites . length ) ;
      invocation = Arrays . copyOfRange ( values , 1 , opposites . length ) ;
      return new Chemistry ( combinationStrings , oppositeStrings ) ;
    }
    private final class Chemistry {
      private final Map < String , Integer > combinations ;
      private final Map < String , Integer > opposites ;
      {
        this . combinations = new HashMap < > ( ) ;
        this . opposites = new HashMap < > ( ) ;
        this . combinations . putAll ( combinations ) ;
        this . opposites = new TreeMap < > ( ) ;
        this . opposites . putAll ( opposites ) ;
        final Iterator < String > iterator = opposites . iterator ( ) ;
        while ( iterator . hasNext ( ) ) {
          String a = iterator . next ( ) ;
          opposites . put ( a , 1 ) ;
          this . opposites . put ( b , 1 ) ;
        }
      }
    }
    @ Override public int solve ( Chemistry chemistry , List < String > invocation ) {
      Stack < String > stack = new Stack < > ( ) ;
      Map < String , Integer > counters = new HashMap < > ( ) ;
      for ( String element : invocation ) {
        stack . push ( element ) ;
        counters . put ( element , 1 ) ;
        while ( true ) {
          if ( stack . size ( ) < 2 ) break ;
          String mix = new LinkedHashSet < > ( stack . subList ( stack . size ( ) - 2 , stack . size ( ) ) ) ;
          if (