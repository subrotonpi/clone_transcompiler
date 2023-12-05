def _import ( ) : return _import ( )
from time import gmtime , weekday , date , set , set , skip
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( self )
        N = len ( self.s )
        dates = set ( )
        for i in range ( N ) :
            d = self.s.split ( '/' )
            month = int ( d [ 0 ] )
            day = int ( d [ 1 ] )
            dates.add ( date ( 2012 , month , day ) )
        current = date ( 2012 , 1 , 1 )
        length = 0
        carryover = 0
        max = 0
        for i in range ( 366 ) :
            dow = current.weekday ( )
            if dow == weekday.SATURDAY or dow == weekday.SUNDAY :
                if current in dates :
                    carryover += 1
                length += 1
            elif current in dates :
                length += 1
            elif carryover > 0 :
                length += 1
                carryover -= 1
            else :
                max = max ( length , max )
                length = 0
            debug ( current , max , length )
            current = current + timedelta ( 1 )
        max = max ( length , max )
        print ( max )
    def debug ( * x ) :
        if is_debug :
            print ( " ".join ( str ( x ) ) , file = sys.stderr )
    class Scanner ( object ) :
        def __init__ ( self ) :
            Scanner ( self )
        def __init__ ( self ) :
            Scanner ( self )
        def __init__ ( self ) :
            Scanner ( self )
        def __init__ ( self ) :
            Scanner ( self )
        def read ( self ) :
            num = 0
            read = skip
            do :
                num = num * 10 + ( read - 0x30 )
            while ( read > 0x20 ) :
                read = read
            while ( read > 0x20 ) :
                read = read
    return Main ( )
