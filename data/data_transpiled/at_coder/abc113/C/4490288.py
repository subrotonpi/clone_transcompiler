def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.number
        M = sc.number
        cities = [ ]
        for i in range ( M ) :
            cities.append ( City ( i , sc.number , sc.number ) )
        cities.sort ( lambda x , y : cmp ( x.p , y.p ) )
        ids = [ ]
        count = 0
        for i , c in enumerate ( cities ) :
            if i == 0 or c.p != cities [ i - 1 ].p :
                count = 0
            else :
                count += 1
            ids.append ( padding0 ( c.p , 6 ) + padding0 ( count + 1 , 6 ) )
        for i in range ( M ) :
            print ( ids [ i ] )
    def padding0 ( n , m ) :
        s = str ( n )
        while m - len ( s ) :
            s = "0" + s
        return s
