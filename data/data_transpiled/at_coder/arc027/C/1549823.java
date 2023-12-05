public static void input ( int X , int Y ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Tickets > tickets = new ArrayList < > ( Arrays . asList ( new Tickets ( ) ) ) ;
  tickets . sort ( Comparator . comparing ( Tickets :: get ) ) ;
  int b = ( X + Y + 1 ) ;
  int maxN = b * X + X + Y ;
  int [ ] dp = new int [ maxN + 1 ] ;
  Set < Integer > dpSet = new HashSet < > ( ) ;
  Method add = dpSet . add ;
  add . invoke ( maxN ) ;
  for ( Tickets t : tickets ) {
    int h = t . hashCode ( ) ;
    for ( int n : new ArrayList < > ( dpSet ) ) {
      int x = n / b ;
      int y = n % b ;
      if ( x > 0 && y >= t ) {
        int newn = ( x - 1 ) * b + y - t ;
        int newv = dp [ n ] + h ;
        if ( newv > dp [ newn ] ) {
          dp [ newn ] = newv ;
          if ( x > 1 && y > t ) {
            add . invoke ( newn ) ;
          }
        }
      }
    }
  }
  System . out . println ( max ( dp ) ) ;
}
