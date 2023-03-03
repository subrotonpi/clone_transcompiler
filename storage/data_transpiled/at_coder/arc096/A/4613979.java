static final int input ( ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  int c = Integer . parseInt ( input ( ) ) ;
  int x = Integer . parseInt ( input ( ) ) ;
  int y = Integer . parseInt ( input ( ) ) ;
  int price = 0 ;
  int another = Integer . MAX_VALUE ;
  if ( 2 * c < a + b ) {
    price += 2 * c * Math . min ( x , y ) ;
    another = 2 * c ;
  }
  return price > another ? price : another ;
}
