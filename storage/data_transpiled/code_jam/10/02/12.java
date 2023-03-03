@ org . python . Method ( __doc__ = "" ) public static org . python . Object from ( ) {
  final org . python . Object [ ] args = new org . python . Object [ ] {
    gcj . class }
    ;
    final org . python . Object IN = new org . python . Object ( ) {
      int number = 0 ;
      @ java . lang . Override public String toString ( ) {
        return "Case #" + number + ":" ;
      }
      @ java . lang . Override public org . python . Object line ( ) {
        String line = IN . readLine ( ) ;
        return line . trim ( ) ;
      }
      @ java . lang . Override public org . python . Object [ ] splitline ( ) {
        String line = IN . readLine ( ) ;
        return Arrays . copyOf ( line . split ( " " ) , args . length ) ;
      }
    }
    ;
    return args ;
  }
  