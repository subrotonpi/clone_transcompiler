def _import ( ) : return _import ( )
import sys
import time
import math
class Main ( object ) :
    def __init__ ( self , l , r ) :
        self.l = l
        self.r = r
        self.n = int ( self.l )
    def __repr__ ( self ) :
        return '[%d,%d]' % ( l , r )
class Interval ( object ) :
    def __init__ ( self , l , r ) :
        self.l = l
        self.r = r
        self.n = int ( self.l )
    def __repr__ ( self ) :
        return '[%d,%d]' % ( l , r )
intervals = [ ]
l_max = PriorityQueue ( lambda : l.l , lambda : r )
r_min = PriorityQueue ( lambda : r.r , lambda : l.l , lambda : r )
left_count = right_count = 0
for i in range ( n ) :
    s = f.readline ( ).split ( )
    l , r = map ( int , s [ 0 ].split ( ) )
    intervals.append ( ( l , r , i ) )
    l_max.put ( intervals [ i ] )
    r_min.put ( intervals [ i ] )
    if r < 0 :
        left_count += 1
    elif l > 0 :
        right_count += 1
vis = [ False ] * n
right = right_count > left_count
sum = 0
pos = 0
for i in range ( n ) :
    if right :
        curr = l_max.get ( )
        while vis [ curr.id ] :
            curr = l_max.get ( )
        vis [ curr.id ] = True
        if curr.l <= pos <= curr.r :
            sum += 0
        else :
            if curr.l > pos :
                sum += curr.l - pos
                pos = curr.l
            else :
                sum += pos - curr.r
                pos = curr.r
    else :
        curr = r_min.get ( )
        while vis [ curr.id ] :
            curr = r_min.get ( )
        vis [ curr.id ] = True
    print ( sum )
