public static final int [ ] [ ] getWordKeys ( ) throws IOException {
  File f1 = new File ( "c:\Temp\words.txt" ) ;
  String [ ] [ ] words = new String [ 12 ] [ ] ;
  for ( int ii = 0 ;
  ii < words . length ;
  ii ++ ) words [ ii ] = new String [ 12 ] ;
  int bufLen = 10 ;
  int minLength = 1 ;
  BufferedReader br = new BufferedReader ( new FileReader ( f1 ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    String S = br . readLine ( ) . trim ( ) ;
    Map < Integer , Integer > bestScoreMap = new HashMap < Integer , Integer > ( ) ;
    bestScoreMap . put ( new Integer ( 0 ) , 0 ) ;
    for ( int startIndex = 0 ;
    startIndex <= S . length ( ) ;
    startIndex ++ ) {
      Set < Integer > tmpKeys = bestScoreMap . keySet ( ) ;
      Set < Integer > keys = StreamSupport . stream ( tmpKeys , false ) . filter ( key -> key . intValue ( ) == startIndex ) . collect ( Collectors . toSet ( ) ) ;
      for ( int wordLen = minLength ;
      wordLen <= Math . min ( bufLen + 1 , S . length ( ) - startIndex + 1 ) ;
      wordLen ++ ) {
        for ( Integer word : words [ wordLen ] ) {
          List < Integer > clashes = new ArrayList < Integer > ( ) ;
          boolean Fail = false ;
          for ( int index = 0 ;
          index < wordLen ;
          index ++ ) {
            word . intValue ( ) ;
            if ( word . intValue ( ) != S . charAt ( startIndex + index ) ) {
              if ( clashes . size ( ) != 0 && index - clashes . size ( ) < 5 ) {
                Fail = true ;
                break ;
              }
              else {
                clashes . add ( index ) ;
              }
            }
          }
          int firstClash = startIndex + 5 ;
          int lastClash = startIndex + wordLen - 5 ;
          if ( ! Fail ) {
            if ( clashes . size ( ) != 0 ) {
              firstClash = clashes . get ( 0 ) + startIndex ;
              lastClash = clashes . get ( clashes . size ( ) - 1 ) + startIndex ;
            }
            Set < Integer > thisWordKeys = StreamSupport . stream ( keys ) . filter ( key -> key . intValue ( ) <= firstClash ) . collect ( Collectors . toSet