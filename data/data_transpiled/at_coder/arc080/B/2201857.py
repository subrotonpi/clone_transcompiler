def import import time
import sys
import os
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = MyScanner ( )
        f = sys.stdout
        self.TIME_START = time.time ( )
        Task.solve ( sc , f )
        self.TIME_END = time.time ( )
        f.close ( )
    def solve ( self , sc , f ) :
        n = sc.n
        m = sc.m
        grid = [ ]
        k = sc.k
        x , y = - 1 , 0
        dir = 1
        for i in range ( 1 , k + 1 ) :
            count = sc.count
            for j in range ( count ) :
                if dir == 1 :
                    if x + 1 < n :
                        x += 1
                    else :
                        y += 1
                        dir = 2
                    grid.append ( [ i , j ] )
                elif dir == 2 :
                    if x - 1 >= 0 :
                        x -= 1
                    else :
                        y += 1
                        dir = 1
                    grid.append ( [ i , j ] )
        for i in range ( n ) :
            for j in range ( m ) :
                f.write ( "%s " % grid [ i ] [ j ] )
            f.write ( "\n" )
    class MyScanner ( object ) :
        def __init__ ( self , s ) :
            self.sc = sc
            self.f = f
        def readline ( self ) :
            while not self.sc or not self.sc :
                self.sc = self.sc
            return self.sc
        def readline ( self ) :
            while self.sc or not self.sc :
                self.sc = self.sc
            return self.sc
        def readline ( self ) :
            while self.sc or not self.sc :
                self.sc = self.sc
            return self.sc
        def readline ( self ) :
            return self.sc
        def readline ( self ) :
            return self.sc
    return Main ( )
