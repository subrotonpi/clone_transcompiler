def import readline
import sys
import os
import sys
class A ( object ) :
    def __init__ ( self , f , st ) :
        self.f = f
        self.st = st
        self.test = read_int ( )
        for t in range ( 1 , test + 1 ) :
            print ( "Case #%d:" % t , end = ' ' )
            num = read_int ( )
            arr = [ Level ( read_int ( ) , i ) for i in range ( num ) ]
            for i in range ( num ) :
                arr [ i ].percent = read_float ( )
            so_far = 0
            flag = True
            while flag :
                flag = False
                for j in range ( num - 1 ) :
                    if arr [ j ].time + arr [ j + 1 ].time * ( 1 - arr [ j ].percent / 100.0 ) > arr [ j ].time * ( 1 - arr [ j + 1 ].percent / 100.0 ) + arr [ j + 1 ].time :
                        temp = arr [ j ]
                        arr [ j ] = arr [ j + 1 ]
                        arr [ j + 1 ] = temp
                        flag = True
            for i in range ( num ) :
                print ( " %d" % arr [ i ].index , end = ' ' )
            print ( )
    def readline ( self ) :
        return sys.stdin.readline ( )
    def read_token ( self ) :
        while not st or not st :
            st = [ ]
        return st [ 0 ]
    class Level ( object ) :
        def __init__ ( self , t , i ) :
            self.time = t
            self.index = i
            self.percent = - 1
