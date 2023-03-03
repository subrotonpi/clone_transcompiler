def _import ( ) : return sys.stdin
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
import getopt
import time
import sys
class Main ( object ) :
    def __init__ ( self , f , g , nla = 0 ) :
        self.f = f
        self.g = g
        self.nla = nla
        self.nl = 0
    def solve ( self ) :
        N , M , S = self.ni ( )
        G = [ [ ] for _ in range ( N ) ]
        for u , v in self.ni ( ) :
            G [ u ].append ( v )
            G [ v ].append ( u )
    def Q ( self ) :
        Q.append ( ( S - 1 , S - 1 ) )
        max = [ ]
        used = [ False ]
        while not Q.empty ( ) :
            p = Q.pop ( )
            if used [ p [ 0 ] ] :
                continue
            used [ p [ 0 ] ] = True
            max.append ( max [ p [ 0 ] ] )
            for next in G [ p [ 0 ] ] :
                Q.append ( ( next , min ( max [ p [ 0 ] ] , max [ p [ 0 ] ] ) ) )
        for i in range ( N ) :
            if i <= max [ i ] :
                print ( i + 1 )
    class Pair ( object ) :
        def __init__ ( self , x , y ) :
            self.x = x
            self.y = y
        def __lt__ ( self , other ) :
            return self.x < other
        def __repr__ ( self ) :
            return "<%s>" % repr ( self.x )
    ns = ( )
    while ns.isdigit ( ) :
        ns = ( ns.isdigit ( ) and ns.isdigit ( ) )
    ns = ( ns.split ( ) [ 0 ] , ns.split ( ) [ 1 ] )
    return ns
