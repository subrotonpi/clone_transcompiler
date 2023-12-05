@ VisibleForTesting static Iterable < String > scanner ( ) {
  String [ ] ciphertexts = {
    "y qee" , "ejp mysljylc kd kxveddknmc re jsicpdrysi" , "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd" , "de kr kd eoya kw aej tysr re ujdr lkgc jv" }
    ;
    String [ ] plaintexts = {
      "a zoo" , "our language is impossible to understand" , "there are twenty six factorial possibilities" , "so it is okay if you want to just give up" }
      ;
      Set < Character > alphaSet = Sets . newHashSetWithExpectedSize ( 1 ) ;
      for ( char ch : ciphertexts ) {
        alphaSet . add ( Character . toLowerCase ( ch ) ) ;
      }
      Stream < String > z = Stream . of ( Arrays . asList ( plaintexts ) ) ;
      Map < Character , String > decoder = Maps . newTreeMap ( ) ;
      Set < Character > missingKeys = alphaSet . remove ( decoder . keySet ( ) ) ;
      Set < Character > missingValues = alphaSet . remove ( decoder . values ( ) ) ;
      assert missingKeys . size ( ) <= 1 ;
      assert missingValues . size ( ) <= 1 ;
      decoder . put ( missingKeys . iterator ( ) . next ( ) , missingValues . iterator ( ) . next ( ) ) ;
      int cases = Integer . parseInt ( scanner . nextLine ( ) ) ;
      for ( int c = 0 ;
      c < cases ;
      c ++ ) {
        String ct = scanner . nextLine ( ) . trim ( ) ;
        String pt = decoder . get ( ct ) ;
        System . out . println ( "Case #" + ( c + 1 ) + ": " + pt ) ;
      }
      return new Iterable < String > ( ) {
        @ Override public Iterator < String > iterator ( ) {
          return scanner . iterator ( ) ;
        }
      }
      ;
    }
    