@ VisibleForTesting static boolean mare ( String s1 , String s2 ) throws IOException {
  if ( s1 . length ( ) > s2 . length ( ) ) return true ;
  if ( s1 . length ( ) < s2 . length ( ) ) return false ;
  return s1 . compareTo ( s2 ) > 0 ;
}
