public static int A = Integer . parseInt ( input ) {
  int amari = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > amaris = new ArrayList < Integer > ( ) ;
  boolean flag = false ;
  int count = 1 ;
  int tmp = A ;
  do {
    amari = tmp % B ;
  }
  while ( C == amari ) ;
  if ( amaris . contains ( amari ) ) {
    break ;
  }
  amaris . add ( amari ) ;
  count ++ ;
  tmp = A * count ;
}
