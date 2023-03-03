def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n , m = sc.readline ( ).split ( )
        dict = { }
        sum = [ 0 ] * ( n + 1 )
        ans = 0
        sum [ 0 ] = 0
        dict [ 0 ] = 1
        for i in range ( 1 , n + 1 ) :
            sum [ i ] = ( sum [ i - 1 ] + sc.readline ( ) ) % m
            if sum [ i ] not in dict :
                dict [ sum [ i ] ] = 1
            else :
                dict [ sum [ i ] ] = dict [ sum [ i ] ] + 1
            ans += dict [ sum [ i ] ] - 1
        print ( ans )
