public static String print ( ) {
  s = list ( input ) ;
  StringBuilder ans = new StringBuilder ( ) ;
  for ( char x : new char [ ] {
    'A' , 'B' , 'C' , 'D' , 'E' , 'F' }
    ) {
      ans . append ( String . valueOf ( s . indexOf ( x ) ) ) ;
    }
    return ans . toString ( ) ;
  }
  