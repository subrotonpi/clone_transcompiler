def import import string
class B ( object ) :
    def __init__ ( self ) :
        self.T = int ( self.T )
        for t in range ( self.T ) :
            print ( "Case #%d: %d" % ( t + 1 , self.solve ( ) ) )
    def solve ( self ) :
        s = self.solve ( )
        c = s.split ( )
        for i in range ( 1 , len ( c ) ) :
            if c [ i - 1 ] > c [ i ] :
                c [ i - 1 ] -= 1
                while i - 2 >= 0 and c [ i - 1 ] < c [ i - 2 ] :
                    i -= 1
                    c [ i - 1 ] -= 1
                while i < len ( c ) :
                    c [ i ] += '9'
        return long ( ''.join ( c ) )
