public static int [ ] readIntList ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > X = new ArrayList < Integer > ( ) ;
  Collections . sort ( X ) ;
  return X . toArray ( ) ;
}
