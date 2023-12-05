static int [ ] [ ] getInts ( final Reader iReader ) throws IOException {
  final int [ ] [ ] ints = new int [ 1 ] [ ] ;
  iReader . accept ( new FileReader ( "iReader.txt" ) ) ;
  return ints ;
}
