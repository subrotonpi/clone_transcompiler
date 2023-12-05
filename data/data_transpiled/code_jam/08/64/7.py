def SPACETOKEN D SPACETOKEN = SPACETOKEN [ ] STRNEWLINE SPACETOKEN """
import sys
class Edge ( object ) :
    def __init__ ( self , a , b ) :
        self.src , self.dst = a , b
    def __repr__ ( self ) :
        return " % d SPACETOKEN - SPACETOKEN % d " % ( self.src , self.dst )
    def swap ( self , i , a ) :
        self.t = a [ i ]
        self.a = t
    def next_permutation ( self ) :
        self.n = len ( self.a )
        for i in range ( 1 , C ) :
            self.N = self.n
            self.elist = [ ]
            large = [ ]
            for j in range ( self.N - 1 ) :
                a = self.a [ j ]
                b = self.b
                self.a -= 1
                self.b -= 1
                self.elist.append ( ( a , b ) )
                large [ a ] [ b ] = large [ b ] [ a ] = True
            self.M = self.n
            self.smallelist = [ ]
            for j in range ( self.M - 1 ) :
                a = self.a [ j ]
                b = self.b [ j ]
                self.a -= 1
                self.b -= 1
                self.smallelist.append ( ( a , b ) )
            f = False
            for j in range ( ( 1 << self.N ) ) :
                if int ( j ) != self.M :
                    continue
                uedge = [ ]
                num = [ ]
                for k , e in self.elist :
                    if ( j & ( 1 << e.src ) ) != 0 and ( j & ( 1 << e.dst ) ) != 0 :
                        uedge.append ( e )
                        num.append ( e.src )
                        num.append ( e.dst )
                if len ( uedge ) != len ( smallelist ) :
                    continue
                P = [ ]
                f = True
                for k , e in self.sorted ( num ) :
                    if not f :
                        f = False
                if f :
                    print ( " Case SPACETOKEN # % d : SPACETOKEN YES \n " % ( self.src , self.dst ) )
            