static final List < String > list = Arrays . asList ( new String [ ] {
  "" }
  ) ;
  final int L = Integer . parseInt ( list . get ( 0 ) ) ;
  final int D = Integer . parseInt ( list . get ( 1 ) ) ;
  final int N = list . get ( 2 ) ;
  return new ArrayList < String > ( ) {
    private final List < Character > chars = new ArrayList < Character > ( ) ;
    @ Override public char [ ] tokenize ( String string ) {
      char [ ] chars = new char [ L ] ;
      while ( string . length ( ) > 0 ) {
        while ( string . charAt ( 0 ) == '(' ) {
          char a = string . charAt ( 1 ) ;
          char b = string . charAt ( 0 ) ;
          char c = string . charAt ( 1 ) ;
          chars . add ( a ) ;
          string = c ;
        }
        while ( string . length ( ) > 0 && string . charAt ( 0 ) != '(' ) {
          chars . add ( string . charAt ( 0 ) ) ;
          string = string . substring ( 1 ) ;
        }
        return chars . toArray ( ) ;
      }
      @ Override public int size ( ) {
        return N ;
      }
    }
    ;
  }
  