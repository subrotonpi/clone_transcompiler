def import import _strptime
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        money_sum = 0
        for i in range ( N ) :
            list = sc.readline ( ).split ( )
            money = float ( list [ 0 ] )
            value = list [ 1 ]
            if value == 'JPY' :
                money_sum += money
            else :
                money_sum += money * 380000.0
        print ( money_sum )
