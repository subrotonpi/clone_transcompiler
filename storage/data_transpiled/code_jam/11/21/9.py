def main ( argv ) :
    import os
    import sys
    import getopt
    class A ( object ) :
        def __init__ ( self , name , t ) :
            super ( A , self ).__init__ ( name , t )
        def __init__ ( self , name , t ) :
            self.name = name
            self.t = t
            self.name = name
            self.table = [ ]
        def solve ( n , table ) :
            for i in range ( n ) :
                self.table [ i ] = table [ i ]
        def write ( self , out ) :
            self.out.write ( out )
    def solve ( n , table ) :
        for i in range ( n ) :
            self.game [ i ] += 1
    game = [ ]
    wp = [ ]
    owp = [ ]
    oowp = [ ]
    for i in range ( n ) :
        for j in range ( n ) :
            if i in table [ j ] :
                self.game [ i ] += 1
            if i == 1 :
                self.game [ i ] += 1
    for i in range ( n ) :
        opnum = 0
        for j in range ( n ) :
            if i in table [ j ] :
                opnum += 1
                self.owp [ i ] += ( self.game [ i ] - int ( table [ j ] - '0' ) ) / ( self.game [ i ] - 1 )
        owp [ i ] /= opnum
    for i in range ( n ) :
        opnum = 0
        for j in range ( n ) :
            if i in table [ j ] :
                opnum += 1
                self.owp [ i ] += 1
        wp [ i ] /= game_num [ i ]
        oowp [ i ] /= opnum
    res = [ 0.25 * self.wp [ i ] + 0.5 * self.owp [ i ] + 0.25 * self.oowp [ i ] for i in range ( n ) ]
    return res
