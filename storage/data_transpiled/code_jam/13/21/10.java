static private void emit ( String text , Object ... args ) {
  String msg = String . format ( text , args ) ;
  System . err . println ( msg ) ;
  System . out . println ( msg ) ;
}
