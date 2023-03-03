static final String [ ] [ ] maxSides ( final int k ) {
  final String [ ] [ ] p2 = pancakes ;
  final String base = p2 [ 0 ] ;
  final int len = p2 . length ;
  final List < Integer > sortedP2 = new ArrayList < > ( Arrays . asList ( p2 ) ) ;
  sortedP2 . sort ( new Comparator < Integer > ( ) {
    public int compare ( final Integer o1 , final Integer o2 ) {
      return o2 . compareTo ( o1 ) ;
    }
  }
  ) ;
  final List < Integer > ps = sortedP2 . subList ( 0 , k - 1 ) . prepend ( base ) ;
  int sum = 0 ;
  for ( final Integer p : ps ) {
    sum += p . intValue ( ) ;
  }
  return new String [ ] [ ] {
    {
      "" , "" }
      , {
        "" , "" }
      }
      ;
    }
    