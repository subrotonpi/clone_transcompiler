def import readline
import readline
import readline
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        sc = readline
        pr = readline.readline
        n = sc.__next__ ( )
        k = sc.__next__ ( )
        a = [ ]
        sum = [ ]
        for i in range ( n + 1 ) :
            a.append ( sc.__next__ ( ) )
            sum.append ( sum [ i ] + a [ i ] )
        if sum [ n ] == k :
            pr ( 1 )
            pr.close ( )
            sc.close ( )
            return
    def __init__ ( self , out ) :
        self.out = out
    def __repr__ ( self ) :
        return '<%s>' % repr ( self.out )
    def readline ( self ) :
        return readline.readline ( )
    def readline ( self ) :
        return readline.strip ( )
    def readline ( self ) :
        return readline
class Printer ( object ) :
    def __init__ ( self , out ) :
        self.out = out
INF = int ( sys.maxint / 2 )
for i in range ( 0 , n + 1 ) :
    dp = [ i ]
    dp [ 0 ] = dp [ i - 1 ] [ 0 ]
    for j in range ( 1 , i + 1 ) :
        if i == 1 :
            value = 0
        else :
            value = float ( dp [ i - 1 ] [ j - 1 ] ) / sum [ i - 1 ]
        tmp = int ( math.floor ( sum [ i ] * value + 1 ) )
        if dp [ i - 1 ] [ j - 1 ] == INF :
            dp [ i ] [ j ] = dp [ i - 1 ] [ j ]
        else :
            dp [ i ] [ j ] = min ( dp [ i - 1 ] [ j ] , tmp )
    for j in range ( n , - 1 , - 1 ) :
        if dp [ n ] [ j ] <= k :
            pr ( j )
            break
    pr.close ( )
    sc.close ( )
from readline import readline
for line in readline ( ) :
    pr ( line )
