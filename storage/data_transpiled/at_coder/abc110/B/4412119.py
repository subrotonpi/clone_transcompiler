def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.m = int ( self.m )
        self.x = int ( self.x )
        self.y = int ( self.y )
        xa = [ ]
        ya = [ ]
        for i in range ( self.n ) :
            xa.append ( self.x )
        for i in range ( self.m ) :
            ya.append ( self.y )
        ans = False
        for i in range ( self.x + 1 , self.y + 1 ) :
            flag = False
            for j in range ( self.n ) :
                if xa [ j ] >= i :
                    flag = True
            for j in range ( self.m ) :
                if ya [ j ] < i :
                    flag = True
            if flag == False :
                ans = True
                break
        if ans :
            sys.stdout.write ( "No War\n" )
        else :
            sys.stdout.write ( "War\n" )
