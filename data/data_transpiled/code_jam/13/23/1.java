@ sys . stdout . write ( "\n" ) , stdin ) public static String [ ] [ ] readAllLines ( ) throws IOException {
  List < String [ ] > dict = Arrays . asList ( Files . readAllLines ( Paths . get ( "garbled_email_dictionary.txt" ) ) ) ;
  if ( false ) {
    for ( int w : xrange ( 6 ) ) {
      if ( solution [ a ] [ w ] <= n ) {
        print . println ( "*" + w + " " + solution [ a ] [ w ] ) ;
      }
    }
  }
  return Collections . min ( solution [ n - 1 ] ) ;
}
