def import java.util.regex
import re
class x ( object ) :
    class Directory ( object ) :
        def __init__ ( self , cst ) :
            self.h = { }
            self.st = cst
        def create ( self , name , sst ) :
            c = self.h.get ( name )
            if c : return c
            c = Directory ( sst )
            self.h [ name ] = c
            return c
        def count ( self , lst ) :
            cur = 0
            if self.st > lst : cur += 1
            for z in self.h.values ( ) : cur += z.count ( lst )
            return cur
    def main ( args ) :
        with open ( args [ 0 ] ) as f :
            t = int ( f.read ( ) )
            for tt in range ( 1 , t + 1 ) :
                r = Directory ( 0 )
                n , m = int ( f.read ( ) ) , int ( f.read ( ) )
                for i in range ( 1 , n + m + 1 ) :
                    a = f.read ( ).split ( '/' )
                    c = r
                    for j in range ( 1 , len ( a ) ) :
                        c = c.create ( a [ j ] , i )
                print ( 'Case #%d: %d' % ( tt , r.count ( n ) ) )
