def contest ( ) :
    import os
    import sys
    import math
    class ManageYourEnergy ( object ) :
        PROBLEM_NAME = "energy"
        WORK_DIR = r"D:\Gcj\"+PROBLEM_NAME+" \ "
        class Pair :
            def __init__ ( self , value , pos ) :
                self.value = value
                self.pos = pos
            def __lt__ ( self , other ) :
                if self.value < other.value : return 1
                if self.value > other.value : return - 1
                return 0
        def solve ( self , file ) :
            E = self.value
            R = self.pos
            if R > E : R = E
            N = self.N
            v = [ ]
            p = [ ]
            for i in range ( N ) :
                v.append ( self.value )
                p.append ( ( v [ i ] , i ) )
            was = [ False ] * N
            from = [ ]
            to = [ ]
            p.sort ( )
            ans = 0
            for i in range ( N ) :
                pos = p [ i ].pos
                from .append ( E )
                for j in range ( pos ) :
                    if was [ j ] : from .append ( min ( from [ pos ] , to [ j ] + ( pos - j ) * R ) )
                    to.append ( 0 )
                    for j in range ( pos + 1 , N ) :
                        if was [ j ] : to.append ( max ( to [ pos ] , from [ j ] - ( j - pos ) * R ) )
                        ans += ( from [ pos ] - to [ pos ] ) * p [ i ].value
                        was [ j ] = True
            print ( ans )
    def main ( ) :
        with open ( WORK_DIR + "input.txt" , "w" ) as sc :
            for case_num in range ( 0 , case_num ) :
                print ( "Processing test case " + str ( case_num + 1 ) , file = sc )
                print ( "Case #" + str ( case_num + 1 ) , file = sc )
    main ( )
