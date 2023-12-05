static final HeapPriorityQueue < String > create ( ) {
  final int l = 0 ;
  int d = 0 ;
  List < String > words = null ;
  class Case {
    int i ;
    String string ;
    @ Override public int size ( ) {
      return s . size ( ) ;
    }
    @ Override public String solve ( ) {
      return string ;
    }
    @ Override public int size ( ) {
      return s . size ( ) ;
    }
    @ Override public int size ( ) {
      return s . size ( ) ;
    }
    @ Override public int compare ( String s , String s ) {
      return s . indexOf ( "(" ) ;
    }
    @ Override public String toString ( ) {
      return s . substring ( 0 , s . indexOf ( ")" ) + s . length ( ) ) ;
    }
    @ Override public int size ( ) {
      return s . length ( ) ;
    }
    @ Override public int compare ( String s , String s ) {
      int pos = 0 ;
      int index = 0 ;
      List < String > words_clone = words . subList ( 0 , words . size ( ) ) ;
      while ( pos < s . length ( ) ) {
        if ( s . charAt ( pos ) == '(' ) {
          List < String > possibleLetterList = parsePossibles ( pos ) ;
          words_clone = stream ( words_clone ) . filter ( x -> possibleLetterList . contains ( x . charAt ( index ) ) ) . collect ( toList ( ) ) ;
          pos = s . indexOf ( ")" , pos ) + 1 ;
          index ++ ;
        }
        else {
          words_clone = stream ( words_clone ) . filter ( x -> x . charAt ( index ) . equals ( s . charAt ( pos ) ) ) . collect ( toList ( ) ) ;
          pos ++ ;
          index ++ ;
        }
      }
      return words_clone . size ( ) ;
    }
    @ Override public List < String > parsePossibles ( String s ) {
      return Arrays . asList ( s . substring ( pos + 1 , s . indexOf ( ")" ) ) ;
    }
    @ Override public String toString ( ) {
      return "Problem A Case " + s . substring ( 0 , s . indexOf ( ")" ) ;
    }
  }
  class Contents {
    public List < String > read ( InputStream in ) throws IOException {
      List < String > data = Arrays . asList ( s . substring ( s . indexOf ( ")" ) ) ;
      int i = 0 ;
      return data ;
    }
    @ Override public String toString ( ) {
      return "Problem A Case " + s . substring (