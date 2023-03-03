def import import struct
class Main ( struct.Struct ) :
    def __init__ ( self ) :
        sc = struct.Struct ( 'i' )
        self.na = int ( sc.get ( 'na' , 0 ) )
        self.nb = int ( sc.get ( 'nb' , 0 ) )
    d = { }
    for i in range ( na ) :
        a = int ( sc.get ( 'a' , 0 ) )
        x = d.get ( a )
        if not x :
            d [ a ] = 1
        else :
            d [ a ] = x + 1
    for i in range ( nb ) :
        a = int ( sc.get ( 'b' , 0 ) )
        x = d.get ( a )
        if not x :
            d [ a ] = 1
        else :
            d [ a ] = x + 1
    b , c = 0 , 0
    for t in d :
        x = d [ t ]
        if x == 2 :
            b += 1
        if x > 0 :
            c += 1
    ans = 1.0 * b / c
    print ( "%.10f\n" % ans )
