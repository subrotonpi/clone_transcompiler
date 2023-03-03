public static void print ( ) {
  a = new LinkedList ( input ( ) ) ;
  for ( String i : input ( ) . split ( " " ) [ : : - 1 ] ) a . insert ( Integer . parseInt ( i ) , "\" " ) ; System . out . println ( Arrays . toString ( a ) ) ; }