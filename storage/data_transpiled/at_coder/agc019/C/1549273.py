def import _pylab
import pylab
import matplotlib.pyplot as plt
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
    def g ( self ) :
        return int ( self.s.readline ( ) )
    def main ( self , * args , ** kwargs ) :
        st , go = Point ( g ( ) , g ( ) ) , Point ( g ( ) , g ( ) )
        if st.y > go.y :
            buf = go
            go = st
            st = buf
        c = itemgetter ( 0 )
        p = sorted ( st if st.x < go.x else c.reversed ( ) )
        for x , y in zip ( self.s , go ) :
            if st.y <= y <= go.y :
                p.append ( ( x , y ) )
        v = lis ( p [ st : ] , True , go , True )
        print ( ( abs ( st.x - go.x ) + abs ( st.y - go.y ) ) * 100L + v * - 20 + ( v == min ( go.y - st.y , abs ( go.x - st.x ) ) + 1 ) * 5 * np.pi )
    def lis ( self ) :
        l = [ int ( 0 ) ]
        while not self.s.readline ( ).strip ( ) :
            y = self.s.readline ( ).strip ( )
            if l [ - 1 ] < y :
                l.append ( y )
            else :
                v = list ( l ) [ y ]
                if v < 0 :
                    l [ ~ v ] = y
        return len ( l ) - 1
