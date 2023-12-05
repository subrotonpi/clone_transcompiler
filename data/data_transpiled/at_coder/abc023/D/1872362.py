def import import os , sys
from io import BytesIO
from itertools import izip , repeat
class MyScanner ( Scanner ) :
    def __init__ ( self ) :
        sc = MyScanner ( )
        self.out = BytesIO ( )
        n = sc.__next__ ( )
        h , s = [ sc.__next__ ( ) for _ in range ( n ) ]
        p , f = 1 << 50 , 0
        while p - f > 1 :
            x = ( p + f ) // 2
            a = [ - 1 if x < h [ i ] else ( x - h [ i ] ) // s [ i ] for i in range ( n ) ]
            a.sort ( )
            ok = True
            for i in range ( n ) :
                if a [ i ] < i :
                    ok = False
                    break
            if ok :
                p , f = x , x
        self.out.write ( p )
        self.out.close ( )
    def __next__ ( self ) :
        while not isinstance ( self.out , BytesIO ) or not hasattr ( self.out , "__iter__" ) :
            try :
                self.out.__next__ ( )
            except StopIteration :
                pass
        return next ( self.out )
    def __next__ ( self ) :
        while not isinstance ( self.out , bytes ) or not hasattr ( self.out , "__iter__" ) :
            try :
                self.out.__next__ ( )
            except StopIteration :
                pass
        return next ( self.out )
    def __next__ ( self ) :
        while not isinstance ( self.out , bytes ) or not hasattr ( self.out , "__iter__" ) :
            try :
                self.out.__next__ ( )
            except StopIteration :
                pass
        return next ( self.out )
