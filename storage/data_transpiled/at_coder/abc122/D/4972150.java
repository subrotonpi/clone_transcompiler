static final int [ ] getSequence ( int n ) {
  final String [ ] AGCs = {
    "AGC" , "GAC" , "ACG" , "AGAC" , "AGGC" , "AGTC" , "ACGC" , "ATGC" , }
    ;
    final String [ ] seq = {
      "A" , "G" , "C" , "T" }
      ;
      @ SuppressWarnings ( "unchecked" ) LinkedHashMap < String , Integer > memo = ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap < String , Integer > ) ( LinkedHashMap ) ( LinkedHashMap ) ( LinkedHashMap ) . putAll ( memo ) ;
      int count = 0 ;
      ArrayList < String > newS = new ArrayList < String > ( ) ;
      {
        for ( int i = 0 ;
        i < n ;
        i ++ ) {
          for ( Map . Entry < String , Integer > e : memo . entrySet ( ) ) {
            for ( char c : "AGCT" . toCharArray ( ) ) {
              String target = e . getKey ( ) + c ;
              if ( ArrayUtils . contains ( AGCs , target ) ) {
                continue ;
              }
              newS . add ( target . substring ( target . length ( ) - 3 ) ) ;
            }
          }
          memo = newS ;
          newS . clear ( ) ;
        }
      }
      ;
      return newS . toArray ( new String [ 0 ] ) ;
    }
    