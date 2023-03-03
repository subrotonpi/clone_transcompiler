public static String magic ( String first , String second , String [ ] arrange1 , String [ ] arrange2 ) throws IOException {
  String [ ] nums1 = arrange1 [ Integer . parseInt ( first ) - 1 ] . split ( "\\s+" ) ;
  Arrays . sort ( nums1 ) ;
  String [ ] nums2 = arrange2 [ Integer . parseInt ( second ) - 1 ] . split ( "\\s+" ) ;
  Arrays . sort ( nums2 ) ;
  List < Integer > numsBoth = new ArrayList < > ( ) ;
  for ( int num = 0 ;
  num < nums1 . length ;
  num ++ ) {
    if ( nums1 [ num ] . equals ( nums2 [ num ] ) ) {
      numsBoth . add ( Integer . parseInt ( nums1 [ num ] ) ) ;
    }
  }
  if ( numsBoth . size ( ) > 1 ) {
    return "Bad magician!" ;
  }
  else if ( numsBoth . size ( ) == 0 ) {
    return "Volunteer cheated!" ;
  }
  else {
    return Integer . toString ( numsBoth . get ( 0 ) ) ;
  }
}
