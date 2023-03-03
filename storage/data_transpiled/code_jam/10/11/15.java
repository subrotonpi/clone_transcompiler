static int find ( char col , char b , char brd [ ] [ ] ) {
  return findV ( col , b , brd ) || findH ( col , b , brd ) || findTL ( col , b , brd ) || findTR ( col , b , brd ) ;
}
