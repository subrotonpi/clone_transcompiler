def import _A , sd
class A ( object ) :
    def __init__ ( self , a , b ) :
        if b == 0 :
            return a
        c = a % b
        return sd ( b , c )
    def run ( self ) :
        with open ( "/" ) as f :
            T = f.read ( )
            for t in range ( 1 , T + 1 ) :
                data = f.read ( )
                strs = data.split ( "/" )
                a = int ( strs [ 0 ] )
                b = int ( strs [ 1 ] )
                s = sd ( a , b )
                a /= s
                b /= s
                if ( b & ( b - 1 ) ) == 0 :
                    res = 0
                    for res in range ( b ) :
                        a *= 2
                    print ( "Case #%d: %d" % ( t , res ) )
                else :
                    print ( "Case #%d: impossible" % t )
