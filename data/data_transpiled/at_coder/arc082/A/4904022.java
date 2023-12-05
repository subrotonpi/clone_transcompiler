@ VisibleForTesting static int max ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] As = Ints . fromArray ( input . nextLine ( ) . split ( " " ) ) ;
  Map < Integer , Integer > counts = new HashMap < > ( ) ;
  for ( int a : As ) {
    counts . put ( a - 1 , 1 ) ;
    counts . put ( a , 1 ) ;
  }
  System . out . println ( max ( counts . values ( ) ) ) ;
  return N ;
}
