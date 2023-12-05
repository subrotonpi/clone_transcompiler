def import _posixsubprocess
import subprocess
class Main ( object ) :
    def __init__ ( self , s ) :
        self.s = s
        self._int = int ( self.s )
    def main ( self , * args , ** kwargs ) :
        st , go = ( self._int , self._int ) , ( self._int , self._int )
        if st [ 1 ] > go [ 1 ] :
            buf = go
            go = st
            st = buf
        c = cmp ( self._int , self._int )
        p = sorted ( st [ 0 ] < go [ 0 ] , c.reversed ( ) )
        for x , y in zip ( self._int , go [ 1 ] ) :
            if self._int <= x <= y <= self._int :
                p.append ( ( x , y ) )
        v = _posixsubprocess ( p [ st : ] , True , go , True )
        print ( ( abs ( st [ 0 ] - go [ 0 ] ) + abs ( st [ 1 ] - go [ 1 ] ) ) * 100L + v * - 20 + ( v == min ( go [ 1 ] - st [ 1 ] , abs ( go [ 0 ] - st [ 0 ] ) + 1 ) ) * 5 * math.pi )
    def lis ( self , p ) :
        if not p : return 0
        l = [ ]
        l.append ( p.pop ( ) [ 1 ] )
        while not p :
            y = p.pop ( ) [ 1 ]
            if l [ - 1 ] < y :
                l.append ( y )
            else :
                v = list ( l ) [ 1 ]
                if v < 0 :
                    l [ ~ v ] = y
        return len ( l )
