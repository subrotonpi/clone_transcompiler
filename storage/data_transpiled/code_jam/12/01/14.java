@ org . junit . experimental . theories . DataPoints public static int [ ] [ ] divide ( final java . util . Collection < java . lang . String > values ) {
  final java . util . Map < java . lang . String , java . lang . String > mem = new java . util . HashMap < java . lang . String , java . lang . String > ( ) ;
  java . util . Collections . addAll ( values , values ) ;
  @ org . junit . experimental . theories . DataPoints public java . lang . String getTask ( ) {
    return mem . get ( values ) ;
  }
  @ org . junit . experimental . theories . DataPoints public int getTask ( ) {
    return 0 ;
  }
  @ org . junit . experimental . theories . DataPoints public int getTask ( ) {
    return 0 ;
  }
  @ org . junit . experimental . theories . DataPoints public String getTask ( ) {
    return "TASK" ;
  }
}
