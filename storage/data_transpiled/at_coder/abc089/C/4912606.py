def _import ( ) : return _import ( )
import math
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.c = 0
        self.k = 0
        self.lef = 0
        self.rig = 0
        self.s = ''
        self.anss = ''
        self.times = [ ]
        self.w = ''
        self.visit = [ ]
        self.placenow = False
        return
    def main ( self ) :
        sc = sys.stdin
        self.n = sc.n
        self.ans = 0
        st = [ ]
        m = [ ]
        for i in range ( self.n ) :
            st.append ( sc.readline ( ) )
            if st [ 0 ] == 'M' :
                m [ 0 ] += 1
            if st [ 0 ] == 'A' :
                m [ 1 ] += 1
            if st [ 0 ] == 'R' :
                m [ 2 ] += 1
            if st [ 0 ] == 'C' :
                m [ 3 ] += 1
            if st [ 0 ] == 'H' :
                m [ 4 ] += 1
        print ( m [ 0 ] * m [ 1 ] * ( m [ 2 ] + m [ 3 ] + m [ 4 ] ) + m [ 0 ] * m [ 2 ] * ( m [ 3 ] + m [ 4 ] ) + m [ 1 ] * m [ 3 ] * m [ 4 ] + m [ 2 ] * m [ 3 ] * m [ 4 ] )
        sc.close ( )
    def gcd ( self , a , b ) :
        if self.a < b :
            tmpp = self.a
            self.b = tmpp
        if self.b == 0 :
            return a
        else :
            return gcd ( b , self.a % b )
    def lcm ( self , a , b ) :
        gcd = gcd ( a , b )
        return a / gcd ( b )
    def gcd ( self , a , b ) :
        return gcd ( a , b )
    def lcm ( self , a , b ) :
        return gcd ( a , b )
