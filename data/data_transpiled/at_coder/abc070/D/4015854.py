def _import ( ) : return [ ]
import time
import Queue
import sys
import time
import time
import Scanner
class Main ( object ) :
    INF = 100000000000000l
    WHITE = 0
    GRAY = 1
    BLACK = 2
    def __init__ ( self , id , cost ) :
        self.id = id
        self.cost = cost
class MyComparator ( Node ) :
    def __init__ ( self , v1 , v2 ) :
        self.id = v1
        self.cost = cost
    def compare ( self , v1 , v2 ) :
        if v1.cost < v2.cost :
            return - 1
        elif v1.cost == v2.cost :
            return 1
        else :
            return 0
    def __init__ ( self , v1 , v2 ) :
        self.from , v1 , v2 = v1
        self.cost = v2
class Edge ( Node ) :
    def __init__ ( self , v1 , v2 ) :
        self.from , v1 , v2 = v2
        self.cost = v2
    def compare ( self , v1 , v2 ) :
        if v1.cost < v2.cost :
            return 0
        else :
            return 1
    def compare ( self , v1 , v2 ) :
        self.from , v1 , v2 = v2
        self.cost = v1.cost
class MyComparator ( Node ) :
    def __init__ ( self , v1 , v2 ) :
        self.from , v2 , v2 = v2
        self.cost = v2.cost
class MyComparator ( Node ) :
    def __init__ ( self , v1 , v2 ) :
        self.from , v1 , v2 = v2
        self.cost = v2.cost
class MyComparator ( Node ) :
    def __init__ ( self , v1 , v2 ) :
        self.from , v2 , v2 = v2
        self.cost = v2.cost
x = [ ]
y = [ ]
for i in range ( Q ) :
    x.append ( MyComparator ( ).compare ( x , y ) )
    y.append ( MyComparator ( ).compare ( x , y ) )
dijkstra ( K )
for i in range ( Q ) :
    ans = d [ x [ i ] ] + d [ y [