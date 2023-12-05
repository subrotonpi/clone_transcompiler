def import __main__
from time import sleep
class Pair ( object ) :
    def __init__ ( self , i , j ) :
        self.a = i
        self.cnt = j
    def __lt__ ( self , p ) :
        if self.cnt >= 2 and self.cnt >= 2 and self.a < p.a : return - 1
        if self.cnt < 2 and p.cnt >= 2 : return - 1
        return 1
class Main ( object ) :
    def __init__ ( self , a , cnt ) :
        Scanner ( ).__init__ ( self )
        N = int ( self.a )
        map = { }
        l = [ ]
        for i in range ( N ) :
            c = int ( sc.next ( ) )
            if c not in map :
                p = Pair ( c , 1 )
                map [ c ] = p
                l.append ( p )
            else :
                p = map [ c ]
                p.cnt += 1
        l.sort ( )
        l = l [ : : - 1 ]
        p1 = l [ - 1 ]
        p2 = l [ - 2 ]
        res = 0
        if p1.cnt >= 4 :
            res = p1.a * p1.a
        elif p1.cnt >= 2 and p2.cnt >= 2 :
            res = p1.a * p2.a
        print ( res )
