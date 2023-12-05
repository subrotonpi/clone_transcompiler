def _import ( ) : return [ int ( next ( ) ) for i in range ( N ) ]
def _import ( ) :
    sc = _import ( )
    N = sc.__next__ ( )
    A = sc.__next__ ( )
    print ( solve ( ) )
def solve ( ) :
    if A [ 0 ] != A [ N - 1 ] :
        B = A
    else :
        kireme = _find_kireme ( )
        if kireme == - 1 :
            return - 1
        B = A [ kireme : ]
        del A [ : kireme ]
    max_cont = 0
    prev = - 1
    cont = 0
    for i in range ( N ) :
        if B [ i ] == prev :
            cont += 1
        else :
            cont = 1
        max_cont = max ( cont , max_cont )
        prev = B [ i ]
    max_cont = max ( cont , max_cont )
    if max_cont <= 2 :
        return 1
    else :
        return max_cont // 2 if max_cont % 2 == 0 else max_cont // 2 + 1
def _find_kireme ( ) :
    for i in range ( 1 , N ) :
        if A [ i - 1 ] != A [ i ] :
            return i
    return - 1
from itertools import chain
class FastScanner ( object ) :
    def __init__ ( self , stream = None ) :
        self.stream = stream
        self.stream = stream
        self.next = None
    def __next__ ( self ) :
        if self.stream is None or not self.stream.readline ( ) :
            try :
                self.stream = stream.__next__ ( )
            except StopIteration :
                raise StopIteration
        return next ( self.stream )
    def __next__ ( self ) :
        if self.stream is None or not self.stream.readline ( ) :
            try :
                self.stream = stream.__next__ ( )
            except StopIteration :
                raise StopIteration
        return next ( self.stream )
return FastScanner ( )
