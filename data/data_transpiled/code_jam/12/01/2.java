static final String [ ] decrypt ( ) {
  String [ ] encrypted = {
    "ejp mysljylc kd kxveddknmc re jsicpdrysi" , "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd" , "de kr kd eoya kw aej tysr re ujdr lkgc jv" , "y qeez" }
    ;
    String [ ] decrypted = {
      "our language is impossible to understand" , "there are twenty six factorial possibilities" , "so it is okay if you want to just give up" , "a zooq" }
      ;
      HashMap < Character , String > mapping = new HashMap < Character , String > ( ) ;
      for ( int i = 0 ;
      i < encrypted . length ;
      i ++ ) {
        String [ ] enc = encrypted [ i ] . split ( " " ) ;
        String [ ] dec = decrypted [ i ] . split ( " " ) ;
        for ( int j = 0 ;
        j < dec . length ;
        j ++ ) {
          mapping . put ( enc [ j ] , dec [ j ] ) ;
        }
      }
      /* Use the string to get the string representation */
      StringBuffer dec = new StringBuffer ( ) ;
      for ( int j = 0 ;
      j < dec . length ( ) ;
      j ++ ) {
        dec . append ( mapping . get ( dec [ j ] ) ) ;
      }
      int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        String [ ] line = scanner . nextLine ( ) . split ( " " ) ;
        System . out . println ( "Case #" + ( i + 1 ) + ": " + dec . toString ( ) ) ;
      }
      return dec . toString ( ) . split ( " " ) ;
    }
    