def import import sys , string
class Main ( object ) :
    def __init__ ( self ) :
        self.c = [ ]
    def __call__ ( self , * args ) :
        n = int ( args [ 0 ] )
        a = [ ]
        for i in range ( n ) :
            a.append ( i )
        self.c = [ False ] * 100001
        ret = 0
        rgt = 0
        for lft in range ( n ) :
            while rgt < n and not self.c [ a [ rgt ] ] :
                self.c [ a [ rgt ] ] = True
                rgt += 1
            ret = max ( ret , rgt - lft )
            if lft == rgt :
                rgt += 1
            self.c [ a [ lft ] ] = False
        print ( ret )
