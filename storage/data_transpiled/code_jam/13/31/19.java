static final String [ ] getWordList ( ) throws IOException {
  String vowels = "aeiou" ;
  String consonants = "bcdfghjklmnpqrstvwxyz" ;
  Set < String > vowelSet = new LinkedHashSet < String > ( ) ;
  vowelSet . add ( vowels ) ;
  Set < String > consonantSet = new LinkedHashSet < String > ( ) ;
  consonantSet . add ( consonants ) ;
  /* single test */
  String name = IN . readLine ( ) ;
  String n = name . substring ( 0 , n ) ;
  n = Integer . parseInt ( n ) ;
  int L = name . length ( ) ;
  char [ ] data = new char [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) data [ i ] = vowelSet . contains ( name . charAt ( i ) ) ? 'v' : 'c' ;
  int [ ] starts = new int [ n ] ;
  int count = 0 ;
  for ( int i = 0 ;
  i < data . length ;
  i ++ ) {
    if ( data [ i ] == 'v' ) {
      count = 0 ;
    }
    else {
      count ++ ;
      if ( count >= n ) {
        starts [ count ] = i + 1 - n ;
      }
    }
  }
  List < FreeSpaceInfo > freespaces = new ArrayList < FreeSpaceInfo > ( ) ;
  int cs = 0 ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    while ( cs != - 1 && cs < starts . length && starts [ cs ] > i ) cs ++ ;
    if ( cs == starts . length ) cs = - 1 ;
    if ( cs == - 1 ) {
      if ( i < L ) freespaces . add ( new FreeSpaceInfo ( i , L - i ) ) ;
    }
    else {
      if ( starts [ cs ] + n - 1 > i ) freespaces . add ( new FreeSpaceInfo ( i , starts [ cs ] + n - 1 - i ) ) ;
    }
  }
  int result = ( L * ( L + 1 ) ) / 2 ;
  for ( FreeSpaceInfo f : freespaces ) result -= f . getWordList ( ) ;
  return result ;
}
