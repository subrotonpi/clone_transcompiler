def import java.io io
import readline
import sys
from itertools import count , repeat
class Main ( object ) :
    def __init__ ( self , n ) :
        super ( Main , self ).__init__ ( n )
        self.n = n
    def run ( self ) :
        sc = sys.stdin
        n = sc.__next__ ( )
        counts = defaultdict ( int )
        for i in range ( n ) :
            a = sc.__next__ ( )
            if a not in counts :
                counts [ a ] += 1
            else :
                counts [ a ] = counts [ a ] + 1
        first = second = None
        for key , value in counts.items ( ) :
            if value >= 4 :
                if first is None :
                    first = key
                second = key
                break
            elif value >= 2 :
                if first is None :
                    first = key
                else :
                    second = key
                    break
        print ( long ( first ) * second )
class FastReader ( io.BufferedReader ) :
    def readline ( self ) :
        while not isinstance ( self , str ) or not isinstance ( self , bytes ) :
            try :
                self.next = readline ( self )
            except StopIteration :
                pass
        return FastReader ( )
    def __next__ ( self ) :
        while not isinstance ( self , str ) or not isinstance ( self , bytes ) :
            try :
                self.next = __next__
            except StopIteration :
                break
        return int ( next ( self ) )
    def __next__ ( self ) :
        return long ( next ( self ) )
    def nextDouble _ ( self ) :
        return double ( next ( self ) )
    def readline ( self ) :
        while not isinstance ( self , str ) or not isinstance ( self , bytes ) :
            try :
                self.next = __next__
            except StopIteration :
                break
        return self.next
