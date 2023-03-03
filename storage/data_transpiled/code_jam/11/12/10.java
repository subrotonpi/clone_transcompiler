static final int mask ( String word , String pattern ) {
  return word . contains ( pattern . charAt ( 0 ) ) ? Character . toUpperCase ( word . charAt ( 0 ) ) : '_' ;
}
