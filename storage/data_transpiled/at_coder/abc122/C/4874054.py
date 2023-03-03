def import sc
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdout
    def main ( self ) :
        n , q = sc.regs [ 0 ]
        s = sc.regs [ 1 ]
        AC = [ 1 ]
        for i in range ( 1 , n ) :
            if s [ i - 1 ] == 'A' and s [ i ] == 'C' :
                AC.append ( 1 )
        for i in range ( 1 , n + 1 ) :
            AC [ i ] += AC [ i - 1 ]
        for i in range ( q ) :
            l , r = sc.regs [ 0 ]
            k = 0
            if r < n and s [ r - 1 ] == 'A' and s [ r ] == 'C' : k += 1
            print ( max ( 0 , AC [ r ] - AC [ l - 1 ] - k ) , end = ' ' )
