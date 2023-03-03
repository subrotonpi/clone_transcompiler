static final Collection < String > getCounts ( ) {
  List < String > w = new LinkedList < String > ( input ) ;
  Map < String , Integer > l = Generics . newHashMap ( w ) ;
  String ans = "Yes" ;
  for ( Integer v : l . values ( ) ) {
    if ( v % 2 == 1 ) {
      ans = "No" ;
    }
  }
  System . out . println ( ans ) ;
}
