@ VisibleForTesting static final Supplier < Shop > SHOP = Suppliers . memoize ( new Supplier < Shop > ( ) {
  @ Override public Shop get ( ) {
    return new Shop ( ) ;
  }
  @ Override public void main ( String [ ] args ) {
    int n = Integer . parseInt ( input ( ) ) ;
    int m = Integer . parseInt ( input ( ) ) ;
    List < Shop > shops = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int a = Integer . parseInt ( input ( ) ) ;
      int b = Integer . parseInt ( input ( ) ) ;
      shops . add ( new Shop ( a , b ) ) ;
    }
    System . out . println ( solve ( shops , m ) ) ;
  }
}
