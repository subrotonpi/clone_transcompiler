private static Iterator < List < String >> data = new Iterator < List < String >> ( ) {
  @ Override public Iterator < String > iterator ( ) {
    return Files . lines ( Paths . get ( "A-large.in" ) ) . iterator ( ) ;
  }
}
