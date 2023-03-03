def import import string , defaultdict
from collections import defaultdict
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        a = [ ]
        dict = defaultdict ( int )
        for i in range ( n ) :
            a.append ( sc.read ( ) )
            dict [ a [ i ] ] = 0
        sc.close ( )
        cnt = 0
        for key in dict :
            dict [ key ] += cnt
            cnt += 1
        for i in range ( n ) :
            print ( dict [ a [ i ] ] )
