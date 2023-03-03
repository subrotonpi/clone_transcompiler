def import readline
import sys
import random
class Main ( object ) :
    def __init__ ( self ) :
        sc = MyScanner ( )
        n = sc.__next__ ( )
        m = sc.__next__ ( )
        a = [ ]
        c = [ ]
        b = [ ]
        d = [ ]
        for i in range ( n ) :
            a.append ( sc.__next__ ( ) )
        for j in range ( m ) :
            c.append ( sc.__next__ ( ) )
            d.append ( sc.__next__ ( ) )
        ans = [ ]
        for i in range ( n ) :
            dis = 400000000
            ans.append ( 60 )
            for j in range ( m ) :
                if dis > abs ( a [ i ] - c [ j ] ) + abs ( b [ i ] - d [ j ] ) or ( dis == abs ( a [ i ] - c [ j ] ) + abs ( b [ i ] - d [ j ] ) and ans [ i ] > j + 1 ) :
                    ans.append ( j + 1 )
                    dis = min ( dis , abs ( a [ i ] - c [ j ] ) + abs ( b [ i ] - d [ j ] ) )
        for i in range ( n ) :
            print ( ans [ i ] )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return a [ l - 1 ]
    global stdout
    stdout = open ( "/dev/null" , "w" )
    for line in stdout.readlines ( ) :
        while not line or not line.startswith ( "#" ) :
            try :
                line = line.split ( )
            except :
                pass
    return stdout
