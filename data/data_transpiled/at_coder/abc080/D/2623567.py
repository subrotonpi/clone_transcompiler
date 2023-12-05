def _import ( ) : return sys.stdin.readline ( )
import readline
import readline
import readline
import readline
import sys
class Main ( ) :
    def __init__ ( self ) :
        self.N = int ( readline.readline ( ) )
        self.C = int ( readline.readline ( ) )
        self.N = int ( readline.readline ( ) )
        self.C = int ( readline.readline ( ) )
        self.N = int ( readline.readline ( ) )
        self.C = int ( readline.readline ( ) )
        self.N = int ( readline.readline ( ) )
        self.C = int ( readline.readline ( ) )
        self.N = int ( readline.readline ( ) )
        self.C = int ( readline.readline ( ) )
        self.N = int ( readline.readline ( ) )
        self.C = int ( readline.readline ( ) )
        self.N = int ( readline.readline ( ) )
        self.N = int ( readline.readline ( ) )
        self.C = int ( readline.readline.strip ( ) )
        self.N = int ( readline.readline ( ) )
        self.N = int ( readline.strip ( ) )
        self.N = int ( readline.strip ( ) )
    Note :./ main.py.uses.unsafe.operations.Note : Recompile.with - Xlint.details.copy ( )
    print ( solve ( ) )
    class Bangumi ( ) :
        def __init__ ( self , s , t , c ) :
            self.s = s
            self.t = t
            self.c = c
        def solve ( self ) :
            BC = [ ]
            for c in range ( C ) :
                BC.append ( [ ] )
            for b in B :
                BC [ b.c - 1 ].append ( b )
            for c in C :
                BC [ c ].sort ( key = lambda b : b.s )
            imos = [ 0 ] * 100001
            for c in C :
                prev = None
                for b in BC [ c ] :
                    if prev is not None and b.s == prev.t :
                        imos [ prev.t ] += 1
                        imos [ b.t ] -= 1
                    else