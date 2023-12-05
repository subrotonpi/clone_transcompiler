@ System . out . println ( "Enter the number of characters in the input file" ) ;
Scanner input = new Scanner ( System . in ) ;
List < Integer > B = Lists . newArrayList ( ) ;
for ( String s : input . nextLine ( ) . split ( " " ) ) {
  B . add ( Integer . parseInt ( s ) ) ;
}
int n = Integer . parseInt ( input . nextLine ( ) ) ;
List < int [ ] > L = new ArrayList < int [ ] > ( ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  String a = input . nextLine ( ) ;
  a = a . substring ( 0 , a . length ( ) - 1 ) ;
  String c = "" ;
  for ( String st : a . split ( " " ) ) {
    c += B . indexOf ( Integer . parseInt ( st ) ) ;
  }
  L . add ( new int [ ] {
    Integer . parseInt ( c ) , a }
    ) ;
  }
  Collections . sort ( L ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( L . get ( i ) [ 1 ] ) ;
  }
  return L . get ( n ) [ 0 ] ;
}
