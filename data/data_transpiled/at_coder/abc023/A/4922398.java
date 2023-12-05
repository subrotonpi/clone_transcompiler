public static List < Integer > digit ( int i , @ NotNull List < Integer > list ) {
  if ( i > 0 ) {
    list . add ( i % 10 ) ;
    return digit ( i / 10 , list ) ;
  }
  else {
    Collections . reverse ( list ) ;
    return list ;
  }
}
